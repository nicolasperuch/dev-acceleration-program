import model.Names;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Names names = new Names();

        Scanner sc;
        try {
            sc = new Scanner(new File("names.txt"));
            // Altera o delimitador do scanner para vírgula.
            sc.useDelimiter("[,\n]");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            return;
        }

        while (sc.hasNext()) {
            names.addNewNameToTheList(sc.next());
        }

        java.util.Collections.sort(names.getNames());
        System.out.println(names.toString());

        System.out.println(names.getNames().size());

        ArrayList<String> names2 = new ArrayList<>();

        for (String name: names.getNames()) {
            name.replace("A", "");
            System.out.println(name);
        }

        for (String name: names.getNames()) {
            calculateNameValue(name);
        }

    }
    public static int calculateNameValue(String name) {
        for(int i = 0; i < name.length(); i++){
            char character = name.charAt(i);
            int asciiValue = (int) character;
            System.out.println(asciiValue);

        }


        return 3;
    }
}
