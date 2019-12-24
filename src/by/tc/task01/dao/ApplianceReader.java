package by.tc.task01.dao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ApplianceReader {

    private BufferedReader applianceReader;

    public ApplianceReader(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            applianceReader = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public List<String> read(String applianceType) throws IOException {
        if (applianceType == null) {
            return readAll();
        } else {
            return readWithType(applianceType);
        }
    }

    private List<String> readAll() throws IOException {
        List<String> lines = new ArrayList<>();
        try {
        String oneLine = applianceReader.readLine();
        while (oneLine != null) {
            lines.add(oneLine);
           oneLine = applianceReader.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return lines;

    }

    private List<String> readWithType(String applianceType) throws IOException {
        List<String>lines = new ArrayList<>();
        try {
    String line = applianceReader.readLine();

    while (line != null) {
        if (line.contains(applianceType)) {

            lines.add(line);
        }
        line = applianceReader.readLine();
    }
        } catch (IOException e) {
             e.printStackTrace();
    }
        return lines;
    }

}
