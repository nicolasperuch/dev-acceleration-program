package service;

import model.Terrain;
import validation.InputValidation;

import java.util.Scanner;

public class Service {

    private final String TOTAL_AREA = "total";
    private final String BUILTED_AREA = "builted";
    private InputValidation validation;

    public Service() {
        validation = new InputValidation();
    }

    public Terrain insertData(Terrain terrain){
        terrain.setTotalArea(insert(TOTAL_AREA, terrain));;
        terrain.setBuiltedArea(insert(BUILTED_AREA, terrain));
        return terrain;
    }

    private double insert(String field, Terrain terrain){
        Scanner input = new Scanner(System.in);
        double area;

        do {
            System.out.printf("Insert " + field + " area value: ");
            area = input.nextDouble();

        }while(!validation.isValidInput(area, terrain, field));

        return area;
    }
}
