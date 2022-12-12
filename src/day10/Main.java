package day10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> input = new ArrayList<>();

    public static void main(String[] args) {

        day10.readingFile.readingFIle((ArrayList<String>) input);


        int index = 0;
        int delay = 0;
        int register = 1;
        int cycle = 0;
        int part1 = 0;

        while (index < input.size()){

           String[] parts = input.get(index).split(" ");

            switch (parts[0]){

                case "noop" -> index++;

                case "addx" ->
                {
                    if (delay == 0)
                    {
                        delay++;
                    } else {
                        register += Integer.parseInt(parts[1]);
                        delay =0;
                        index++;
                    }
                }
            }
            cycle++;

        }
    }
}

