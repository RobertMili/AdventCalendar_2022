package Day3;

public class Testing {
    public static void main(String[] args) {
        String one = "vJrwpWtwJgWr";
        String two = "hcsFMMfFFhFp";
        String fin = "";
        int cnt;
        for (int i = 0; i < one.length(); i++) {
            cnt = 0; // zero for no character equal
            for (int j = 0; j < two.length(); j++) {
                //  System.out.print(" "+two.charAt(j));

                if (one.charAt(i) == two.charAt(j)) {
                    cnt = 1; // ont for character equal
                }

            }
            if (cnt != 0) {
                fin += one.charAt(i);
            }
        }
        System.out.print(" Ret ::" + fin);
    }
    }
