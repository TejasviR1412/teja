import java.util.Arrays;
import java.util.PriorityQueue;

public class Q253_MeetingRooms_II {
    public static void main(String[] args) {
        int[][] intervals1 = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};

        System.out.println(minMeetingRooms(intervals1));
        System.out.println(minMeetingRooms(intervals2));
    }

    public static int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> i1[0] - i2[0]);
        var heap = new PriorityQueue<int[]>((i1, i2) -> i1[1] - i2[1]);
        for (var meeting: intervals) {
            heap.offer(meeting);
            if (heap.peek()[1] <= meeting[0]) heap.poll();
        }
        return heap.size();
    }
}
