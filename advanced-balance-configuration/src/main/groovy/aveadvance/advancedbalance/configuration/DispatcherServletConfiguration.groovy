package aveadvance.advancedbalance.configuration

import groovy.transform.TypeChecked

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ScopedProxyMode
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = ["aveadvance.advancedbalance.controllers"])
class DispatcherServletConfiguration {

}
