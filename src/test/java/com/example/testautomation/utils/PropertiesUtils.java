package com.example.testautomation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesUtils {

  private Logger logger = Logger.getLogger(PropertiesUtils.class.getName());

  public String get(String property) {
    String value = "";
    String config = System.getProperty("user.dir") + "/src/test/resources/configs/config.properties";

    try (InputStream input = new FileInputStream(config)) {
      Properties prop = new Properties();
      prop.load(input);
      value = prop.getProperty(property);
    } catch (IOException exception) {
      logger.log(Level.SEVERE, exception.getMessage());
    }
    
    return value;
  }
}