package strings;

import java.util.Arrays;

public class ExercicioStrings {

    public static void main(String[] args) {
        //toCharArray
        System.out.println("A B C D E F G H I J K L M N O".toCharArray());

        //split
        String [] splitResult = "Aula de Java".split(" ");

        for (String s : splitResult) {
            System.out.print(s);
        }

        //concat
        System.out.println("\nAula".concat(" DE JAVA"));

        //replace
        var replaceResult = "1234 pwd sensitive numbers".replaceAll("[0-9]", "#");
        System.out.println(replaceResult);

    }
}
