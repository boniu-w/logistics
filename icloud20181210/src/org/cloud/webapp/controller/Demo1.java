package org.cloud.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
*@author WG
*@date 2019/06/04 20:54:40
*/
@Controller
@RequestMapping(value="/controller1")
public class Demo1 {

	
	@RequestMapping(value="test")
	public String test(RedirectAttributes ra) {
		
		ra.addAttribute("name", "lili");
		
		return "redirect:/controller2/test";
	}
}
