package pack;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class wappprgm {
	 ChromeDriver driver;
	 
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.wappalyzer.com/");
	
}

@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]")).click();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span")).click();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div/form/div[1]/div[1]/div[1]/div/div[1]/button/span")).click();

}



}
