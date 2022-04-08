package ua.lviv.iot.toolShop.models;

public abstract class CuttingTool {
    private int lengthOfTheWorkSurfaceInСentimeters;
    private String manufacturer;
    private String typeOfMaterial;


    public CuttingTool(int lengthOfTheWorkSurfaceInСentimeters, String typeOfMaterial, String manufacturer) {
        this.lengthOfTheWorkSurfaceInСentimeters = lengthOfTheWorkSurfaceInСentimeters;
        this.manufacturer = manufacturer;
        this.typeOfMaterial = typeOfMaterial;
    }

    public int getLengthOfTheWorkSurfaceInСentimeters() {
        return lengthOfTheWorkSurfaceInСentimeters;
    }

    public String getManufacturer() {
        return manufacturer;
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
