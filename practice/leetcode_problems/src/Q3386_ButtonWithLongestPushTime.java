public class Q3386_ButtonWithLongestPushTime {
    public int buttonWithLongestTime(int[][] events) {
        int maxTime = events[0][1];
        int leastIndex = events[0][0];

        for(int i=1;i<events.length;i++){
            int timeTaken = events[i][1] - events[i-1][1];

            if(timeTaken > maxTime || (timeTaken == maxTime && events[i][0] < leastIndex)){
                maxTime = timeTaken;
                leastIndex = events[i][0];
            }
        }

        return leastIndex;
    }
}