package Two_Pointer_Techinque;

public class Q832_FlippingAnImage {
    public static void main(String[] args) {
        int[][] image1 = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2 = {{1,1,0,0}, {1,0,0,1},{0,1,1,1},{1,0,1,0}};

        int[][] output1 = flipAndInvertImage(image1);
        for(int[] a : output1){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }


    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            flipRow(row);
            invertRow(row);
        }

        return image;
    }

    private static void flipRow(int[] row){
        int left = 0;
        int right = row.length-1;
        int temp;

        while(left < right){
            temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }

    private static void invertRow(int[] row){
        for(int i=0 ; i< row.length ;i++){
            if(row[i] == 0)
                row[i] = 1;
            else
                row[i] = 0;
        }
    }
}