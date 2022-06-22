import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FromXPathToCss {

    WebDriver wd;

    @Test
    public void fromXPathToCss(){
        wd = new ChromeDriver();

        wd.findElement(By.xpath("//*[@id='host"));
        wd.findElement(By.cssSelector("#'host'"));

        wd.findElement(By.xpath("//button[@class='submit']"));
        wd.findElement(By.cssSelector("button.submit"));

        wd.findElement(By.xpath("//div/div/img[@src='paris.jpg']"));
        wd.findElement(By.cssSelector("div>div>img[src='paris.jpg']"));

        wd.findElement(By.xpath("//div[@class='first' and @class='list']"));
        wd.findElement(By.cssSelector("div.first > .list"));

        wd.findElement(By.xpath("//div[contains(@class,'st']"));
        wd.findElement(By.cssSelector("div[class$='st']"));

        wd.findElement(By.xpath("//div[@id=’idName’]//h1[last()]"));
        wd.findElement(By.cssSelector("div#'idName' h1:last-child"));

        wd.findElement(By.xpath("//table[@id]//tr[last()]"));
        wd.findElement(By.cssSelector("table# tr:last-child"));

        wd.findElement(By.xpath("//a[starts-with(@id,'ret')]"));
        wd.findElement(By.cssSelector("a=[id^ = 'ret']"));

    }
}
