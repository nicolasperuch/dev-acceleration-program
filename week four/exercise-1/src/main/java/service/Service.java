package service;

import model.Names;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Service {

    private final int BASE_ASCII_ALPHABETICAL_START = 64;

    public Names getNamesFromTxt() throws FileNotFoundException {
        Names names = new Names();

        Scanner sc = new Scanner(new File("names.txt"));
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            names.addNewNameToTheList(sc.next());
        }

        return names;
    }

    public Names orderNamesByAlphabeticalOrder(Names names) {
        Names namesAux = names;
        sort(namesAux.getNames());

        return namesAux;
    }

    public Names removeDoubleQuotesFromEachName(Names names) {
        Names namesClear = new Names();

        for (String name : names.getNames()) {
            namesClear.addNewNameToTheList(name.replace("\"", ""));
        }

        return namesClear;
    }

    public long calculateScoreNames(Names names) {
        Names namesAux = names;
        List<String> listOfNames = namesAux.getNames();
        int alphabeticalNameValue;
        long allScoreNames = 0;

        for (int i=0;i<listOfNames.size();i++) {
            alphabeticalNameValue = calculateNameValue(listOfNames.get(i));
            allScoreNames += multiplyAlphabeticalNameValuePerPosition(alphabeticalNameValue, i+1);
        }

        return allScoreNames;
    }


    public int calculateNameValue(String name) {

        int alphabeticalWordValue = 0;

        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            int asciiValue = (int) character;
            alphabeticalWordValue += calculateAlphabeticalValueForEachLetter(asciiValue);
        }
        return alphabeticalWordValue;
    }

    private int calculateAlphabeticalValueForEachLetter(int asciiValue) {
        return asciiValue - BASE_ASCII_ALPHABETICAL_START;
    }

    public int multiplyAlphabeticalNameValuePerPosition(int alphabeticalNameValue, int position){
        return alphabeticalNameValue * position;
    }
}


