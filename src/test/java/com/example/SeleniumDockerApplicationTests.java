package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.testng.annotations.Test;

@SpringApplicationConfiguration(classes = SeleniumDockerSpringbootApplication.class)
public class SeleniumDockerApplicationTests extends Base {

    @Test
    public void contextLoads() {
        // And now use this to visit Google
        webDriver.get("http://www.google.com");

        // Find the text input element by its name
        WebElement element = webDriver.findElement(By.name("q"));

        // Enter something to search for
        element.sendKeys("Cheese");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();

        // Check the title of the page
        System.out.println("Page title is: " + webDriver.getTitle());
    }

}


