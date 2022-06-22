import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FromCssToXPath {

    WebDriver wd;


    @Test
    public void fromCssToxPath() {
        wd = new ChromeDriver();

        wd.findElement(By.cssSelector("a[href]"));
        wd.findElement(By.xpath("//*[@a ='href']"));
        wd.findElement(By.xpath("//a[@href]"));//right

        wd.findElement(By.cssSelector("[href ^='/ho']"));
        wd.findElement(By.xpath("//*[starts-with = @href, '/ho']"));
        wd.findElement(By.xpath("//*[starts-with(@href, '/ho')]"));//right

        wd.findElement(By.cssSelector("div.focus"));
        wd.findElement(By.xpath("//*div[@class = 'focus']]"));
        wd.findElement(By.xpath("//div[@class = 'focus']"));//right
        wd.findElement(By.xpath("//div[contains(@class, 'focus')]"));//right

        wd.findElement(By.cssSelector("input[type='text']"));
        wd.findElement(By.xpath("//*input[@type = 'text']"));
        wd.findElement(By.xpath("//input[@type = 'text']"));//right

        wd.findElement(By.cssSelector("div #host"));
        wd.findElement(By.xpath("//*div[@id='host']"));
        wd.findElement(By.xpath("//div//*[@id='host']")); //right

        wd.findElement(By.cssSelector("table#contry tr:nt-child(3)) td:last-child"));
        wd.findElement(By.xpath("//*table[@id = 'country']//tr[3]//td[last]"));
        wd.findElement(By.xpath("//table[@id='country']//tr[3]//td[last()]")); //right

        wd.findElement(By.cssSelector("div#idName li:first-child"));
        wd.findElement(By.xpath("//*div[@id = 'idName']//li[last[1]]"));
        wd.findElement(By.xpath("//div[@id = 'idName']//li[1]"));//right

        wd.findElement(By.cssSelector("div#sort>div:nth-child(2)"));
        wd.findElement(By.xpath("//*div[@id = 'sort']/div[2]"));
        wd.findElement(By.xpath("//div[@id = 'sort']/div[2]"));//right

    }
}


