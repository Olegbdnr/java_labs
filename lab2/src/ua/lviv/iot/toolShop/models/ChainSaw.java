package ua.lviv.iot.toolShop.models;

public class ChainSaw extends CuttingTool{
    TypeOfTool type = TypeOfTool.FUEL;

    public ChainSaw (int lenOfBlade, String typeOfMaterial, String manufacturer) {
        super(lenOfBlade, typeOfMaterial, manufacturer);
    }

}
