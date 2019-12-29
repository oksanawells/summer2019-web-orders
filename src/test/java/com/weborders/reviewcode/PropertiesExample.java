package com.weborders.reviewcode;

import com.weborders.utilities.ConfigurationReader;
import com.weborders.utilities.Driver;
import org.junit.Test;

public class PropertiesExample {


    @Test
    public void propertiesTest() {
        String value = ConfigurationReader.get("browser");
        System.out.println(value.toUpperCase());

        value = ConfigurationReader.get("url");

        System.out.println(value);

    }
    @Test
    public void driverExamples1 () {
    // Webdriver driver = Driver.get();
        Driver.get().get("https://google.com");
    }
    @Test
    public void driverExamples2 () {
        System.out.println(Driver.get().getTitle());
    }
}
