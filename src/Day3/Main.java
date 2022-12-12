package Day3;

import java.util.*;

public class Main {
    static List<String> input = new ArrayList<>();
    static List<String> returningLetter = new ArrayList<>();
    static List<String> returningLetterPart2 = new ArrayList<>();



    public static void main(String[] args) throws Exception {

        Day3.readingFIle.readingFIle((ArrayList<String>) input);

        List<String> comparingList = new ArrayList<>();
        List<String> removeDuplicateCharacter = new ArrayList<>();


        part1(comparingList, removeDuplicateCharacter);

        addLettersWithOutDuplicate(input, removeDuplicateCharacter);


        getComparedLetterPart2(removeDuplicateCharacter);


    }


    private static void part1(List<String> comparingList, List<String> removedDuplicateCharacter) {

        addingListHalfWord(comparingList);

        addLettersWithOutDuplicate(comparingList, removedDuplicateCharacter);


       getComparedLetter(removedDuplicateCharacter);


        getLettersInv(returningLetter);
    }

    private static int convertCharToInt(Character ch) {
        if (Character.isLowerCase(ch)) return (int) ch - (int) 'a' + 1;
        else return (int) ch - (int) 'A' + 27;
    }

    private static void addingListHalfWord(List<String> comparingList) {
        for (String s : input) {

            comparingList.add(s.substring(0, s.length() / 2));
            comparingList.add(s.substring(s.length() / 2));
        }
    }

    private static void addLettersWithOutDuplicate(List<String> comparingList, List<String> removedDuplicateCharacter) {
        for (String s : comparingList) {

            removedDuplicateCharacter.add(removeDuplicate(s.toCharArray(), s.length()));
        }
    }

    static String removeDuplicate(char[] str, int n) {
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

    private static void getComparedLetter(List<String> comparingList) {

        for (int k = 0; k < comparingList.size(); k = k + 2) {

            int temp;

            for (int i = 0; i < comparingList.get(k).length(); i++) {
                temp = 0; // zero for no character equal

                int secondNumberForLoop = k + 1;
                for (int j = 0; j < comparingList.get(secondNumberForLoop).length(); j++) {
                    //  System.out.print(" "+two.charAt(j));

                    if (comparingList.get(k).charAt(i) == comparingList.get(secondNumberForLoop).charAt(j)) {
                        temp = 1; // ont for character equal

                        break;
                    }
                }
                if (temp != 0) {

                    returningLetter.add(String.valueOf(comparingList.get(k).charAt(i)));

                }
            }
        }

    }
    private static void getComparedLetterPart2(List<String> comparingList) {


        List<String> getLetters = new ArrayList<>();



        for (int k = 0; k < comparingList.size() - 1; k = k + 3) {


            for (int i = 0; i < comparingList.get(k).length(); i++) {


                int secondNumberForLoop = k + 1;
                int thirdWord = k + 2;
                char firstRowLetter = comparingList.get(k).charAt(i);

                for (int j = 0; j < comparingList.get(secondNumberForLoop).length(); j++) {

                    if (firstRowLetter == comparingList.get(secondNumberForLoop).charAt(j)) {


                        for (int l = 0; l < comparingList.get(thirdWord).length(); l++) {

                            if (firstRowLetter == comparingList.get(thirdWord).charAt(l)) {

                                getLetters.add(String.valueOf(firstRowLetter));
                                returningLetterPart2.add(String.valueOf(firstRowLetter));


                            }
                        }
                    }

                }
            }
        }

        System.out.println(getLetters);

        getLettersInv(returningLetterPart2);

    }

    private static void getLettersInv(List<String> letters) {
        int sum = 0;
        for (String secondLetter : letters) {
            sum += convertCharToInt(secondLetter.charAt(0));
        }
        System.out.println("Sum of letters " + sum);
    }


}

