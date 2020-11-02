package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class EscolhaPeaoTest {
    @Test
    public void testEscolherPeao() {
        // Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jaul\\Downloads\\chromedriver\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.manage().window().maximize();

        // Navegando para a página teste
        navegador.get("https://afazenda.r7.com/a-fazenda-12/votacao");


             // Clicar no peão a ser votado (Clicar no console e procurar o que tem que ser achado)
            navegador.findElement(By.xpath("//div//button[@data-id=\"594\"]")).click();


        int i = 0;
        while(i <= 10000) {

            // Escolher peão novamente.
            navegador.findElement(By.xpath("//li[@id=\"594\"]")).click();

            // Clicar no botão de Votar
            navegador.findElement(By.xpath("//button[@class=\"voting-button voting-button--medium disabled\"]"))
                    .click();

            // Clicar em Votar Novamente
            navegador.findElement(By.xpath("//i[@class=\"fa fa-spinner fa-spin\"]"))
                    .click();

            assertEquals(1, 1);

            i = i + 1;
        }
    }
}