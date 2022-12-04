package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<String> readingFile = new ArrayList<>();
    static List<Integer> comparingList = new ArrayList<>();

    static List<Integer> addToInteger = new ArrayList<>();

    public static void main(String[] args) {

        Day4.readingFile.readingFIle((ArrayList<String>) readingFile);

//        addFromFileNumbersToLIst();

        var list = readingFile.stream()
                .flatMap(line -> Arrays.stream(line.split("-")))
                .toList();

        var addNumbers = list.stream()
                .flatMap(line -> Arrays.stream(line.split(",")))
                .toList();


        for (int i = 0; i < addNumbers.size(); i++) {
            addToInteger.add(Integer.valueOf(addNumbers.get(i)));
        }


        readingFile.forEach(System.out::println);


        int A1 = 0, A2 = 1, B1 = 2, B2 = 3, score = 0;

        for (int i = 0; i < readingFile.size(); i++) {

            if ( (addToInteger.get(A1) <= addToInteger.get(B1) && addToInteger.get(B2) <= addToInteger.get(A2))
                    ||
                    (addToInteger.get(B2) <= addToInteger.get(A1) && addToInteger.get(A2) <= addToInteger.get(B2))) {
                score += 1;
            }

            /*
                    elf1_left, elf1_right ||  elf2_left, elf2_right

               if ((elf1_left <= elf2_left && elf2_right <= elf1_right)
                            || (elf2_left <= elf1_left && elf1_right <= elf2_right)) {
                        sum++;
                    }
             */

            A1 += 4;
            A2 += 4;
            B1 += 4;
            B2 += 4;

        }
        System.out.println("Score is " + score);

    }
}



