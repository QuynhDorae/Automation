package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EventTest {
    WebDriver drive;
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver();
        drive.get("https://vcong.vn/ords/r/vplus/gate/trang-ch%E1%BB%A7");
        // CLick vào thẻ a

    }
}

