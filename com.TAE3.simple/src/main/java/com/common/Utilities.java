/**
 * 
 */
package com.common;

import org.openqa.selenium.By;

/**
 * @author sshada
 *
 */
public class Utilities extends TestBase {

	// Validate Titles
	public void validateTitle(String expTitle) {
		String actTitle = driver.getTitle();
		if(actTitle.equalsIgnoreCase(expTitle)) {
			System.out.println("Tile validation :: PASSED");
		} else {
			System.out.println("Tile validation :: FAILED , Actual Title ::  "+ actTitle + " Expected Title ::  "+ expTitle);	
		}
	}


	// Validate ULRs
	public void validateURLS(String expURL) {
		String actURL = driver.getCurrentUrl();
		if(actURL.equalsIgnoreCase(expURL)) {
			System.out.println("Tile validation :: PASSED");
		} else {
			System.out.println("Tile validation :: FAILED , Actual Title ::  "+ actURL + " Expected Title ::  "+ expURL);	
		}
	}


	// Click on Element
	public void clickOnElement() {
		driver.findElement(By.cssSelector(".btn.btn-success.btn-large")).click();
	}
}
