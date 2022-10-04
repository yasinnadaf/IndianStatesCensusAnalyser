package com.bridgelabz.test;

import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class CensusAnalyserTest {
    
    private static final String CSV_FILE_PATH = "C:\\CensusAnalyser\\src\\main\\resources\\IndiaStateCensusData.csv";
    private static final String CENSUS_INCORRECT_FILE_PATH = "C:\\CensusAnalyser\\src\\main\\resources\\India_StateCensusData.csv" ;

    @Test
    void givenFileToMatchTheNoOfRecords() throws IOException, CsvException, StateCensusAnalyserException {
        StateCensusAnalyser.csvStateCensuses.clear();
        int actual =  StateCensusAnalyser.readFile(new File(CSV_FILE_PATH));
        Assertions.assertEquals(30,actual);
    }

    @Test
    void givenCSVFileIncorrectPath_ShouldThrowException() {
        File file = new File(CENSUS_INCORRECT_FILE_PATH);
        Assertions.assertThrows(StateCensusAnalyserException.class,() ->
                StateCensusAnalyser.readFile(file));

    }



}
