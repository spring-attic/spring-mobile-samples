package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.mobile.device.DeviceType;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

public class HomeControllerTest {

	private HomeController controller = new HomeController();

	@Test
	public void homePageDefaultDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(null, model));
	}

	@Test
	public void homePageNormalDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.NORMAL), model));
	}

	@Test
	public void homePageMobileDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.MOBILE), model));
	}

	@Test
	public void homePageTabletDevice() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(new StubDevice(DeviceType.TABLET), model));
	}

}
