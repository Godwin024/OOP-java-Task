package geoPoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoPoliticalServiceTest {

    @Test
    public void testThatLagosBelongToSouthWest(){

        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.SOUTH_WEST,service.findZone("Lagos"));
    }

    @Test
    public void testThatBenueBelongToNorthCentral(){

        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.NORTH_CENTRAL, service.findZone("Benue"));

    }

    @Test
    public void testThatAdamawaBelongsToNorthEast(){
        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.NORTH_EAST, service.findZone("Adamawa"));
    }

    @Test
    public void testThatEnuguBelongsToSouthEast(){

        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.SOUTH_EAST, service.findZone("Enugu"));
    }

    @Test
    public void testThatEdoBelongsToSouthSouth(){

        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.SOUTH_SOUTH, service.findZone("Edo"));
    }

    @Test
    public  void testThatKadunaBelongsToNorthWest(){
        GeoPoliticalService service = new GeoPoliticalService();

        assertEquals(GeoPoliticalZone.NORTH_WEST, service.findZone("Kaduna"));
    }

}
