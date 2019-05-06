import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionSelenuim {

    public WebDriver webDriver ;


    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "D:\\java_driver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.imooc.com/user/newlogin");
        webDriver.manage().window().maximize();
    }

    public void inputBox(){
        webDriver.findElement(By.name("email")).sendKeys("abc@qq.com");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webDriver.findElement(By.name("email")).clear();
        String attribute = webDriver.findElement(By.name("email")).getAttribute("placeholder");
        System.out.println(attribute);
    }

    public static void main(String[] args) {
        ActionSelenuim as = new ActionSelenuim();
        as.initDriver();
        as.inputBox();
    }
}
