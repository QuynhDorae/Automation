package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class baseTest {
private WebDriver driver;
    public void setUp() {
         // thết lập thuộc tính hệ thống nhưng set cứng theo máy bị bất tiện
       // System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver.exe");
        //dùng cách tự động cài drive phù phợp với phiên bản trình duyệt đang dùng
        WebDriverManager.chromedriver().setup();
         // tạo phiên bản mới của trình duyệt, cho phép thực hiện các thao tác tự ộng háo trên triình duyêt
         driver=new ChromeDriver();
         // khơỉ chạy trình duyệt
        driver.get("https://vcong.vn/ords/r/vplus/gate/trang-ch%E1%BB%A7");
        // mở full màn window
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().window().setSize(new org.openqa.selenium.Dimension(600, 800));
        driver.manage().window().setPosition(new org.openqa.selenium.Point(50, 50));
        // điều hướng đến một URL mới
        driver.navigate().to("https://www.facebook.com/groups/734948885812178");
        // điều hướng quay lại trang trước đó
        driver.navigate().back();
        // điều hướng tiến về trang tiếp theo
        driver.navigate().forward();
        // làm mới trang hiện tại
        driver.navigate().refresh();
        
    }


    public static void main(String[] args) {
        baseTest baseTest = new baseTest();
        baseTest.setUp();

    }
}
