package Day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    static List<String> input = new ArrayList<>();
    static List<String> shareInput = new ArrayList<>();


    public static void main(String[] args) {

        Day3.readingFIle.readingFIle((ArrayList<String>) input);

        shareInput = input
                .stream()
                .filter(i -> Boolean.parseBoolean(i.substring(i.indexOf(0),i.indexOf(i.indexOf(1)))))
                .collect(Collectors.toList());


        System.out.println(shareInput);


    }
}
