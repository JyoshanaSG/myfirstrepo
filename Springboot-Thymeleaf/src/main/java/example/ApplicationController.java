package example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ApplicationController {

	@RequestMapping("/helloworld")
	public String helloworld(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
        return "helloworld";
	}
	@RequestMapping("/myPage")
    public String myWebPage(Model model) {
        return "myPage";
    }
	@RequestMapping("/myPage2")
    public String myWebPage2(Model model) {
        return "myPage2";
    }
}