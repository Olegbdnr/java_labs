package ua.lviv.iot.toolShop.models;

public abstract class CuttingTool {
    private int lengthOfTheWorkSurfaceInСentimeters;

    private String manufacturer;

    private String typeOfMaterial;
    private TypeOfTool type;


    public CuttingTool(int lengthOfTheWorkSurfaceInСentimeters, String typeOfMaterial, String manufacturer, TypeOfTool type) {
        this.lengthOfTheWorkSurfaceInСentimeters = lengthOfTheWorkSurfaceInСentimeters;
        this.manufacturer = manufacturer;
        this.typeOfMaterial = typeOfMaterial;
        this.type = type;
    }

    public int getLengthOfTheWorkSurfaceInСentimeters() {
        return lengthOfTheWorkSurfaceInСentimeters;
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
                "lengthOfTheWorkSurfaceInСentimeters=" + this.lengthOfTheWorkSurfaceInСentimeters +
                ", manufacturer='" + this.manufacturer + '\'' +
                ", typeOfMaterial='" + this.typeOfMaterial + '\'' +
                '}';
    }
}
