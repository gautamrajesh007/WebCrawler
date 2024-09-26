package com.web_crawler;

import com.web_crawler.crawler.WebCrawler;
import com.web_crawler.file_handler.FileHandler;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        WebCrawler webCrawler = new WebCrawler();
        FileHandler fileHandler = new FileHandler();
        List<String> crawlWebsite;
        Map<String, String> crawlUrl;

        System.out.println("\t\t\t\tWelcome to WebCrawler!\n");

        // Get the URl from stdin
        System.out.print("Enter the URL to crawl: ");
        String url = scanner.nextLine();

        System.out.println("Enter the name of the file to be saved (No need for file extension): ");
        String fileName = scanner.nextLine();

        scanner.close();

        // Crawl the website and url
        crawlWebsite = webCrawler.crawlWebsite(url);
        crawlUrl = webCrawler.crawlUrl(url);

        // Outputting to stdout
        System.out.println("URL: " + url);
        System.out.println("Links: " + crawlWebsite);
        System.out.println("URL Parameters: " + crawlUrl);

        // Saving the content
        fileHandler.saveToJson(url, crawlWebsite, crawlUrl, fileName);
    }
}