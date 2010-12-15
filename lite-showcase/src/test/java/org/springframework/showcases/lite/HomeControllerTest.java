package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.springframework.mobile.device.site.SitePreference;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class HomeControllerTest {
	
	private HomeController controller = new HomeController();
	
	@Test
	public void homePageMobileSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home-mobile", controller.home(SitePreference.MOBILE, model));
		assertEquals(true, model.asMap().get("mobileSitePreference"));
	}

	@Test
	public void homePageNormalSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(SitePreference.NORMAL, model));
		assertFalse(model.containsAttribute("mobileSitePreference"));
	}

}
