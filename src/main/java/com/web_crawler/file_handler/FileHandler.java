package com.web_crawler.file_handler;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandler {
    public void saveToJson(String urlString, List<String> links, Map<String, String>parameters, String fileName) throws IOException {
        Map<String, Object> result = new LinkedHashMap<>();
        result.put("url", urlString);
        result.put("links", links);
        result.put("url_parameters", Collections.singletonList(parameters));
        fileName = fileName + ".json";

        // Use Jackson ObjectMapper to write the result as JSON file
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(fileName), result);

        System.out.println("\nData saved to " + fileName);
    }
}
