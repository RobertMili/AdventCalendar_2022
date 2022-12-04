package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<String> readingFile = new ArrayList<>();
    static List<Integer> comparingList =  new ArrayList<>();

    public static void main(String[] args) {

        Day4.readingFile.readingFIle((ArrayList<String>) readingFile);

        addFromFileNumbersToLIst();

        for (String s : readingFile){
            System.out.println(s);
        }


        int tempZero = 0, tempOne = 1, tempTwo = 2,  tempThree = 3, score = 0;
        for (int i = 0; i < readingFile.size(); i++) {


            if (comparingList.get(tempZero) >= comparingList.get(tempTwo) || comparingList.get(tempOne) >= comparingList.get(tempThree)){
                score += 1;
            }
            tempZero += 4;
            tempOne += 4;
            tempTwo += 4;
            tempThree += 4;


        }
        System.out.println("Score is " + score);
//        int firstRowMinA = Integer.parseInt(readingFile.get(0).substring(0, 1));
//        int firstRowMaxB = Integer.parseInt(readingFile.get(0).substring(2, 3));
//        int secondRowMinC = Integer.parseInt(readingFile.get(0).substring(4, 5));
//        int secondRowMaxD = Integer.parseInt(readingFile.get(0).substring(6, 7));
//
//
//
//        if (firstRowMinA >= secondRowMinC || (firstRowMaxB >= secondRowMaxD)){
//            System.out.println(true);
//
//        }else {
//            System.out.println(false);
//        }


    }

    private static void addFromFileNumbersToLIst() {
        int tempZero = 0, tempOne = 1,tempTwo = 2, tempThree = 3, tempFour = 4,tempFive = 5, tempSix = 6, tempSeven = 7;


        for (int i = 0; i <= readingFile.size() - 1; i++) {

            comparingList.add(Integer.parseInt(readingFile.get(i).substring(0,1)));
            comparingList.add(Integer.parseInt(readingFile.get(i).substring(2,3)));
            comparingList.add(Integer.parseInt(readingFile.get(i).substring(4,5)));
            comparingList.add(Integer.parseInt(readingFile.get(i).substring(6,7)));
            tempOne++;
            tempTwo++;
            tempThree++;
            tempFour++;
            tempFive++;
            tempSix++;
            tempSeven++;

        }
    }

}
