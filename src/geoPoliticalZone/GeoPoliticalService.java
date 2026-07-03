package geoPoliticalZone;

public class GeoPoliticalService {
    public GeoPoliticalZone findZone(String state) {
        if(state.equalsIgnoreCase("Lagos")){
           return GeoPoliticalZone.SOUTH_WEST;

        } else if (state.equalsIgnoreCase("benue")) {
            return GeoPoliticalZone.NORTH_CENTRAL;

        } else if (state.equalsIgnoreCase("Adamawa")) {
            return GeoPoliticalZone.NORTH_EAST;

        } else if (state.equalsIgnoreCase("Enugu")) {
            return  GeoPoliticalZone.SOUTH_EAST;

        } else if (state.equalsIgnoreCase("Edo")) {
            return GeoPoliticalZone.SOUTH_SOUTH;

        } else if (state.equalsIgnoreCase("Kaduna")) {
            return GeoPoliticalZone.NORTH_WEST;

        }
        return null;
    }
}
