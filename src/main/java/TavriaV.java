import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class TavriaV  {
    @Test

    public void NavigateBash (){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tavriav.ua/");
        //  WebElement searchField = driver.findElement(By.id("text"));
        //  searchField.sendKeys("445263");

        WebElement searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element638']/a/span/span[1]/span/img"));
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element419']/a/span/span[1]/span/img"));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element123']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element358']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element174']/a/span"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element222']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element5']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element395']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element320']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element538']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element89']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element255']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element488']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element525']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element15527']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element15483']/a/span/span[1]/span/img"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        searchButton =driver.findElement(By.xpath(".//*[@id='menu_link_element1502063']/a/span/span[1]/span/img"));
        searchButton.click();
    }

}
