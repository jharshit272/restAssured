package com.restAssured.test.restAssured_test_project;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class SampleTest{

	@Test
	public void sampleLogin() {
		given()
		.when()
		   .get("http://localhost:8084/products")
		.then().statusCode(200);
	}
}