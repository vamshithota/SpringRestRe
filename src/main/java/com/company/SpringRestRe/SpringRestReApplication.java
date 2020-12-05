package com.company.SpringRestRe;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringRestReApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestReApplication.class, args);
	}
	@Bean
	public LocaleResolver localeResolver() {
		AcceptHeaderLocaleResolver localRessolver = new AcceptHeaderLocaleResolver(); 
		localRessolver.setDefaultLocale(Locale.US);
			return localRessolver;
		}

}
