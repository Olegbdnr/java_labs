package ua.lviv.iot.toolShop.models;

public class JigSaw extends CuttingTool {

    private boolean haveStartBtn = true;

    public JigSaw (int lenOfBlade, String typeOfMaterial, String manufacturer, TypeOfTool type) {
        super(lenOfBlade, typeOfMaterial, manufacturer, type);
    }

    @Override
    public String getHeaders () {
        return super.getHeaders() + ",haveStartBtn";
    }

    @Override
    public String toCSV () {
        return super.toCSV() + "," + this.haveStartBtn;
    }

    public boolean isHaveStartBtn() {
        return haveStartBtn;
    }


}
