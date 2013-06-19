package com.kozlowski.geektic;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
@RequestMapping("/")
public class ControllerGeek {
	

	Service service;
	Interet interet;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView pageIndex(){		
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/creation_compte", method=RequestMethod.GET)
	public String creationCompte(){		
		return "creation_compte";
	}

	
	@RequestMapping(value="/recherche_mec", method=RequestMethod.GET)
	public String rechercheMec(){		
		return "recherche_mec";
	}
	
	@RequestMapping(value="/recherche_femme", method=RequestMethod.GET)
	public String rechercheFemme(){		
		return "recherche_femme";
	}
	
	@RequestMapping(value="/quisommenous", method=RequestMethod.GET)
	public String quiSommeNous(){		
		return "quisommenous";
	}
	
	@RequestMapping(value="/nouscontacter", method=RequestMethod.GET)
	public String nousContacter(){		
		return "quisommenous";
	}
	
	
	@RequestMapping(value="/affiche_geekette", method = RequestMethod.POST)
	public ModelAndView chercheGeekette(@RequestParam String[] langage, @RequestParam String sexe) {
		ModelAndView page = new ModelAndView("affiche_geekette");
		page.addObject("users", service.trouverGeekParLangage(sexe, langage));
		return page;
	}
	
	@RequestMapping(value="/affiche_geek", method = RequestMethod.POST)
	public ModelAndView chercheGeek(@RequestParam String[] langage, @RequestParam String sexe) {
		ModelAndView page = new ModelAndView("affiche_geek");
		page.addObject("users", service.trouverGeekParLangage(sexe, langage));
		return page;
	}
}
