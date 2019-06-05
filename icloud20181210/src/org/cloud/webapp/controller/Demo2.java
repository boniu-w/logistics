package org.cloud.webapp.controller;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*@author WG
*@date 2019/06/04 20:52:17
*/
@Controller
@RequestMapping(value="/controller2")
public class Demo2 {

	
	@RequestMapping(value="/test")
	public String test( ModelMap mm) {
		System.out.println("controller2");
		
		Object object2 = mm.get("linkedHashMap");
		System.out.println(object2);
		
		LinkedHashMap linkedHashMap=(LinkedHashMap)object2;
		Set entrySet2 = linkedHashMap.entrySet();
		for (Object object : entrySet2) {
			System.out.println(object);
		}
		
		
		
		Set entrySet = mm.entrySet();
		for (Object object : entrySet) {
			System.out.println();
			System.out.println(object);
		}
		System.out.println("modelMap.hashCode() :  "+mm);
		return null;
	}
}
