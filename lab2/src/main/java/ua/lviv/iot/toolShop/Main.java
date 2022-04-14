package ua.lviv.iot.toolShop;

import ua.lviv.iot.toolShop.manager.IShopManager;
import ua.lviv.iot.toolShop.manager.impl.ToolShopManager;
import ua.lviv.iot.toolShop.models.*;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<CuttingTool> listOfTools = new LinkedList<CuttingTool>();
        CuttingTool rippingSaw = new RippingSaw(47, "Metal", "DniproM", TypeOfTool.MECHANICAL);
        CuttingTool jigSaw = new JigSaw(35, "Metal", "DniproM", TypeOfTool.POWER);
        CuttingTool chainsaw = new ChainSaw(57, "Metal", "DniproM", TypeOfTool.FUEL);
        listOfTools.add(rippingSaw);
        listOfTools.add(jigSaw);
        listOfTools.add(chainsaw);
        IShopManager manager = new ToolShopManager(listOfTools);
        System.out.println(manager.findByType(TypeOfTool.MECHANICAL));
        System.out.println(manager.findByTypeOfMaterial("Metal"));
        System.out.println(manager.sortByLenght(SortOrder.ASC));
        System.out.println(manager.sortByLenght(SortOrder.DESC));



    }
}


