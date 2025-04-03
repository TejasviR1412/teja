import java.util.ArrayList;
import java.util.List;

public class Q118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<List<Integer>>();
        ArrayList<Integer> individualRow = new ArrayList<>();

        for(int i=0;i<numRows;i++){
            individualRow.add(0,1);

            for(int j=1;j<individualRow.size()-1;j++){
                individualRow.set(j,individualRow.get(j) +  individualRow.get(j+1));
            }

            pascalsTriangle.add(new ArrayList<>(individualRow));
        }

        return pascalsTriangle;
    }
}