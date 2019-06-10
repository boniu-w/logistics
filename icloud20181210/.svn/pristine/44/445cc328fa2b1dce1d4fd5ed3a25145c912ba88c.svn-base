package org.cloud.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.cloud.model.Lmmmorg;
import org.cloud.service.Slvb116Service;
import org.cloud.webapp.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.util.MessageSource;

@Controller
@RequestMapping(value="slvb116Controller")
public class Slvb116Controller extends BaseController {
	@Autowired
	Slvb116Service slvb116Service;
	/**
	 * 子页面組織マスタ初期処理模糊查询
	 * @param appOrgCode,lmmmorg
	 * @return
	 */
	@RequestMapping(value="/init")
	public ModelAndView init(Lmmmorg lmmmorg,String appOrgCode,HttpServletRequest request) {
		lmmmorg.setOrgcod(appOrgCode);
		//从session拿出tntcod用于模糊查询
		HttpSession session = request.getSession();
		String tntcod = (String)session.getAttribute("tntcod");
		lmmmorg.setTntcod(tntcod);
		List<Lmmmorg> query = slvb116Service.query(lmmmorg);
		//将查询结果返回子页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("query", query);
		modelAndView.addObject("appOrgCode_text",appOrgCode);
		modelAndView.setViewName("/slvb116/slvb116");
		return modelAndView;
	}
	/**
	 * 子页面組織マスタ模糊查询
	 * @param appOrgCode,lmmmorg
	 * @return
	 */
	@SuppressWarnings("unused")
	@RequestMapping(value="/search")
	public ModelAndView search(Lmmmorg lmmmorg,HttpServletRequest request) {
		//从session拿出tntcod用于模糊查询
		HttpSession session = request.getSession();
		String tntcod = (String)session.getAttribute("tntcod");
		lmmmorg.setTntcod(tntcod);
		List<Lmmmorg> query = slvb116Service.query(lmmmorg);
		//将查询结果返回页面
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/slvb116/slvb116");
		modelAndView.addObject("query", query);
		return modelAndView;

	}
}
