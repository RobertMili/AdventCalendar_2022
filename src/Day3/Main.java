package Day3;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    static List<String> readingFIle = new ArrayList<>();
    static List<String> returningLetter = new ArrayList<>();

    public static void main(String[] args) {

        Day3.readingFIle.readingFIle((ArrayList<String>) readingFIle);

        List<String> comparingList = new ArrayList<>();
        List<String> removetDupicateCharacter = new ArrayList<>();


        addingListHalfword(comparingList);


        addLettersWithOutDuplicate(comparingList, removetDupicateCharacter);


        getComparedLetter(removetDupicateCharacter);


        returningLetter.forEach(System.out::println);

        int sum = 0;
        for (int i = 0; i < returningLetter.size() ; i++) {
            //System.out.println(convertCharToInt(returningLetter.get(i).toString().charAt(0)));
            sum +=convertCharToInt(returningLetter.get(i).toString().charAt(0));
        }
        System.out.println(sum);


    }


    private static int convertCharToInt(Character ch) {
        if (Character.isLowerCase(ch)) return (int) ch - (int) 'a' + 1;
        else return (int) ch - (int) 'A' + 27;
    }


    private static void addingListHalfword(List<String> comparingList) {
        for (int i = 0; i < readingFIle.size(); i++) {

            comparingList.add(readingFIle.get(i).substring(0, readingFIle.get(i).length() / 2));
            comparingList.add(readingFIle.get(i).substring(readingFIle.get(i).length() / 2, readingFIle.get(i).length()));
        }
    }

    private static void addLettersWithOutDuplicate(List<String> comparingList, List<String> removetDupicateCharacter) {
        for (int i = 0; i < comparingList.size(); i++) {

            removetDupicateCharacter.add(removeDuplicate(comparingList.get(i).toCharArray(), comparingList.get(i).length()));
        }
    }

    static String removeDuplicate(char str[], int n) {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++) {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i) {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }


    private static String getComparedLetter(List<String> comparingList) {


        String fin = "";

        for (int k = 0; k < comparingList.size(); k = k + 2) {

            int temp;

            for (int i = 0; i < comparingList.get(k).length(); i++) {
                temp = 0; // zero for no character equal

                int secondNumberForLoop = k + 1;
                for (int j = 0; j < comparingList.get(secondNumberForLoop).length(); j++) {
                    //  System.out.print(" "+two.charAt(j));

                    if (comparingList.get(k).charAt(i) == comparingList.get(secondNumberForLoop).charAt(j)) {
                        temp = 1; // ont for character equal

                    }
                }
                if (temp != 0) {
//                    System.out.println("This is k " + k);
//                    System.out.println(comparingList.get(k).charAt(i));

                    fin += comparingList.get(k).charAt(i);

                    returningLetter.add(String.valueOf(comparingList.get(k).charAt(i)));
                }

            }

        }
        return returningLetter.toString();
    }

    private static String getString() {
        String convertToString = returningLetter.stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.joining("\n"));
        return convertToString;
    }

}

