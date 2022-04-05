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

import org.springframework.mobile.device.site.SitePreference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the Home page.
 * @author Keith Donald
 * @author Roy Clarkson
 */
@Controller
public class HomeController {

	/**
	 * Show the home page to the user. Declares a {@link SitePreference} parameter to show
	 * how you can resolve the user's site preference. This controller renders a different
	 * version of the home view if the user has a mobile site preference.
	 */
	@RequestMapping("/")
	public String home(SitePreference sitePreference, Model model) {
		if (sitePreference == SitePreference.MOBILE) {
			return "home-mobile";
		} else if (sitePreference == SitePreference.TABLET) {
			return "home-tablet";
		} else {
			return "home";
		}
	}

}
