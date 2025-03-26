public class Q3206_AlternatingGroups_I {
    public int numberOfAlternatingGroups(int[] colors) {
        int length = colors.length;
        int count = 0;
        int previous, current , next;

        for(int i=0;i<length;i++){
            previous = colors[(i-1+length) % length];
            current = colors[i];
            next = colors[(i+1) % length];

            if(current != previous && current != next){
                count++;
            }
        }
        return count;
    }
}