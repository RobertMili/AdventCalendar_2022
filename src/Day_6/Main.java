package Day_6;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<String> readingFile = new ArrayList<>();

    public static void main(String[] args) {

        Day_6.readingFIle.readingFIle((ArrayList<String>) readingFile);

        String text = readingFile.stream().map(String::valueOf).collect(Collectors.joining());


//        System.out.println(text);


        for (int i = 0; i < text.length() - 4; i++) {

            Set<Character> charactersList = new HashSet<>();

            for (int j = 0; j < 4; j++) {

                System.out.println("THis is i " + i);
                System.out.println("This is j " + j);

                charactersList.add(text.charAt(i + j));

                System.out.println(charactersList);
                System.out.println("This is size " + charactersList.size());
                if (charactersList.size() == 4) {
                    System.out.println("This is answer ");
                    System.out.println(i + 4);

                    if(i + 4 == 7){
                        break;
                    }

                }


            }
                
            }
            }
        }






/*
[12:07] Martin Blomberg
    Day6, kolla om en textsträng bara innehåller unika chars.
    Här kan man fundera över det som kallas för tidskomplexitet.
    En dålig lösning med loop i loop kommer ge O(n²) medan en smartare lösning kommer
    förbruka mer minne men ge O(n) i komplexitet. 😋

​[12:31] Martin Blomberg

 */