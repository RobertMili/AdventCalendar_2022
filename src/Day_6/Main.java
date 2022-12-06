package Day_6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> readingFile = new ArrayList<>();

    public static void main(String[] args) {

        Day_6.readingFIle.readingFIle((ArrayList<String>) readingFile);

        String text = readingFile.toString();

        System.out.println(text.charAt(0));


        for (int i = 0; i < readingFile.size(); i++) {

            if (readingFile.get(0).substring(0,1).equals(readingFile.get(0).substring(1,2))){
                System.out.println(true);
            }
            System.out.println(false);
        }
    }
}
