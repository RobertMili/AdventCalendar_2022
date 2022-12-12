package Day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class readingFIle {

    public static void readingFIle(ArrayList<String> StringToList) {

        String homeFolder = System.getProperty("java.class.path"); // This is taking from java
        System.out.println(homeFolder);

        Path homePath = Path.of(homeFolder);
        //System.out.println(Files.exists(homePath));

        Path filePath = Path.of(homeFolder, "Day9/input.txt");

        Scanner s = null;
        try {
            s = new Scanner(new File(String.valueOf(filePath)));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (s.hasNextLine()) {

            StringToList.add(s.nextLine());

        }
    }
}
