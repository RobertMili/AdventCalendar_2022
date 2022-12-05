package Day5;

import java.util.*;

public class Main {

    static List<String> readingFile = new ArrayList<>();
    static List<String> inputFile = new ArrayList<>();

    static List<String> stack1 = new ArrayList<>();
    static List<String> stack2 = new ArrayList<>();
    static List<String> stack3 = new ArrayList<>();


    public static void main(String[] args) {


        Day5.readingFile.readingFIle((ArrayList<String>) readingFile);

//        readingFile.forEach(System.out::println);
        inputFile.addAll(readingFile);

        var clearingFile = new ArrayList<>(inputFile
                .stream()
                .flatMap(line -> Arrays.stream(line.split("move")))
                .flatMap(line -> Arrays.stream(line.split("from")))
                .flatMap(line -> Arrays.stream(line.split("to")))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .flatMap(line -> Arrays.stream(line.split("")))
                .toList());


        clearingFile.removeIf(String::isEmpty);

//        System.out.println(clearingFile.toString());


        var inputMap = inputMap2();



//        inputMap.put(1,inputMap.get(1) + inputMap.get(2).substring(2,3));
//        inputMap.put(2,inputMap.get(2).substring(0,2));

        int tempZero = 0;
        int tempOne = 1;
        int tempTwo = 2;

        System.out.println("Size of reading file " + readingFile.size());
        for (int i = 0; i < readingFile.size(); i++) { //readingfile.size

            int elementsNumber = Integer.parseInt(clearingFile.get(tempZero));

            int from = Integer.parseInt(clearingFile.get(tempOne));

            int to = Integer.parseInt(clearingFile.get(tempTwo));


            String revesreElements = inputMap.get(from).chars()
                    .mapToObj( c -> (char)c)
                    .reduce("", (s, c) -> c+s,(s1,s2) -> s2 +s1);
            System.out.println( "reverse elemnts " + revesreElements);

            System.out.println("Elements numbers " + elementsNumber);
            System.out.println("From " + from);
            System.out.println("to " + to);

            try {
                inputMap.put(to, inputMap.get(to) + revesreElements.substring(0, elementsNumber)); // add

                inputMap.put(from, inputMap.get(from).substring(0, inputMap.get(from).length() - elementsNumber));                  // left

            } catch (Exception e){
                System.out.println(e);
            }

           System.out.println("IN loop " + inputMap.toString());

            tempZero += 3;
            tempOne += 3;
            tempTwo += 3;

            revesreElements = null;

        }


       System.out.println("After loop " + inputMap.toString());



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
                1, "PFMQWGR",
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

