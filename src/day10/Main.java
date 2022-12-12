package day10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> input = new ArrayList<>();

    public static void main(String[] args) {

        day10.readingFile.readingFIle((ArrayList<String>)input);

        for (String s: input){
            System.out.println(s);
        }
    }
}
