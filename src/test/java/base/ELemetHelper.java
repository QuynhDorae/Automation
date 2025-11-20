package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ELemetHelper {
    private WebDriver drive;

    public ELemetHelper(WebDriver drive) {
        this.drive = drive;
    }

    public ELemetHelper() {
    }

    public WebDriver getDrive() {
        return drive;
    }

    public void setDrive(WebDriver drive) {
        this.drive = drive;
    }

    public void clickId(String id) {
        drive.findElement(By.id(id)).click();
    }

    public void clickName(String name) {
        drive.findElement(By.name(name)).click();
    }

    public void clickClassName(String className) {
        drive.findElement(By.className(className)).click();

    }

    // linktext dùng để lấy toàn bo text của thẻ a
    public void clickLinkText(String linkText) {
        drive.findElement(By.linkText(linkText)).click();
    }

    //patialLinkText lấy text của thẻ a nhưng chỉ lấy 1 phần để tìm
    public void clickPatial(String patialLinkText) {
        drive.findElement(By.partialLinkText(patialLinkText)).click();
    }

    //cssSelector
    public void clickCssSelector(String cssSelector) {
        drive.findElement(By.cssSelector(cssSelector)).click();
    }
  /*  CSS Selector cơ bản:
    #id → chọn theo id
    .class → chọn theo class
    tag → chọn theo tên thẻ
    tag.class → thẻ kèm class
    tag[attr='value'] → chọn theo thuộc tính
    A B → chọn phần tử B nằm trong A
    A > B → chọn phần tử B là con trực tiếp của A
    :last-child / :first-child → chọn phần tử đầu/cuối

    Ví dụ:
            #username → id="username"
            .input-field → class="input-field"
    button.submit-btn → thẻ button có class submit-btn
    input[type='password'] → input password
    #login-form .forgot-link → class forgot-link trong login-form
    #login-form > button → button là con trực tiếp của login-form*/

    public void clickXPath(String xPath) {
        drive.findElement(By.xpath(xPath)).click();
    }

    //sendKey
    public void sendKeyId(String locatorId, String sendKeyId) {
        drive.findElement(By.id(locatorId)).sendKeys(sendKeyId);
    }

    public void sendKeyName(String locatorName, String sendKeyName) {
        drive.findElement(By.id(locatorName)).sendKeys(sendKeyName);
    }

    public void sendKeyClassName(String locatorClassName, String sendKeyClassName) {
        drive.findElement(By.id(locatorClassName)).sendKeys(sendKeyClassName);
    }

    public void sendKeyLinkText(String locatorLinkText, String sendKeyLinkText) {
        drive.findElement(By.id(locatorLinkText)).sendKeys(sendKeyLinkText);
    }

    public void sendKeyPatial(String locatorPatial, String sendKeyPatial) {
        drive.findElement(By.id(locatorPatial)).sendKeys(sendKeyPatial);
    }
    public void sendKeyCssSelector(String locatorCssSelector, String sendKeyCssSelector) {
        drive.findElement(By.id(locatorCssSelector)).sendKeys(sendKeyCssSelector);
    }
    public void sendKeyXPath(String locatorXPath, String sendKeyXPath) {
        drive.findElement(By.id(locatorXPath)).sendKeys(sendKeyXPath);
    }

}
