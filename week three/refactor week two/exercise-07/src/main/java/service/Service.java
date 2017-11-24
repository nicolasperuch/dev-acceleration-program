package service;

import model.Terrain;

import java.util.Scanner;

public class Service {

    private final String TOTAL_AREA = "total";
    private final String BUILTED_AREA = "builted";

    public Service() {
    }

    public Terrain insertData(Terrain terrain){
        terrain.setTotalArea(insert(TOTAL_AREA));
        terrain.setBuiltedArea(insert(BUILTED_AREA));
        return terrain;
    }

    private double insert(String field){
        Scanner input = new Scanner(System.in);
        double area;

        System.out.printf("Insert " + field + " area value: " );
        area = input.nextDouble();
        return area;
    }
}
