package business;

import model.Terrain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TerrainBusinessTest {

    private TerrainBusiness terrainBusiness;
    private Terrain terrain;

    @Before
    public void setUp(){
        terrainBusiness = new TerrainBusiness();
        terrain = new Terrain();
    }

    @Test
    public void calculateFreeAreaTestWithNoBuiltedArea (){
        terrain.setTotalArea(100);
        terrain.setBuiltedArea(0);

        Assert.assertEquals(100, terrainBusiness.calculateFreeArea(terrain),0);
    }

    @Test
    public void calculateFreeAreaTestWithBuiltedArea (){
        terrain.setTotalArea(100);
        terrain.setBuiltedArea(100);

        Assert.assertEquals(0, terrainBusiness.calculateFreeArea(terrain),0);
    }

    @Test
    public void calculateFreeAreaTestWithFloatingValues(){
        terrain.setTotalArea(55.90);
        terrain.setBuiltedArea(23.59);

        Assert.assertEquals(32.31, terrainBusiness.calculateFreeArea(terrain),0);
    }

    @Test
    public void calculateFreeAreaValueWhenThereIsNoFreeArea (){
        terrain.setFreeArea(0);

        Assert.assertEquals(0, terrainBusiness.calculateFreeAreaValue(terrain),0);
    }

    @Test
    public void calculateFreeAreaValueWhenThereIsFreeArea (){
        terrain.setFreeArea(100);

        Assert.assertEquals(380, terrainBusiness.calculateFreeAreaValue(terrain),0);
    }

    @Test
    public void calculateFreeAreaValueWhenThereIsAFloatingValue (){
        terrain.setFreeArea(56.3);

        Assert.assertEquals(213.93999999999997, terrainBusiness.calculateFreeAreaValue(terrain),0);
    }

    @Test
    public void calculateBuiltedAreaValueWhenThereIsNoBuiltedArea(){
        terrain.setBuiltedArea(0);

        Assert.assertEquals(0, terrainBusiness.calculateBuiltedAreaValue(terrain),0);
    }

    @Test
    public void calculateBuiltedAreaValueWhenThereIsBuiltedArea(){
        terrain.setBuiltedArea(50);

        Assert.assertEquals(250, terrainBusiness.calculateBuiltedAreaValue(terrain),0);
    }

    @Test
    public void calculateBuiltedAreaValueWhenThereIsFloatingValue(){
        terrain.setBuiltedArea(25.8);

        Assert.assertEquals(129, terrainBusiness.calculateBuiltedAreaValue(terrain),0);
    }

    @Test
    public void calculateValueToBePaid(){
        terrain.setTotalArea(150);
        terrain.setBuiltedArea(75);

        Assert.assertEquals(660, terrainBusiness.calculateValueToBePaid(terrain),0);
    }

    @Test
    public void calculateValueToBePaidWithFloatingValues(){
        terrain.setTotalArea(137.8);
        terrain.setBuiltedArea(88.8);

        Assert.assertEquals(630.2, terrainBusiness.calculateValueToBePaid(terrain),0);
    }


}
