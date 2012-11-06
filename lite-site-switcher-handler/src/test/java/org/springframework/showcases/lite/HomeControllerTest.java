package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class HomeControllerTest {

	private HomeController controller = new HomeController();

	@Test
	public void homePageNormalSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(model));
	}

	@Test
	public void homePageMobileSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(model));
	}

	@Test
	public void homePageTabletSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(model));
	}

}
