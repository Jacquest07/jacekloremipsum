package pl.akademiakodu.loremipsum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.loremipsum.Generator.Form;
import pl.akademiakodu.loremipsum.Generator.Generator;

/**
 * Created by Eriot on 2017-09-01.
 */
@Controller
public class LoremIpsumController
{
    @GetMapping("/")
    public String home()
    {
        return "home";
    }

    @PostMapping("/generate")
    public String home(@ModelAttribute Form form, ModelMap modelMap)
    {
        Generator generator = new Generator();
        switch(form.getOption()){
            case 1:
                modelMap.addAttribute("lorem", generator.generateParagraphs(form.getNumber()));
                break;
            case 2:
                modelMap.addAttribute("lorem", generator.generateSentences(form.getNumber()));
                break;
            case 3:
                modelMap.addAttribute("lorem", generator.generateWords(form.getNumber()));
                break;
        }

        return "home";
    }
}
