package ua.lviv.iot.toolShop.models;

public class JigSaw extends CuttingTool {
    TypeOfTool type = TypeOfTool.POWER;

    public JigSaw (int lenOfBlade, String typeOfMaterial, String manufacturer) {
        super(lenOfBlade, typeOfMaterial, manufacturer);
    }

}
