import business.TerrainBusiness;
import model.Terrain;
import service.Service;

public class Process {

    Service service;
    TerrainBusiness terrainBusiness;

    public Process() {
        this.service = new Service();
        this.terrainBusiness = new TerrainBusiness();
    }

    public void start(){
        Terrain terrain = new Terrain();

        terrain = service.insertData(terrain);

        System.out.println("The value to be paid is : " + terrainBusiness.calculateValueToBePaid(terrain));
    }
}
