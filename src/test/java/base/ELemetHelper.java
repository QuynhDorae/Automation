package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ELemetHelper {
  private   WebElement webElement;

    public ELemetHelper() {

    }
    public ELemetHelper(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getWebElement() {
        return webElement;
    }

    public void setWebElement(WebElement webElement) {
        this.webElement = webElement;
    }
    public  void clickId(String id){
        webElement.findElement(By.id(id)).click();
    }
    public void clickName(String name){
        webElement.findElement(By.name(name)).click();
    }
    public  void clickClassName(String className){
        webElement.findElement(By.className(className)).click();
    }
    // linktext dùng để lấy toàn bo text của thẻ a
    public void clickLinkText(String linkText){
        webElement.findElement(By.linkText(linkText)).click();
    }
    //patialLinkText lấy text của thẻ a nhưng chỉ lấy 1 phần để tìm
    public  void clickPatial(String patialLinkText){
        webElement.findElement(By.partialLinkText(patialLinkText)).click();
    }


}
