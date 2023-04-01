package com.amirnadiv.myforextester.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.stream.Stream;

@Service
public class ForexDataService {

    public void initDataAfterStartup() throws IOException, SQLException, ClassNotFoundException {

    Stream<Path> allPathsOfData = getAllPathsOfData();
    H2CSVLoader h2CSVLoader = new H2CSVLoader();
    h2CSVLoader.importDataIntoTable();


    }

    private Stream<Path> getAllPathsOfData() throws IOException {
        Stream<Path> paths = Files.walk(Paths.get("C:\\JAVA_PROJECTS\\MyForexTester\\src\\main\\resources\\data"));
        paths.filter(Files::isRegularFile).forEach(System.out::println);
        return paths;
    }
}
