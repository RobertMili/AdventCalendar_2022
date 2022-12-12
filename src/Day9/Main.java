package Day9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<String> input = new ArrayList<>();
    public static void main(String[] args) {

        Day9.readingFIle.readingFIle((ArrayList<String>) input);

        for (String s : input) {
            System.out.println(s);
        }

        char right = 'R';
        char left = 'L';
        char top = 'T';
        char down = 'D';
        int count = 0;
        for (int row = 0; row < 6; row++) {



            for (int col = 0; col < 4; col++) {


                if(col == 3 && row == 5  )
                {
                    System.out.print("H");
                    count++;
                } else if(col == 0 && row == 5  )
                {
                    System.out.print("H");
                    count++;
                }
                else {
                    System.out.print(col);
                }

            }

            System.out.println(row);
        }

        System.out.println("Proces " + count);

    }
}
