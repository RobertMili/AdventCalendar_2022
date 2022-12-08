package Day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<String> readingFile = new ArrayList<>();
    static List<Integer> convertToNum = new ArrayList<>();

    public static void main(String[] args) {

        Day8.readingFile.readingFIle((ArrayList<String>) readingFile);
        int topRow = readingFile.get(0).length();
        int bottomRow = readingFile.get(readingFile.size() - 1).length();
        int leftSize = readingFile.size();
        int rightSize = readingFile.size();

        for (String s : readingFile) {
            System.out.println(s);
        }

        List<List<Integer>> list = new ArrayList<>();
        for (String s : readingFile) {
            Integer parseInt = Integer.parseInt(s);
            list.add(Collections.singletonList(parseInt));
        }
//
//
//        System.out.println("Top row " + topRow);
//        System.out.println("bottom row " + bottomRow);


        List<String> newLista = new ArrayList<>();

        int firstNumber = 0;
        for (int i = 1; i < readingFile.size() - 1; i++) {

            newLista.add(readingFile.get(i).substring(1, 4));

        }

//        for (String s : newLista) {
//            System.out.println(s);
//        }


        int temp = 1;
        int tempSecond = 2;
        int count = 0;

        System.out.println("  ");
            for (int i = 1; i < readingFile.size() -1; i++) {

                for (int j = 0; j < i; j++) {
                    System.out.println(readingFile.get(i));
//
                }


//                if (Integer.parseInt(readingFile.get(i).substring(i, temp)) >= Integer.parseInt(readingFile.get(i).substring(temp, tempSecond))) {
//                    System.out.println(readingFile.get(i).substring(i, temp));
//                    count++;
//                }
//
//                temp++;
//                tempSecond++;



            }

        System.out.println(count);


    }


}



