package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String translate() {
        return "dictionary";
    }

    @PostMapping("/dictionary")
    public String showResult(@RequestParam String english, ModelMap modelMap) {
        Map<String, String> list = new HashMap<>();
        list.put("car", "BMW");
        list.put("love", "iu iu");
        list.put("strong", "trau bo");
        list.put("camera", "may anh");

        String result = list.get(english);

        modelMap.addAttribute("english", english);
        modelMap.addAttribute("result", result);

        return "dictionary";
    }


}
