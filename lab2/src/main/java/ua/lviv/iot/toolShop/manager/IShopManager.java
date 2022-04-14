package ua.lviv.iot.toolShop.manager;

import ua.lviv.iot.toolShop.models.CuttingTool;
import ua.lviv.iot.toolShop.models.SortOrder;
import ua.lviv.iot.toolShop.models.TypeOfTool;

import java.util.List;

public interface IShopManager {
    List<CuttingTool> findByType (TypeOfTool type);
    List<CuttingTool> findByTypeOfMaterial (String typeOfMaterial);
    List<CuttingTool> sortByLenght (SortOrder sortOrder);
}
