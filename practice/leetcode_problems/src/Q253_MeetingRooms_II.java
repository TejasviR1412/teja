import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q253_MeetingRooms_II {
    public static void main(String[] args) {
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};

        System.out.println(minMeetingRooms(intervals1));
        //System.out.println(minMeetingRooms(intervals2));
    }

    public static int minMeetingRooms(int[][] intervals) {
        int min = 0;
        int max = 0;

        for(int[] interval : intervals){
            min = Math.min(interval[0] , min);
            max = Math.max(interval[1],max);
        }

        int[] meetings = new int[max + 1];

        for(int[] interval : intervals){
            meetings[interval[0]] += 1;
            meetings[interval[1]] -= 1;
        }

        int count = 0;
        int runningSum = 0;

        for(int meeting : meetings){
            runningSum += meeting;
            count = Math.max(count,runningSum);
        }

        return count;
    }
}