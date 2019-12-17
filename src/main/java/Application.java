import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application
{
    public static void main(String[] args)
    {

       System.setProperty("webdriver.chrome.driver","C:/WebDriver/bin2/chromedriver_win32/chromedriver.exe");
        WebDriver webdriver =  new ChromeDriver();
  //     WebDriver webdriver1 =  new FirefoxDriver();
        webdriver.get("https://it-ebooks.info");
        ((ChromeDriver) webdriver).findElementByXPath("/html/body/div[2]/div[1]/a");
        System.out.println(webdriver.getTitle());
    }
}
