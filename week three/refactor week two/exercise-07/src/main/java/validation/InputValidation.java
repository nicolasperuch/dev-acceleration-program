package validation;

import model.Terrain;

public class InputValidation {


    public boolean isValidInput(double area, Terrain terrain, String field) {
        if(isTotalArea(field)){
            return validateTotalArea(area);
        }
        return validateBuiltedArea(area, terrain);
    }

    private boolean isTotalArea(String field){
        return field == "total";
    }

    private boolean validateTotalArea(double area){
        return area > 0;
    }

    private boolean validateBuiltedArea(double area, Terrain terrain){
        return area >= 0 && area <= terrain.getTotalArea();
    }


}
