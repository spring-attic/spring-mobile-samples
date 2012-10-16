package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class HomeControllerTest {

	private HomeController controller = new HomeController();

	@Test
	public void homePageNormalDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(SitePreference.NORMAL, model));
	}

	@Test
	public void homePageMobileDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home-mobile", controller.home(SitePreference.MOBILE, model));
	}

	@Test
	public void homePageTabletDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home-tablet", controller.home(SitePreference.TABLET, model));
	}

}
