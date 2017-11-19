package model;

public class Terrain {

    private double totalArea;
    private double builtedArea;
    private final double FREE_AREA_VALUE = 3.8;
    private final double BUILTED_AREA_VALUE = 5.0;

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
}
