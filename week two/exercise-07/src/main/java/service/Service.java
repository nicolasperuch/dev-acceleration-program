package service;

import model.Terrain;

import java.util.Scanner;

public class Service {

    private final String TOTAL_AREA = "total";
    private final String BUILTED_AREA = "builted";

    private Terrain terrain;

    public Service() {
        this.terrain = new Terrain();
    }

    public void insertData(){
        terrain.setTotalArea(insert(TOTAL_AREA));
        terrain.setBuiltedArea(insert(BUILTED_AREA));
    }

    private double insert(String field){
        Scanner input = new Scanner(System.in);
        double area;

        System.out.printf("Insert " + field + " area value: " );
        area = input.nextDouble();
        return area;
    }

    public void calculateValueToBePaid() {
        double freeArea = calculateFreeArea();
        double finalValue = freeArea * terrain.getFREE_AREA_VALUE();
        finalValue += terrain.getBuiltedArea() * terrain.getBUILTED_AREA_VALUE();
        terrain.setFinalValue(finalValue);
    }

    private double calculateFreeArea(){
        return terrain.getTotalArea() - terrain.getBuiltedArea();
    }

    public double getFinalValue(){
        return terrain.getFinalValue();
    }
}
