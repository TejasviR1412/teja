import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q3450_MaximumStudentsOnASingleBench {
    public static void main(String[] args) {
        int[][] students1 = {{1,2},{2,2},{3,3},{1,3},{2,3}};
        int[][] students2 = {{1,1},{2,1},{3,1},{4,2},{5,2}};
        int[][] students3 = {{1,1},{1,1}};
        int[][] students4 = {};

        System.out.println(maxStudentsOnBench(students1));
        System.out.println(maxStudentsOnBench(students2));
        System.out.println(maxStudentsOnBench(students3));
        System.out.println(maxStudentsOnBench(students4));
    }

    public static int maxStudentsOnBench(int[][] students) {
        if(students.length == 0)
            return 0;

        HashMap<Integer,HashSet<Integer>> hashMap = new HashMap<>();
        int maxStudentCount = Integer.MIN_VALUE;
        int studentID, benchID;

        for(int[] student : students){
            studentID = student[0];
            benchID = student[1];

            if(!hashMap.containsKey(student[1])){
                hashMap.put(benchID,new HashSet<>());
                hashMap.get(benchID).add(studentID);
            }else{
                hashMap.get(benchID).add(studentID);
            }

            maxStudentCount = Math.max(maxStudentCount , hashMap.get(student[1]).size());
        }

        return maxStudentCount;
    }
}
