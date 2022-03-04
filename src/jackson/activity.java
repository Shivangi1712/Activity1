package jackson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class activity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				driver.get("https://omayo.blogspot.com/");
				
				//for multiple selection box
				driver.findElement(By.xpath("//option[@value='volvox']//following-sibling::option[1]")).click();//use by following xpath
				driver.findElement(By.xpath("//option[@value='Hyundaix']//following-sibling::option")).click();
				
				//for dropbox
				Select drop = new Select(driver.findElement(By.xpath("//select[@id='drop1']")));
				drop.selectByVisibleText("doc 1");// use by select option id
				
				//for link
				driver.findElement(By.xpath("//a[@id='link1']")); // using by id
				driver.findElement(By.xpath("//a[@id='link2']"));// using by id[for second link]
				
				//for textbox
				driver.findElement(By.xpath("//input[@name=\"fname\" and contains(@type,\"text\")]")).clear();
				driver.findElement(By.xpath("//input[@name=\"fname\" and contains(@type,\"text\")]")).sendKeys(" Selenium Part 1");
				//use by contains and attribute
				
				//for link
				driver.findElement(By.xpath("//a[text()='SeleniumTutorial']"));
				
				
				//for button
				driver.findElement(By.xpath("//button[@id=\"but2\"]")).click(); 
				
		
				//for 3 buttons by text
				driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
				driver.findElement(By.xpath("//button[text()=\"Login\"]")).click();
				driver.findElement(By.xpath("//button[text()=\"Register\"]")).click();
				
				//for alertbox
				//driver.findElement(By.xpath("//input[@value=\"ClickAfterTextDissappears\"]")).click();
				
				
				//for uploading file
				driver.findElement(By.xpath("//input[@id=\"uploadfile\"]")).sendKeys("C:\\Users\\dell\\Desktop\\sss.txt");
				System.out.print("File is uploaded Successfully");
				
				
				//for tetxarea
				driver.findElement(By.xpath("//textarea[@id=\"ta1\"]")).sendKeys("Hello From Shivangi");
				
				//for username
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashu");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashu");
				

				//for inputs
				driver.findElement(By.xpath("//input[@name=\"userid\"]")).sendKeys("Shivangi Sharma");
				driver.findElement(By.xpath("//input[@name=\"pswrd\"]")).sendKeys("Shiv");
				
				
}
}