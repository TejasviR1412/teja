import java.util.*;

public class Q355_DesignTwitter {
    private static int timeStamp = 0;

    /*Map to find if the user exists*/
    private Map<Integer,User> userMap;

    // Tweet link to next Tweet so that we can save a lot of time
    // when we execute getNewsFeed(userId)
    private class Tweet{
            public int id;
            public int time;
            public Tweet next;

            public Tweet(int id) {
                this.id = id;
                this.time = timeStamp++;
                next = null;
            }
    }

    // OO design so User can follow, unfollow and post itself
    private class User{
        public int id;
        public Set<Integer> followed;
        public Tweet tweet_head;

        public User(int id){
            this.id = id;
            followed = new HashSet<>();
            follow(id); //follow yourself first
            tweet_head = null;
        }

        public void follow(int id){
            followed.add(id);
        }

        public void unfollow(int id){
            followed.remove(id);
        }

        // everytime user post a new tweet,
        // add it to the head of tweet list.
        public void post(int id){
            Tweet tweet = new Tweet(id);
            tweet.next = tweet_head;
            tweet_head = tweet;
        }
    }

    //initialize your data structure
    public Q355_DesignTwitter() {
        userMap = new HashMap<>();
    }

    /**
     * Compose a new tweet
     */
    public void postTweet(int userId, int tweetId) {
        if(!userMap.containsKey(userId)){
            User user = new User(userId);
            userMap.put(userId,user);
        }
        userMap.get(userId).post(tweetId);
    }

    // Best part of this.
    // 1. get all tweets lists from one user including itself
    // and all people it followed.
    // 2. add all heads into a max heap.
    // Every time we poll a tweet with the largest time stamp from the heap,
    // then we add its next tweet into the heap.
    // So after adding all heads we only need to add 9 tweets at most into this
    // heap before we get the 10 most recent tweet.
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new LinkedList<>();

        if(!userMap.containsKey(userId))
            return result;

        Set<Integer> users = userMap.get(userId).followed;
        PriorityQueue<Tweet> q = new PriorityQueue<Tweet>(users.size(), (a,b)->(b.time-a.time));
        for(int user : users){
            Tweet t = userMap.get(user).tweet_head;

            // very important!
            // If we add null to the head we are screwed.
            if(t!=null)
                q.add(t);
        }

        int n=0;
        while(!q.isEmpty() && n<10){
            Tweet t = q.poll();
            result.add(t.id);
            n++;

            if(t.next!=null)
                q.add(t.next);
        }

        return result;
    }

    /** Follower follows a followee.
     * If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId)){
            User user = new User(followerId);
            userMap.put(followerId,user);
        }

        if(!userMap.containsKey(followeeId)){
            User user = new User(followeeId);
            userMap.put(followeeId,user);
        }
        userMap.get(followerId).follow(followeeId);
    }

    /** Follower unfollows a followee.
     * If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if(!userMap.containsKey(followerId) || followerId==followeeId)
            return;
        userMap.get(followerId).unfollow(followeeId);
    }
}