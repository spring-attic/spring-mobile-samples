/*
 * Copyright 2010 the original author or authors.
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
package org.springframework.showcases.wurfl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.mobile.device.mvc.DeviceWebArgumentResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

/**
 * A PostProcessor for Spring MVC's {@link AnnotationMethodHandlerAdapter}.
 * Performs additional configuration on the adapter instance required by the Greenhouse application.
 * Currently, this includes the registration of custom web argument resolvers.
 * 
 * TODO - see SPR-7327: it would be better to do this as part of instantiating AnnotationMethodHandlerAdapter.
 * Support in Spring MVC namespace should be added for that (this class would go away then)
 * 
 * @author Keith Donald
 */
@Component
public class WebArgumentResolverInstaller implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
		if (bean instanceof AnnotationMethodHandlerAdapter) {
			AnnotationMethodHandlerAdapter controllerInvoker = (AnnotationMethodHandlerAdapter) bean;
			WebArgumentResolver[] resolvers = new WebArgumentResolver[1];
			resolvers[0] = new DeviceWebArgumentResolver();
			controllerInvoker.setCustomArgumentResolvers(resolvers);
		}
		return bean;
	}
	
}