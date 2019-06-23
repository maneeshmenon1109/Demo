package demoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String simpleLogin(String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }

}
