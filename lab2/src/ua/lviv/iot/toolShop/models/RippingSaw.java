package ua.lviv.iot.toolShop.models;

public class RippingSaw extends CuttingTool {
    TypeOfTool type = TypeOfTool.MECHANICAL;

    public RippingSaw (int lenOfBlade, String typeOfMaterial, String manufacturer) {
        super(lenOfBlade, typeOfMaterial, manufacturer);
    }

}
