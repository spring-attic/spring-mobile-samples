/*
 * Copyright 2010-2017 the original author or authors.
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

package showcases;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Roy Clarkson
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

	private static final String NORMAL = "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.6; en-US; rv:1.9.2.12) Gecko/20101026 Firefox/3.6.12";

	private static final String MOBILE = "Mozilla/5.0 (iPhone; CPU iPhone OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53";

	private static final String TABLET = "Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) Version/7.0 Mobile/11A465 Safari/9537.53";

	@Autowired
	private TestRestTemplate rest;

	@Test
	public void normal() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set(HttpHeaders.USER_AGENT, NORMAL);
		ResponseEntity<String> response = rest.exchange("/", HttpMethod.GET, new HttpEntity<>(requestHeaders), String.class);
		assertThat(response.getBody()).contains("Home [Normal]");
	}

	@Test
	public void mobile() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set(HttpHeaders.USER_AGENT, MOBILE);
		ResponseEntity<String> response = rest.exchange("/", HttpMethod.GET, new HttpEntity<>(requestHeaders), String.class);
		assertThat(response.getBody()).contains("Home [Mobile]");
	}

	@Test
	public void tablet() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set(HttpHeaders.USER_AGENT, TABLET);
		ResponseEntity<String> response = rest.exchange("/", HttpMethod.GET, new HttpEntity<>(requestHeaders), String.class);
		assertThat(response.getBody()).contains("Home [Tablet]");
	}

	@Test
	public void normalWithSitePreferenceMobile() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set(HttpHeaders.USER_AGENT, NORMAL);
		ResponseEntity<String> response = rest.exchange("/?site_preference=mobile", HttpMethod.GET, new HttpEntity<>(requestHeaders), String.class);
		assertThat(response.getBody()).contains("Home [Mobile]");
	}

	@Test
	public void normalWithSitePreferenceTablet() {
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.set(HttpHeaders.USER_AGENT, NORMAL);
		ResponseEntity<String> response = rest.exchange("/?site_preference=tablet", HttpMethod.GET, new HttpEntity<>(requestHeaders), String.class);
		assertThat(response.getBody()).contains("Home [Tablet]");
	}

}
