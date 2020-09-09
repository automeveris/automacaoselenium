package com.bddeveris.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bddeveris.pages.CommonPage;
import com.bddeveris.runner.ClassInit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CommonSteps {
	
	WebDriver driver;
	CommonPage page;
	WebDriverWait wait = new WebDriverWait(ClassInit.driver, 10);
	JavascriptExecutor js = (JavascriptExecutor) ClassInit.driver;

	@Given("que eu ingresso na url {string}")
	public void que_eu_ingresso_na_tela(String url) {
		this.driver = ClassInit.driver;
		//page = new CommonPage(ClassInit.driver);
		page = new CommonPage(driver);
		page.openUrl(url);
	}

	/**Método que verifica se uma mensagem é exibida na tela
	 * @param expected - Texto que se espera encontrar
	 */
	@Then("eu verifico se a mensagem {string} é exibida")
	public void eu_verifico_se_a_mensagem_é_exibida(String expected) {
		waitElementVisibility(page.notificationText());
		String actual = page.notificationText().getText();
		actual = actual.replace("\n" + "×", "");
		Assert.assertEquals("Era esperada a mensagem: "+expected+" e foi encontrado: "+actual, expected, actual);
	}

	@When("eu insiro o texto {string} no campo com id {string}")
	public void eu_insiro_o_texto_no_campo_com_id(String text, String id) {
		page.inputById(id).sendKeys(text);
	}

	@When("eu clico no botão que contém o texto {string}")
	public void eu_clico_no_botão_que_contém_o_texto(String text) {
		page.buttonByText(text).click();
	}

	/**Método para rolar a página informando a quantidade de pixels e a direção
	 * @param pixels - quantidade de pixels que se deseja rolar a página
	 * @param direction - para "cima" ou para "baixo"
	 * @throws InterruptedException 
	 */
	@When("eu rolo a página {int} pixels para {string}")
	public void eu_rolo_a_página_pixels_para(Integer pixels, String direction) throws InterruptedException {
		int pxl =0;
		if(direction.equals("cima")) {
			pxl = pixels *-1;
		}else if(direction.equals("baixo")) {
			pxl = pixels;
		}
	
		js.executeScript("window.scrollBy(0,"+pxl+")");
		Thread.sleep(1000); // O motivo dessa espera é para conseguirmos ver a ação
	}

	/**Método para buscar um texto específico enquanto rola a página
	 * @param occurrence - o número da ocorrência que se deseja busca (ex. 1 para primeira, 2 para a segunda etc.)
	 * @param text - Texto que se deseja encontrar
	 * @throws Exception - Erro se o texto não for encontrado
	 */
	@Then("eu rolo página até a {int} a. ocorrência do texto {string}")
	public void eu_rolo_página_até_a_a_ocorrência_do_texto(Integer occurrence, String text) throws Exception {
		int SCROLL = 300;
		int scroll_count = 0;
		int SCROLL_LIMIT = 10000; 	
		int check = 0;
	   while(scroll_count <= SCROLL_LIMIT) {
		   check = driver.findElements(By.xpath("//div[contains(text(),"+text+")]["+occurrence+"]")).size();
		   if(check==0) {
			   js.executeScript("window.scrollBy(0,"+SCROLL+")");
			   scroll_count += SCROLL;		   
		   } else {
			   if(scroll_count<= SCROLL_LIMIT && check ==0) {
				   throw new Exception("O texto não foi encontrado");
			   }
			   break;
		   }
	   }
	}

	  /**Método de espera até que um elemento seja clicável
	 * @param element - WebElement que deverá ser clicável
	 */
	public void waitElementBJeClickable(WebElement element) {
	 	wait.until(ExpectedConditions.elementToBeClickable(element));
	 }

	  public void waitElementVisibility(WebElement element) {
		  wait.until(ExpectedConditions.visibilityOf(element));
	  }

}
