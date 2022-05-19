package ua.lviv.iot.toolShop.models;

public class RippingSaw extends CuttingTool {

    private boolean haveHandle = true;

    public RippingSaw (int lenOfBlade, String typeOfMaterial, String manufacturer, TypeOfTool type) {
        super(lenOfBlade, typeOfMaterial, manufacturer, type);
    }

    @Override
    public String getHeaders () {
        return super.getHeaders() + ",haveHandle";
    }

    @Override
    public String toCSV () {
        return super.toCSV() + "," + this.haveHandle;
    }

    public boolean isHaveHandle() {
        return haveHandle;
    }

}
