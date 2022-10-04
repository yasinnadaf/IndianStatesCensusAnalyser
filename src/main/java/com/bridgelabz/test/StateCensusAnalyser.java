package com.bridgelabz.test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StateCensusAnalyser {
  static ArrayList<CSVStateCensus> csvStateCensuses = new ArrayList<>();

  public static int readFile(File file) throws IOException, CsvException, StateCensusAnalyserException {
    checkInputFile(file);
    FileReader fileReader = new FileReader(file);
    CSVReader csvReader = new CSVReader(fileReader);
    List<String[]> stateCensus = csvReader.readAll();

    return stateCensus.size();
  }

   static void checkInputFile(File file) throws StateCensusAnalyserException {
     if (!file.exists()) {
       throw new StateCensusAnalyserException("fine not exists");
     }
     String expectedFileType = "csv";
     int index = file.toString().lastIndexOf(".");
     String actualFileType = file.toString().substring(index + 1);
     if (!expectedFileType.equals(actualFileType)) throw new StateCensusAnalyserException("file type doesn't match");
   }


}
