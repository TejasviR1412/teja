public class Q278_FirstBadVersion {
    public static void main(String[] args) {
        int n1 = 5; //bad = 4
        int n2 = 1; // bad = 1;
    }

    /*public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        int badVersion = 1;

        while(start <= end){
            mid = start + (end - start)/2;

            if(isBadVersion(mid)){
                end = mid-1;
                badVersion = mid;
            }else if(!isBadVersion(mid)){
                start = mid + 1;
            }
        }

        return badVersion;
    }*/
}
