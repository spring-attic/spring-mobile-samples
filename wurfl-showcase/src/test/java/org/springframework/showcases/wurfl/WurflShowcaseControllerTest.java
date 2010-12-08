package org.springframework.showcases.wurfl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mobile.device.site.SitePreference;

public class WurflShowcaseControllerTest {
	
	private WurflShowcaseController controller = new WurflShowcaseController();
	
	@Test
	public void homePageMobileSitePreference() {
		assertEquals("home-mobile", controller.home(SitePreference.MOBILE));
	}

	@Test
	public void homePageNormalSitePreference() {
		assertEquals("home", controller.home(SitePreference.NORMAL));
	}

}
