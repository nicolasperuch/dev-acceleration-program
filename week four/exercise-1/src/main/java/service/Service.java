package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Service {

    private final int BASE_ASCII_ALPHABETICAL_START = 64;

    public List<String> getNamesFromTxt() throws FileNotFoundException {
        List<String> names = new ArrayList<>();

        Scanner sc = new Scanner(new File("names.txt"));
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            names.add(sc.next());
        }

        return names;
    }

    public List<String> orderNamesByAlphabeticalOrder(List<String> names) {
        List<String> namesAux = names;
        sort(namesAux);

        return namesAux;
    }

    public List<String> removeDoubleQuotesFromEachName(List<String> names) {
        List<String> namesClear = new ArrayList<>();

        for (String name : namesClear) {
            namesClear.add(name.replace("\"", ""));
        }

        return namesClear;
    }

    public long calculateScoreNames(List<String> names) {
        List<String> namesAux = names;
        int alphabeticalNameValue;
        long allScoreNames = 0;

        for (int i=0;i<namesAux.size();i++) {
            alphabeticalNameValue = calculateNameValue(namesAux.get(i));
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

    public int calculateAlphabeticalValueForEachLetter(int asciiValue) {
        return asciiValue - BASE_ASCII_ALPHABETICAL_START;
    }

    public int multiplyAlphabeticalNameValuePerPosition(int alphabeticalNameValue, int position){
        return alphabeticalNameValue * position;
    }
}


