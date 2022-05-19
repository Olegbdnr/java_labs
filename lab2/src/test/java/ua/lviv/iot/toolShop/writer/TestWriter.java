package ua.lviv.iot.toolShop.writer;

import org.codehaus.plexus.util.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.toolShop.manager.impl.ToolShopManager;
import ua.lviv.iot.toolShop.models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TestWriter {
    ToolShopManager manager;
    List<CuttingTool> listOfTools;
    ToolsWriter writer;

    @BeforeEach
    public void setUp() throws Exception {
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
        writer = new ToolsWriter();
    }

    @Test
    public void emptyFileTest() throws FileNotFoundException, IOException {
        writer.writeToFile(manager, "src/test/result1.csv");
        File fileWithContent = new File("src/test/result1.csv");
        List<CuttingTool> emptyList = new LinkedList<CuttingTool>();
        ToolShopManager managerWithoutData = new ToolShopManager(emptyList);
        writer.writeToFile(managerWithoutData, "src/test/result2.csv");
        File fileWithoutContent = new File("src/test/result2.csv");
        Assertions.assertFalse(FileUtils.contentEquals(fileWithContent, fileWithoutContent));
    }
}

