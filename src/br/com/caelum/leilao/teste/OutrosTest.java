package br.com.caelum.leilao.teste;

import static com.jayway.restassured.RestAssured.expect;
import org.junit.Test;

public class OutrosTest {

	@Test
	public void deveGerarUmCookie() {
		expect().cookie("rest-assured", "funciona").when().get("/cookie/teste");
	}

	@Test
	public void deveGerarUmHeader() {
		expect().header("novo-header", "abc").when().get("/cookie/teste");
	}

}
