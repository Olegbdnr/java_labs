package ua.lviv.iot.toolShop;

import ua.lviv.iot.toolShop.models.*;

public class Main {

    public static void main(String[] args) {
        CuttingTool rippingSaw = new RippingSaw(47, "Metal", "DniproM");
        CuttingTool jigSaw = new JigSaw(35, "Metal", "DniproM");
        CuttingTool chainsaw = new ChainSaw(57, "Metal", "DniproM");

    }
}


