# WebCrawler

## Overview

This project is a simple web crawler written in Java. It fetches all the links from a given URL and extracts URL parameters. The project uses Maven for dependency management and IntelliJ IDEA as the IDE.

## Features

- Crawl a website to extract all links.
- Extract URL parameters from a given URL.
- Save the crawled data to a JSON file.

## Prerequisites

- Java 8 or higher
- Maven
- IntelliJ IDEA

## Setup

1. **Clone the repository:**
   ```sh
   git clone https://github.com/gautamrajesh007/WebCrawler.git
   cd web-crawler

2. **Open the project in IntelliJ IDEA:**
    - Open IntelliJ IDEA.
    - Select `File -> Open` and choose the `web-crawler` directory.

3. **Build the project using Maven:**
   ```sh
   mvn clean install
   ```

## Usage

1. **Run the application:**
    - In IntelliJ IDEA, navigate to `src/main/java/com/web_crawler/Main.java`.
    - Right-click on the file and select `Run 'Main.main()'`.

2. **Input the URL and file name:**
    - Enter the URL you want to crawl.
    - Enter the name of the file to save the results (without the file extension).

3. **View the results:**
    - The application will output the URL, extracted links, and URL parameters to the console.
    - The results will be saved in a JSON file in the project directory.

## Running the JAR File

After building the project, you can run the JAR file using the following command:

```sh
java -jar WebCrawler.jar
```

## Project Structure

- `src/main/java/com/web_crawler/Main.java`: The main entry point of the application.
- `src/main/java/com/web_crawler/crawler/WebCrawler.java`: Contains the logic for crawling the website and extracting URL parameters.
- `src/main/java/com/web_crawler/file_handler/FileHandler.java`: Handles saving the crawled data to a JSON file.
- `test.json`: Example JSON file with test data.

## Dependencies

- `jsoup`: Java library for working with real-world HTML.
- `jackson`: Java library to convert Java Objects into their JSON representation.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.