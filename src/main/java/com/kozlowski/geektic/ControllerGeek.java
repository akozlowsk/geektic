package com.kozlowski.geektic;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 

@Controller
@RequestMapping("/")
public class ControllerGeek {
	
	@RequestMapping(method=RequestMethod.GET)
	public String pageIndex(){		
		return "index";
	}
	
	@RequestMapping(value="/creation_compte", method=RequestMethod.GET)
	public String creationCompte(){		
		return "creation_compte";
	}
}
