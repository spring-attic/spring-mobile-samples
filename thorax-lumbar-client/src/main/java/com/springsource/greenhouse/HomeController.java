package com.springsource.greenhouse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Device device) {
		return redirectToDeviceSite(device);
	}

	private String redirectToDeviceSite(Device device) {
		if (device.isMobile()) {
			return "redirect:/app/mobile/index.html";
		} else if (device.isTablet()) {
			return "redirect:/app/tablet/index.html";
		} else {
			return "redirect:/app/web/index.html";
		}
	}

}
