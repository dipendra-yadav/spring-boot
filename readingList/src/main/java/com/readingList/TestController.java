package com.readingList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Gradle based,spring Boot  Application



@Controller
public class TestController {

	@RequestMapping("/welcome.html")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

}

/*
 * Note:In the application.properties we define the prefix and suffix as
 * follows. So in the above controller the /welcome.html correctly maps to
 * /WEB-INF/jsp/welcome.jsp.
 * 
 */