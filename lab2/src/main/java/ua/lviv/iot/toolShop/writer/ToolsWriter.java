package ua.lviv.iot.toolShop.writer;
import ua.lviv.iot.toolShop.manager.impl.ToolShopManager;
import ua.lviv.iot.toolShop.models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ToolsWriter {
    private String previosClassName = "";

    public void writeToFile(ToolShopManager manager, String filePath) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (CuttingTool tool : manager.getListOfTools()) {
                if (!previosClassName.equals(tool.getClass().getSimpleName())) {
                    writer.write(tool.getHeaders());
                    previosClassName = tool.getClass().getSimpleName();
                    writer.write("\r\n");
                }
                writer.write(tool.toCSV());
                writer.write("\r\n");
            }
        }

    }
}
