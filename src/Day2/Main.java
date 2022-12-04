package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<String> readingFileTest = new ArrayList<>();

    public static void main(String[] args) {


        readingFile readingFile = new readingFile();

        Day2.readingFile.readingFIle((ArrayList<String>) readingFileTest);

        changingNameToBeReadable();

        String convertToString = getString();

//        String rockPapper = "rock papper";              // win -> 8  ok
//        String papperScissors = "papper scissors";       // win -> 9 ok
//        String scissorsRock = "scissors rock";           // win -> 7 ok
//
//
//        String rockScissors = "rock scissors";           // loss  -> 3 ok
//        String papperRock = "papper rock";              // loss   -> 1 ok
//        String scissorsPapper = "scissors papper";      // loss   -> 2 ok
//
//
//        String rockRock = "rock rock";                  // draw  -> 4 ok
//        String papperPapper = "papper papper";          // draw  -> 5 ok
//        String scissorsScissors = "scissors scissors";  // draw  -> 6 ok

        String rockPapper = "rock papper";              // win -> 8  ok
        String rockScissors = "rock scissors";           // loss  -> 3 ok
        String rockRock = "rock rock";                  // draw  -> 4 ok

        String papperScissors = "papper scissors";       // win -> 9 ok
        String papperRock = "papper rock";              // loss   -> 1 ok
        String papperPapper = "papper papper";          // draw  -> 5 ok

        String scissorsRock = "scissors rock";           // win -> 7 ok
        String scissorsPapper = "scissors papper";      // loss   -> 2 ok
        String scissorsScissors = "scissors scissors";  // draw  -> 6 ok


        /*
      
        X - loss
        Y - draw
        Z - win
        // X for Rock, Y for Paper, and Z for Scissors
        // X means you need to lose, Y means you need to end the round in a draw, and Z means you need to win
         */

        int winPoints = 6;
        int drawPoints = 0;
        int lossPoints = 3;

        int scissorPoints = 3;
        int papperPoints = 2;
        int rockPoints = 1;

        int myPoints = 0;

        for (String s : readingFileTest) {

            if (s.equals(rockPapper)) {   // Ska spela draw => rock
                myPoints += 4;
            }
            if (s.equals(papperScissors)) {  // Scissors=Z, spela win  => scissors
                myPoints += 9;
            }
            if (s.equals(scissorsRock)) {
                myPoints += 7; // this is change now
            }


            if (s.equals(rockScissors)) {
                myPoints += 3;
            }
            if (s.equals(papperRock)) {
                myPoints += 1; // this is chane now
            }
            if (s.equals(scissorsPapper)) {
                myPoints += 2;
            }


            if (s.equals(rockRock)) {
                myPoints += 4; // this is change now
            }
            if (s.equals(papperPapper)) {
                myPoints += 5;
            }
            if (s.equals(scissorsScissors)) {
                myPoints += 6;
            }


        }
        System.out.println(convertToString);
        System.out.println(myPoints);
    }

    private static void changingNameToBeReadable() {
        readingFileTest.replaceAll(e -> e.replaceAll("A", "rock"));
        readingFileTest.replaceAll(e -> e.replaceAll("B", "papper"));
        readingFileTest.replaceAll(e -> e.replaceAll("C", "scissors"));
        readingFileTest.replaceAll(e -> e.replaceAll("X", "rock"));
        readingFileTest.replaceAll(e -> e.replaceAll("Y", "papper"));
        readingFileTest.replaceAll(e -> e.replaceAll("Z", "scissors"));
    }

    private static String getString() {
        String convertToString = readingFileTest.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining("\n"));
        return convertToString;
    }

}
