package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");
        Thread.sleep(3000);
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        //Tekrar YouTube’sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //Sayfayi Refresh(yenile) yapalim
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();


    }
}






