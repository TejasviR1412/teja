public class Q2379_MinimumRecolorsToGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int count = Integer.MAX_VALUE;
        int wCount = 0;
        int left = 0;

        StringBuilder sb = new StringBuilder();

        for(int right = 0;right<blocks.length();right++){
            if(blocks.charAt(right) == 'W')
                wCount++;

            if(right - left +1 == k){
                count = Math.min(count,wCount);

                if(blocks.charAt(left) == 'W')
                    wCount--;

                left++;
            }
        }

        return count;
    }
}