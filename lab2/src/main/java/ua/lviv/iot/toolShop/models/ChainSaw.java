package ua.lviv.iot.toolShop.models;

public class ChainSaw extends CuttingTool{
    private boolean isDanger = true;

    public ChainSaw (int lenOfBlade, String typeOfMaterial, String manufacturer, TypeOfTool type) {
        super(lenOfBlade, typeOfMaterial, manufacturer, type);
    }

    @Override
    public String getHeaders () {
        return super.getHeaders() + ",isDanger";
    }

    @Override
    public String toCSV () {
        return super.toCSV() + "," + this.isDanger;
    }

    @Override
    public String toString() {
        return "ChainSaw{" +
                "lengthOfBladeIncm=" + getLengthOfBlade() +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", typeOfMaterial='" + getTypeOfMaterial() + '\'' +
                ", isDanger='" + this.isDanger + '\'' +
                '}';
    }
}
