package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;
import org.springframework.mobile.device.DeviceType;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class HomeControllerTest {

	private HomeController controller = new HomeController();

	@Test
	public void homePageNormalDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.NORMAL), model));
		Map<String,Object> attributes = model.asMap();
		assertEquals(attributes.get("deviceType"), "normal");
	}
	
	@Test
	public void homePageMobileDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.MOBILE), model));
		Map<String,Object> attributes = model.asMap();
		assertEquals(attributes.get("deviceType"), "mobile");
	}
	
	@Test
	public void homePageTabletDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.TABLET), model));
		Map<String,Object> attributes = model.asMap();
		assertEquals(attributes.get("deviceType"), "tablet");
	}

}
