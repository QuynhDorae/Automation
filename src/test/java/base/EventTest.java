package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventTest {
    ELemetHelper elemetHelper=new ELemetHelper();
    public void setUp() {

        WebDriverManager.chromedriver().setup();
        WebDriver drive = new ChromeDriver();
        drive.get("https://vcong.vn/ords/r/vplus/gate/trang-ch%E1%BB%A7");
        elemetHelper.setDrive(drive);
        // CLick vào class name
        System.out.println(drive);
        elemetHelper.clickClassName("t-MediaList-itemWrap");


    }
    public static void main(String[] args) {
       EventTest eventTest = new EventTest();
       eventTest.setUp();

    }
}

