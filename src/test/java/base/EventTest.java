package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        elemetHelper.sendKeyId("P9999_USERNAME","quynhdt1");
        elemetHelper.sendKeyId("P9999_PASSWORD","0302");
        elemetHelper.clickId("P9999_PERSISTENT_AUTH");
        elemetHelper.clickClassName("t-Button-label");

    }
    public static void main(String[] args) {
        EventTest eventTest = new EventTest();
        eventTest.setUp();

    }
}

    // CSS Selector nâng cao:
//     nth-child(n) → chọn phần tử thứ n
//     [attr^='value'] → chọn phần tử có thuộc tính bắt đầu bằng value
//     [attr$='value'] → chọn phần tử có thuộc tính kết thúc bằng value
//     [attr*='value'] → chọn phần tử có thuộc tính chứa value
//     :nth-of-type(n) → chọn phần tử thứ n trong các phần tử cùng loại
//     :not(selector) → chọn phần tử không khớp với selector
//     */
//     public void clickXpath(String xpath) {

//         drive.findElement(By.xpath(xpath)).click();
//     }
//     // xpath nâng cao
//     /*


//     // 1. Chọn phần tử dựa trên thuộc tính:
//     //input[@type='text'] → chọn tất cả các thẻ input có thuộc tính type bằng 'text'
//     // 2. Chọn phần tử dựa trên văn bản:
//     //a[text()='Click me'] → chọn thẻ a có văn bản chính xác là 'Click me'
//     // 3. Chọn phần tử chứa văn bản:
//     //a[contains(text(),'Click')] → chọn thẻ a chứa văn bản 'Click'
//     // 4. Chọn phần tử dựa trên quan hệ cha-con:
//     //div[@class='container']/input → chọn thẻ input là con trực tiếp của thẻ div có class 'container'
//     // 5. Chọn phần tử dựa trên vị trí:
//     //(//input[@type='text'])[1] → chọn thẻ input đầu tiên có thuộc tính type bằng 'text'
//     // 6. Kết hợp nhiều điều kiện:
//     //input[@type='text' and @name='username'] → chọn thẻ input có cả hai thuộc tính type và name với giá trị tương ứng
//     */
