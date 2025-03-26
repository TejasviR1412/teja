public class Q2579_CountTotalNumberOfColoredCells {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        System.out.println(coloredCells_Approach1(n1));
        System.out.println(coloredCells_Approach1(n2));
        System.out.println("****************************");
        System.out.println(coloredCells_Approach2(n1));
        System.out.println(coloredCells_Approach2(n2));
    }

    public static long coloredCells_Approach1(int n) {
        long numberOfBlueCells = 1;
        int addEnd = 4;

        while(--n > 0){
            numberOfBlueCells += addEnd;
            addEnd +=4;
        }

        return numberOfBlueCells;
    }

    public static long coloredCells_Approach2(int n) {
        return 1 + (long) n * (n - 1) * 2;
    }
}