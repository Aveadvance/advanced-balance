package aveadvance.advancedbalance.configuration

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		[DispatcherServletConfiguration.class]
	}

	@Override
	protected String[] getServletMappings() {
		["/"]
	}

}
