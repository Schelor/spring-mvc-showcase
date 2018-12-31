package org.springframework.samples.mvc.data.custom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomArgumentController {

	@ModelAttribute
	void beforeInvokingHandlerMethod(HttpServletRequest request) {
		request.setAttribute("foo", "bar");
	}
	
	@GetMapping("/data/custom")
	public String custom(@RequestAttribute("foo") String foo) {
		return "Got 'foo' request attribute value '" + foo + "'";
	}

	@GetMapping(value = "/data/custom2", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String custom2(RequestBean requestBean) {

	    return requestBean.toString();
    }

    @GetMapping(value = "/data/custom3")
    public String custom3(RequestBean requestBean) {

        return requestBean.toString();
    }

    @GetMapping(value = "/data/custom4")
    public RequestBean custom4(RequestBean requestBean) {

        return requestBean;
    }
}
