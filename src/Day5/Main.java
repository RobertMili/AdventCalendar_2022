package Day5;

import java.util.*;

public class Main {

    static List<String> readingFile = new ArrayList<>();
    static List<String> inputFile = new ArrayList<>();

    static ArrayList<Integer> test = new ArrayList<>();


    public static void main(String[] args) {

        String[] clearingToInteger = new String[readingFile.size()];
        Day5.readingFile.readingFIle((ArrayList<String>) readingFile);



        for (int i = 0; i < readingFile.size() - 1; i++) {
            clearingToInteger = readingFile.get(i).split(" ");


            for (String number : clearingToInteger) {

                if (number.matches("\\d+")) {

                    inputFile.addAll(Collections.singleton(number));
                }
            }
        }



//        var clearingFile = new ArrayList<>(inputFile
//                .stream()
//                .flatMap(line -> Arrays.stream(line.clearingToInteger("move")))
//                .flatMap(line -> Arrays.stream(line.clearingToInteger("from")))
//                .flatMap(line -> Arrays.stream(line.clearingToInteger("to")))
//                .flatMap(line -> Arrays.stream(line.clearingToInteger(" ")))
//                .flatMap(line -> Arrays.stream(line.clearingToInteger("")))
//                .toList());
////
//
//
//


        var clearingFile = new ArrayList<>(inputFile);


        var inputMap = inputMap2();




        int tempZero = 0;
        int tempOne = 1;
        int tempTwo = 2;


        for (int i = 0; i < readingFile.size() - 1; i++) {

            int move = Integer.parseInt(clearingFile.get(tempZero));

            int from = Integer.parseInt(clearingFile.get(tempOne));

            int to = Integer.parseInt(clearingFile.get(tempTwo));


            String revesreElements = inputMap.get(from).chars()
                    .mapToObj(c -> (char) c)
                    .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
//
//            String revesreElements = inputMap.get(from).substring(inputMap.get(from).length() - from);
//            System.out.println("This is revers " + revesreElements);

            System.out.println("Move " + move + " " + "From " + from + " To " + to);


            try {
                inputMap.put(to, inputMap.get(to) + revesreElements.substring(0, move)); // add

                inputMap.put(from, inputMap.get(from).substring(0, inputMap.get(from).length() - move));                  // left

            } catch (Exception e) {
                System.out.println(e);
            }

           System.out.println("IN loop " + inputMap.toString());

            tempZero += 3;
            tempOne += 3;
            tempTwo += 3;

            revesreElements = null;

        }



        System.out.println("This is answer:");
            System.out.print(inputMap.get(1).substring(inputMap.get(1).length() - 1));
            System.out.print(inputMap.get(2).substring(inputMap.get(2).length() - 1));
            System.out.print(inputMap.get(3).substring(inputMap.get(3).length() - 1));
            System.out.print(inputMap.get(4).substring(inputMap.get(4).length() - 1));
//            System.out.print(inputMap.get(5).substring(inputMap.get(5).length() - 1));
            System.out.print(inputMap.get(6).substring(inputMap.get(6).length() - 1));
            System.out.print(inputMap.get(7).substring(inputMap.get(7).length() - 1));
            System.out.print(inputMap.get(8).substring(inputMap.get(8).length() - 1));
            System.out.print(inputMap.get(9).substring(inputMap.get(9).length() - 1));

            //TPGVQPFDH
    }

    public static Map<Integer, String> inputMap() {
        return new HashMap<>((Map.of(
                1, "ZN",
                2, "MCD",
                3, "P"
        )));
    }

    public static Map<Integer, String> inputMap2() {
        return new HashMap<>((Map.of(
                1, "PFMQWGRT",
                2, "HFR",
                3, "PZRVGHSD",
                4, "QHPBFWG",
                5, "PSMJH",
                6, "MZTHSRPL",
                7, "PTHNML",
                8, "FDQR",
                9, "DSCNLPH"
        )));


    }
}

//VMWRJDLRC