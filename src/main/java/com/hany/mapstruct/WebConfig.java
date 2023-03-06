/**
 * 
 */
package com.hany.mapstruct;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author hany
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "hany.modern.treasury.annotation"} )
public class WebConfig implements WebMvcConfigurer {
	

}
