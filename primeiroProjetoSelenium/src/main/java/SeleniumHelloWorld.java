import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumHelloWorld {
	public static void main(String[] args) throws Exception {
		// Daniel Paiva - Exemplo Automação

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Paiva\\Desktop\\projetoSelenium\\msedgedriver.exe");
		
		// Instanciando o EdgeDriver
		EdgeDriver driver = new EdgeDriver();

		// TryCatch para evitar algum erro
		try {
			driver.navigate().to("https://bing.com");

			WebElement element = driver.findElement(By.id("sb_form_q"));
			element.sendKeys("Hello World");
			element.submit();

			Thread.sleep(5000);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Deu algum erro!");
		} finally {
			driver.quit();
		}
	}
}