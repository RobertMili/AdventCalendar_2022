package Day8;

import java.util.*;

public class Main {

    private static int width = 0;
    private static int height = 0;

    static List<String> input = new ArrayList<>();

    public static void main(String[] args) {

        Day8.readingFile.readingFIle((ArrayList<String>) input);


        Set<Point> visible = new HashSet<>();

        width = input.get(0).length();
        height = input.size();

        for (int row = 0; row < input.size(); row++) {

            String s = input.get(row);

            char leftTall = 0;
            char rightTall = 0;

            for (int col = 0; col < s.length(); col++) {

                if (s.charAt(col) > leftTall)
                {
                    visible.add(new Point(row, col));
                     leftTall = s.charAt(col);
                }

                int rightColumn = s.length() - (col + 1);

                if (s.charAt(rightColumn) > rightTall)
                {
                    visible.add(new Point(row, rightColumn));
                    rightTall = s.charAt(rightColumn);
                }

            }
        }

        String s = input.get(0);

        for (int col = 0; col < s.length(); col++) {


            char toppTall = 0;
            char bottomTall = 0;

            for (int row = 0; row < input.size(); row++) {

                String s2 = input.get(row);

                if (s2.charAt(col) > toppTall) {

                    visible.add( new Point( row,col));
                    toppTall = s2.charAt(col);

                }
                int rowTopp = input.size() - (row + 1 );
                s2 = input.get(rowTopp);

                if (s2.charAt(col) > bottomTall) {

                    visible.add(new Point(rowTopp,col));
                    bottomTall = s2.charAt(col);
                }

            }
        }
        System.out.println(visible.size());
    }



}

record Point(int row, int col) {
    @Override
    public String toString() {
        return "Point{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}



