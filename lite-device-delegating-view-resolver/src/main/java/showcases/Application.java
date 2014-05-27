/*
 * Copyright 2010-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package showcases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mobile.device.view.LiteDeviceDelegatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author Roy Clarkson
 */
@EnableAutoConfiguration
@ComponentScan
public class Application {

	@Autowired
	public InternalResourceViewResolver internalResourceViewResolver;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public LiteDeviceDelegatingViewResolver liteDeviceAwareViewResolver() {
		LiteDeviceDelegatingViewResolver resolver = new LiteDeviceDelegatingViewResolver(internalResourceViewResolver);
		resolver.setMobilePrefix("mobile/");
		resolver.setTabletPrefix("tablet/");
		return resolver;
	}

}
