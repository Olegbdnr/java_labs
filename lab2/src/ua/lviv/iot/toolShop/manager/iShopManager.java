package ua.lviv.iot.toolShop.manager;

import ua.lviv.iot.toolShop.models.*;

import java.util.List;

public interface iShopManager {
    List<CuttingTool> findByType ();
    List<CuttingTool> findByTypeOfMaterial ();
    List<CuttingTool> sortByLen ();
}
