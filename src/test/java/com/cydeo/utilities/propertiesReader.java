package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesReader {

    Properties properties = new Properties();


    {
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("There is a problem about configuration properties");
            throw new RuntimeException(e);
        }
    }

    public String getProperty(String keyword){
        return properties.getProperty(keyword);
    }


}
