package model;

public class Terrain {

    public final double FREE_AREA_VALUE = 3.8;
    public final double BUILTED_AREA_VALUE = 5.0;

    public final String TOTAL_AREA = "total";
    public final String BUILTED_AREA = "builted";

    private double totalArea;
    private double freeArea;
    private double builtedArea;
    private double finalValue;

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double getBuiltedArea() {
        return builtedArea;
    }

    public void setBuiltedArea(double builtedArea) {
        this.builtedArea = builtedArea;
    }

    public double getFREE_AREA_VALUE() {
        return FREE_AREA_VALUE;
    }

    public double getBUILTED_AREA_VALUE() {
        return BUILTED_AREA_VALUE;
    }

    public double getFreeArea() {
        return freeArea;
    }

    public void setFreeArea(double freeArea) {
        this.freeArea = freeArea;
    }

    public double getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(double finalValue) {
        this.finalValue = finalValue;
    }
}
