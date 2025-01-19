public class Q1854_MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs1 = {{1993,1999},{2000,2010}};
        int[][] logs2 = {{1950,1961},{1960,1971},{1970,1981}};
        int[][] logs3 = {{1982,1998},{2013,2042},{2010,2035},{2022,2050},{2047,2048}};

        System.out.println(maximumPopulation(logs1));
        System.out.println(maximumPopulation(logs2));
        System.out.println(maximumPopulation(logs3));
    }

    public static int maximumPopulation(int[][] logs) {
        int[] array = new int[101];
        int yearOfBirth,yearOfDeath,max,year;

        for(int[] log : logs){
            yearOfBirth = log[0];
            yearOfDeath = log[1];

            array[yearOfBirth - 1950]++;
            array[yearOfDeath - 1950]--;
        }

        max = array[0];
        year = 1950;

        for(int i=1; i<array.length ;i++){
            array[i] += array[i-1];

            if(array[i] > max){
                max = array[i];
                year = 1950 + i;
            }
        }

        return year;
    }
}