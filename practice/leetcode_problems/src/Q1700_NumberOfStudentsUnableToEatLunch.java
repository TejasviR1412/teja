import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1700_NumberOfStudentsUnableToEatLunch {
    public static void main(String[] args) {
        int[] students1 = {1,1,0,0};
        int[] sandwiches1 = {0,1,0,1};

        int[] students2 = {1,1,1,0,0,1};
        int[] sandwiches2 = {1,0,0,0,1,1};

        System.out.println(countStudents_UsingStackAndQueue(students1,sandwiches1));
        System.out.println(countStudents_UsingStackAndQueue(students2,sandwiches2));
        System.out.println("****************************");
        System.out.println(countStudents_WithoutStackAndQueue(students1,sandwiches1));
        System.out.println(countStudents_WithoutStackAndQueue(students2,sandwiches2));
    }

    public static int countStudents_UsingStackAndQueue(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();
        Stack<Integer> sandwichStack = new Stack<>();

        for(int i=0;i<students.length;i++){
            sandwichStack.push(sandwiches[sandwiches.length-i-1]);
            studentQueue.offer(students[i]);
        }

        int lastServed = 0;

        while(!studentQueue.isEmpty() && lastServed < studentQueue.size()){
            if(sandwichStack.peek() == studentQueue.peek()){
                sandwichStack.pop();
                studentQueue.poll();
                lastServed = 0;
            }else{
                studentQueue.offer(studentQueue.poll());
                lastServed++;
            }
        }

        return studentQueue.size();
    }

    public static int countStudents_WithoutStackAndQueue(int[] students, int[] sandwiches) {
        int circleStudentCount = 0;
        int squareStudentCount = 0;

        for(int student : students){
            if(student == 0)
                circleStudentCount++;
            else
                squareStudentCount++;
        }

        for(int sandwich : sandwiches){
            if(sandwich == 0 && circleStudentCount ==0)
                return squareStudentCount;

            if(sandwich == 1 && squareStudentCount ==0)
                return circleStudentCount;

            if(sandwich ==0)
                circleStudentCount--;
            else
                squareStudentCount--;
        }

        return 0;
    }
}
