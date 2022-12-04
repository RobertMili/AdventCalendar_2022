package Day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Day2.Main.readingFileTest;

public class readingFile {


    public static void readingFIle(ArrayList<String> listForMethod) {

        String homeFolder = System.getProperty("java.class.path"); // This is taking from java
        //System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "Day2/input.txt");

        Scanner s = null;
        try {
            s = new Scanner(new File(String.valueOf(filePath)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<String> list = new ArrayList<>();


        while (s.hasNextLine()) {

           listForMethod.add(s.nextLine());

        }

        //listForMethod.addAll(list);
        //readingFileTest.addAll((list));
        //System.out.println(readingFileTest);
    }
}
