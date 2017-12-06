package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Service {

    private final int BASE_ASCII_ALPHABETICAL_START = 64;


    // Lê o arquivo "names.txt" utilizando a classe Scanner e adiciona os dados na lista "names."

    public List<String> getNamesFromTxt() throws FileNotFoundException {
        List<String> names = new ArrayList<>();

        Scanner sc = new Scanner(new File("names.txt"));
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            names.add(sc.next());
        }

        return names;
    }

    /*
       Ordena os dados da lista "names" em ordem alfabética com o método sort.
       O metodo sort organiza em sentido ascendente de acordo com a ordem natural dos elementos.
    */
    public List<String> orderNamesByAlphabeticalOrder(List<String> names) {
        List<String> namesAux = names;
        sort(namesAux);

        return namesAux;
    }

    // Remove as aspas de cada dado da lista "names" e adiciona na lista "namesClear".
    public List<String> removeDoubleQuotesFromEachName(List<String> names) {
        List<String> namesClear = new ArrayList<>();

        for (String name : names) {
            namesClear.add(name.replace("\"", ""));
        }

        return namesClear;
    }

    // Calcula o score total, a soma de todos os scores, cada dado(nome) da lista "names".
    public long calculateScoreNames(List<String> names) {
        List<String> namesAux = names;
        int alphabeticalNameValue;
        long allScoreNames = 0;

        for (int i = 0; i < namesAux.size(); i++) {
            alphabeticalNameValue = calculateNameValue(namesAux.get(i));
            allScoreNames += multiplyAlphabeticalNameValuePerPosition(alphabeticalNameValue, i+1);
        }

        return allScoreNames;
    }

    // Calcula o score de cada dado(nome) da lista "names".
    public int calculateNameValue(String name) {

        int alphabeticalWordValue = 0;

        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);
            int asciiValue = (int) character;
            alphabeticalWordValue += calculateAlphabeticalValueForEachLetter(asciiValue);
        }
        return alphabeticalWordValue;
    }


    // Calcula o valor alfabético de cada letra com base no valor do character da tabela ascii.
    public int calculateAlphabeticalValueForEachLetter(int asciiValue) {
        return asciiValue - BASE_ASCII_ALPHABETICAL_START;
    }


    // Retorna o produto do valor alfabético do dado(nome) por sua posição na lista.
    public int multiplyAlphabeticalNameValuePerPosition(int alphabeticalNameValue, int position){
        return alphabeticalNameValue * position;
    }
}


