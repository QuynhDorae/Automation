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


}
