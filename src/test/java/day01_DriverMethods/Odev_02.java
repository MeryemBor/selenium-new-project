package day01_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev_02 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Amzon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanin Konumu = " +driver.manage().window().getPosition());
        System.out.println("Sayfanin Boyutlari = " +driver.manage().window().getSize());
        //Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(1000,500));
        //Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        int x=driver.manage().window().getSize().getHeight();
        System.out.println(x);
        int y=driver.manage().window().getSize().getWidth();
        System.out.println(y);

        if (x==500 && y==1000){
            System.out.println("passed");
        }else
            System.out.println("failed");

        //Sayfayi kapatin
        driver.close();




    }
}
