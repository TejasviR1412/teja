import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Q253_MeetingRooms_II {
    public static void main(String[] args) {
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};

        System.out.println(minMeetingRooms(intervals1));
        System.out.println(minMeetingRooms(intervals2));
    }

    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        var heap = new PriorityQueue<int[]>(Comparator.comparingInt(i -> i[1]));
        for (var meeting: intervals) {
            heap.offer(meeting);
            if (heap.peek()[1] <= meeting[0]) heap.poll();
        }
        return heap.size();
    }
}
