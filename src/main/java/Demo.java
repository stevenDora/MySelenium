import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



//https://www.cnblogs.com/iceb/p/7111878.html
public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\java_driver\\chromedriver.exe");

        WebDriver webDriver = null;

        webDriver = new ChromeDriver();
       /* webDriver.get("https://www.imooc.com/");*/
        webDriver.get("https://www.imooc.com/user/newlogin");
        webDriver.findElement(By.tagName("input")).sendKeys("user@qq.com");
        webDriver.findElement(By.name("password")).sendKeys("sss123213123");
        webDriver.findElement(By.id("auto-signin")).click();
        webDriver.findElement(By.className("moco-btn")).click();
        webDriver.get("https://www.imooc.com/");
        webDriver.findElement(By.className("search-input")).sendKeys("springboot");
        webDriver.findElement(By.className("icon-search")).click();
    }
}
