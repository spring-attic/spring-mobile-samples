/*
 * Copyright 2010-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.showcases.lite;

import static org.junit.Assert.assertEquals;

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
	}
	
	@Test
	public void homePageTabletSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home-tablet", controller.home(SitePreference.TABLET, model));
	}

	@Test
	public void homePageNormalSitePreference() {
		Model model = new ExtendedModelMap();
		assertEquals("home", controller.home(SitePreference.NORMAL, model));
	}

}
