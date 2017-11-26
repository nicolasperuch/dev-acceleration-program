package business;

import model.Terrain;

public class TerrainBusiness {

    public double calculateValueToBePaid(Terrain terrain) {
        terrain.setFreeArea(calculateFreeArea(terrain));
        terrain.setFinalValue(calculateBuiltedAreaValue(terrain) + calculateFreeAreaValue(terrain));

        return terrain.getFinalValue();
    }

    public double calculateFreeArea(Terrain terrain){
        return terrain.getTotalArea() - terrain.getBuiltedArea();
    }

    public double calculateFreeAreaValue(Terrain terrain){
        return terrain.getFreeArea() * terrain.getFREE_AREA_VALUE();
    }

    public double calculateBuiltedAreaValue(Terrain terrain){
        return terrain.getBuiltedArea() * terrain.getBUILTED_AREA_VALUE();
    }
}
