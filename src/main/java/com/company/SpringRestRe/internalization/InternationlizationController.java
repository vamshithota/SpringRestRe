package com.company.SpringRestRe.internalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class InternationlizationController {

	@Autowired
	MessageSource messsageSource;
	
	@ApiOperation("getting internalization data")
	@GetMapping(path = "/api/internalization")
	public String getData() {
		
		return messsageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
	}

	
}
