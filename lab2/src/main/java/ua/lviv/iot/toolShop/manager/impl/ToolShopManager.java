package ua.lviv.iot.toolShop.manager.impl;

import ua.lviv.iot.toolShop.manager.IShopManager;
import ua.lviv.iot.toolShop.models.CuttingTool;
import ua.lviv.iot.toolShop.models.SortOrder;
import ua.lviv.iot.toolShop.models.TypeOfTool;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ToolShopManager implements IShopManager {

    private List<CuttingTool> listOfTools;

    public ToolShopManager(List<CuttingTool> listOfTools) {
        this.listOfTools = listOfTools;
    }


    private List<CuttingTool> getTools (SortOrder sortOrder, Comparator<CuttingTool> comparing) {
        if (sortOrder.equals(SortOrder.ASC)) {
            return listOfTools.stream().sorted(comparing).collect(Collectors.toList());
        }
        return listOfTools.stream().sorted(comparing.reversed()).collect(Collectors.toList());
    }

    @Override
    public List<CuttingTool> findByType (TypeOfTool type) {
        return listOfTools.stream().filter(tool -> tool.getType() == type).collect(Collectors.toList());
    }

    @Override
    public List<CuttingTool> findByTypeOfMaterial (String typeOfMaterial) {
        return  listOfTools.stream().
                filter(tool -> tool.getTypeOfMaterial() == typeOfMaterial).collect(Collectors.toList());
    }

    @Override
    public List<CuttingTool> sortByLenght (SortOrder sortOrder) {
        return getTools(sortOrder, Comparator.comparing(CuttingTool::getLengthOfTheWorkSurfaceInСentimeters));
    }
}
