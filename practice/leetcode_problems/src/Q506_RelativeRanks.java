import java.util.*;

public class Q506_RelativeRanks {
    public static void main(String[] args) {
        int[] scores1 = {5,4,3,2,1};
        int[] scores2 = {10,3,8,9,4};

        System.out.println(Arrays.toString(findRelativeRanks(scores1)));
        System.out.println(Arrays.toString(findRelativeRanks(scores2)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int length = score.length;
        String[] ranks = new String[length];

        //max heap
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for(int scores : score){
            integerPriorityQueue.add(scores);
        }

        Map<Integer,String> hashMap = new HashMap<>();
        int rank = 1;

        while(!integerPriorityQueue.isEmpty()){
            if(rank == 1){
                hashMap.put(integerPriorityQueue.poll(),"Gold Medal");
            }else if(rank == 2){
                hashMap.put(integerPriorityQueue.poll(),"Silver Medal");
            }else if(rank == 3){
                hashMap.put(integerPriorityQueue.poll(),"Bronze Medal");
            }else{
                hashMap.put(integerPriorityQueue.poll(),Integer.toString(rank));
            }
            rank++;
        }

        for(int i=0;i<hashMap.size();i++){
            ranks[i] = hashMap.get(score[i]);
        }

        return ranks;
    }
}
