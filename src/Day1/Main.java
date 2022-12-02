package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static File file;

    static List<Integer> integersNumbers = new ArrayList<>();
    public static void main(String[] args) throws IOException {


        ArrayList<String> list = new ArrayList<>();

        readingFIle(list);
        addSum(list);

        //System.out.println(integersList);


        System.out.println(Collections.max(integersNumbers));

//
//        var sortingListNaturel = integersList.stream().sorted().toList();
//
//
        Collections.sort(integersNumbers, Collections.reverseOrder());

        //System.out.println(integersNumbers);

        int addingThreeHighestNumber = integersNumbers.get(0) + integersNumbers.get(1) + integersNumbers.get(2);

        System.out.println("adding three highst element+ " + addingThreeHighestNumber);



    }

    private static void readingFIle(ArrayList<String> listForMethod) {

        String homeFolder = System.getProperty("java.class.path"); // This is taking from java
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "Day1/AdventCalender.txt");

        Scanner s = null;
        try {
            s = new Scanner(new File(String.valueOf(filePath)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<String> list = new ArrayList<>();


        while (s.hasNextLine()) {

            list.add(s.nextLine());

        }

        listForMethod.addAll(list);


    }
    private static void addSum(List<String> list) {


        int tempNumber = 0;
        for (String listOfNumber : list) {
            if (!listOfNumber.equals(""))
                tempNumber = Integer.parseInt(listOfNumber) + tempNumber;
            else {
                integersNumbers.add(tempNumber);
                tempNumber = 0;
            }
        }

    }
}
