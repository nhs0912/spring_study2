package kr.co.softcampus.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test1")
//	public String test1(HttpServletRequest request) {
	public String test1(HttpSession session) {
//		HttpSession session = request.getSession();
		session.setAttribute("data1", "문자열1");
		return "test1";
	}
	
	@GetMapping("/result1")
//	public String result1(HttpServletRequest request) {
	public String result1(HttpSession session) {
//		HttpSession session = request.getSession();
		String data1 = (String) session.getAttribute("data1");
		System.out.printf("data1: %s\n",data1);
		return "result1";
	}
}
