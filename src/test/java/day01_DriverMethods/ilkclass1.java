package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkclass1 {
    public static void main(String[] args) {

            System.setProperty("WebDriver.chrome.driver","src/resources/drivers/chromedriver.exe" );
            /*
            En temel haliyle otomasyon yapmak icin Class'imiza otomasyon icin gerekli olan webdriver'in yerini gostermeniz gerekir.
             Bunun icin java kutuphanesinden System.setProperty() methodunun icine ilk olarak driver'i yazariz.
              ikinci olarak driver'in fiziki yolunu kopyalariz
             */
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techproeducation.com");


    }
}
