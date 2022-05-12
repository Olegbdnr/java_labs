package ua.lviv.iot.toolShop.manager;

import org.junit.jupiter.api.*;
import ua.lviv.iot.toolShop.manager.impl.ToolShopManager;
import ua.lviv.iot.toolShop.models.*;
import java.util.LinkedList;
import java.util.List;



class TestManager {

    ToolShopManager manager;
    List<CuttingTool> listOfTools;

    @BeforeEach
    public void setUp()  {
        listOfTools = new LinkedList<CuttingTool>();
        JigSaw jigSaw = new JigSaw(32, "Metalic", "DniproM", TypeOfTool.POWER);
        ChainSaw chainSaw = new ChainSaw(43, "Metalic", "DniproM",
                TypeOfTool.FUEL);
        RippingSaw rippingSaw = new RippingSaw(55, "Metalic", "DniproM",
                TypeOfTool.POWER);
        listOfTools.add(jigSaw);
        listOfTools.add(chainSaw);
        listOfTools.add(rippingSaw);
        manager = new ToolShopManager(listOfTools);
    }

    private void returnNotEmptyList (List<CuttingTool> checkList) {
        Assertions.assertNotNull(checkList);
    }

    @Test
    public void returnNotEmptyListTest () {
        var result = manager.getListOfTools();
        returnNotEmptyList(result);
    }

    @Test
    public void findByTypeTest () {
        var result = manager.findByType(TypeOfTool.POWER);
        returnNotEmptyList(result);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(TypeOfTool.POWER, result.get(0).getType());
        Assertions.assertEquals(TypeOfTool.POWER, result.get(1).getType());
    }

    @Test
    public void findByTypeOfMaterialTest () {
        var result = manager.findByTypeOfMaterial("Metalic");
        returnNotEmptyList(result);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals("Metalic", result.get(0).getTypeOfMaterial());
        Assertions.assertEquals("Metalic", result.get(1).getTypeOfMaterial());
        Assertions.assertEquals("Metalic", result.get(2).getTypeOfMaterial());
    }

    @Test
    public void testSortToolsAsc () {
        var result = manager.sortByLenght(SortOrder.ASC);
        returnNotEmptyList(result);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(32, result.get(0).getLengthOfBlade());
        Assertions.assertEquals(43, result.get(1).getLengthOfBlade());
        Assertions.assertEquals(55, result.get(2).getLengthOfBlade());
    }

    @Test
    public void testSortToolsDesc () {
        var result = manager.sortByLenght(SortOrder.DESC);
        returnNotEmptyList(result);
        Assertions.assertEquals(3, result.size());
        Assertions.assertEquals(55, result.get(0).getLengthOfBlade());
        Assertions.assertEquals(43, result.get(1).getLengthOfBlade());
        Assertions.assertEquals(32, result.get(2).getLengthOfBlade());
    }

}