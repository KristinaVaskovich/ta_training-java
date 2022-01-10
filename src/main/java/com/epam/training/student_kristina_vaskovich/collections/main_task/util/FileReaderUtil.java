package com.epam.training.student_kristina_vaskovich.collections.main_task.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderUtil {
    public static Properties readPropertiesFile(String fileName) {
        Properties property = new Properties();
        try (FileInputStream fis = new FileInputStream(fileName)) {
            property.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return property;
    }
}
