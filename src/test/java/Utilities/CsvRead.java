package Utilities;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CsvRead {


    public CSVReader signup_data_read;

    {
        try {
            signup_data_read = new CSVReader (new FileReader("signUpData.csv"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public String[] csvCell;

}
