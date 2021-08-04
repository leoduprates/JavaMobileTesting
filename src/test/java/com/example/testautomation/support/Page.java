package com.example.testautomation.support;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page {

  private Collection<String> tags = new ArrayList<String>();
  private Driver driver = Driver.getInstance();
  private HashMap<String, String> pageObject = new HashMap<String, String>();
  private Logger logger = Logger.getLogger(Driver.class.getName());

  private static Page INSTANCE;

  private Page() {
  }

  public static Page getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Page();
    }

    return INSTANCE;
  }

  public Collection<String> getTags() {
    return this.tags;
  }

  public void setTags(Collection<String> tags) {
    this.tags = tags;
  }

  public void getPageObjects() {
    Gson gson = new Gson();
    Iterator<String> tag = this.tags.iterator();

    try {
      while (tag.hasNext()) {
        String filePath = String.format("%s/src/test/java/com/example/testautomation/pages/%s.json",
            System.getProperty("user.dir"), tag.next().replace("@", ""));
        JsonReader reader = new JsonReader(new FileReader(filePath));
        HashMap<String, String> json = gson.fromJson(reader, HashMap.class);

        for (String key : json.keySet()) {
          if (this.pageObject.containsKey(key)) {
            this.pageObject.remove(key);
          }

          this.pageObject.put(key, json.get(key));
        }
      }
    } catch (Exception exception) {
      logger.log(Level.SEVERE, exception.getMessage());
    }
  }

  public WebElement getElement(String key) {
    WebElement element = null;
    String mapping = this.pageObject.get(key);

    System.out.println(mapping);

    if (mapping != null) {
      String[] map = mapping.split(": ");
      String by = map[0];
      String locator = map[1];

      element = driver.getDriver().findElement(by, locator);
    } else {
      element = driver.getDriver().findElement(By.xpath(String.format("//*[@name | @id = '%s']", mapping)));
    }

    return element;
  }
}
