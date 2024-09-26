package com.web_crawler.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class WebCrawler {

    public List<String> crawlWebsite(String urlString) throws IOException {
//        List<String> allUrlParamsAndLinks = new ArrayList<>();
        List<String> allLinks = new ArrayList<>();

        final Set<String> visitedURLs = new HashSet<>();
        visitedURLs.add(urlString);

        // Getting all the links from the HTML
        Document doc = Jsoup.connect(urlString).get();
        Elements links = doc.select("a[href]");
        for (Element link : links) {
            String href = link.attr("href");
//            URL url = new URL(new URL(urlString), href);
            if (visitedURLs.contains(href)) {
                continue;
            }
            visitedURLs.add(href);
            allLinks.add(href);
        }

        return allLinks;
    }

    public Map<String, String> crawlUrl(String urlString) throws IOException {
        Map<String, String> parameters = new HashMap<>();

        // Getting the URL parameters
        URL url = new URL(urlString);
        String query = url.getQuery();

        if (query != null) {
            // Split the query string into key-value pair
            String[] pairs = query.split("&");
            for (String pair : pairs) {
                // Split each pair into key and value
                String[] keyValue = pair.split("=");
                if (keyValue.length > 1) {
                    // Add to map with key and value
                    parameters.put(keyValue[0], keyValue[1]);
                } else {
                    // Null value
                    parameters.put(keyValue[0], "NaN");
                }
            }
        }
        return parameters;
    }
}
