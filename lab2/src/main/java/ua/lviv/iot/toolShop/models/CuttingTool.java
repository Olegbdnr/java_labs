package ua.lviv.iot.toolShop.models;

public abstract class CuttingTool {
    private int lengthOfBladeInСm;

    private String manufacturer;

    private String typeOfMaterial;
    private TypeOfTool type;


    public CuttingTool(int lengthOfBladeInСm, String typeOfMaterial, String manufacturer, TypeOfTool type) {
        this.lengthOfBladeInСm = lengthOfBladeInСm;
        this.manufacturer = manufacturer;
        this.typeOfMaterial = typeOfMaterial;
        this.type = type;
    }

    public int getLengthOfBlade() {
        return lengthOfBladeInСm;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public TypeOfTool getType() {
        return type;
    }

    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    @Override
    public String toString() {
        return "CuttingTool{" +
                "lengthOfTheWorkSurfaceInСentimeters=" + this.lengthOfBladeInСm +
                ", manufacturer='" + this.manufacturer + '\'' +
                ", typeOfMaterial='" + this.typeOfMaterial + '\'' +
                '}';
    }
}
