package business;

import model.Terrain;

public class TerrainBusiness {

    public double calculateValueToBePaid(Terrain terrain) {
        double freeArea = calculateFreeArea(terrain);
        double finalValue = freeArea * terrain.getFREE_AREA_VALUE();
        finalValue += terrain.getBuiltedArea() * terrain.getBUILTED_AREA_VALUE();

        return finalValue;
    }

    private double calculateFreeArea(Terrain terrain){
        return terrain.getTotalArea() - terrain.getBuiltedArea();
    }
}
