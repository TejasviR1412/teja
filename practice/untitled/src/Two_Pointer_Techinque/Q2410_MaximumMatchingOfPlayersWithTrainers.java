package Two_Pointer_Techinque;

import java.util.Arrays;

public class Q2410_MaximumMatchingOfPlayersWithTrainers {
    public static void main(String[] args) {
        int[] players1 = {4,7,9};
        int[] trainers1 = {8,2,5,8};

        int[] players2 = {1,1,1};
        int[] trainers2 = {10};

        System.out.println(matchPlayersAndTrainers(players1,trainers1));
        System.out.println(matchPlayersAndTrainers(players2,trainers2));
    }

    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int noOfMatchedPlayers = 0;

        int trainerIndex = 0;

        while(trainerIndex< trainers.length && noOfMatchedPlayers < players.length){
            if(players[noOfMatchedPlayers] <= trainers[trainerIndex]){
                noOfMatchedPlayers++;
            }
            trainerIndex++;
        }

        return noOfMatchedPlayers;
    }
}
