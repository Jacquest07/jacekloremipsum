package pl.akademiakodu.loremipsum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
