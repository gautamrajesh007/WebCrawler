package com.web_crawler.file_handler;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FileHandler {
    public void saveToFile(Map<String, List<String>> urlParams) throws IOException {
        String tmz = TimeZone.getDefault().getID();
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = "crawled_" + tmz + "_" + timeStamp + ".txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            for (Map.Entry<String, List<String>> entry : urlParams.entrySet()) {
                writer.write("URL: " + entry.getKey() + "\n\nParameters:\n");
                for (String param : entry.getValue()) {
                    writer.write(" - " + param + "\n");
                }
                writer.write("\n");
            }
        }
        System.out.println("Results saved to " + fileName);
    }
}
