package pl.akademiakodu.loremipsum.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.akademiakodu.loremipsum.Generator.Generator;


/**
 * Created by Eriot on 2017-09-10.
 */
@RestController
public class ApiPersonController
{
    Generator generator = new Generator();

    @GetMapping("api/home")
    public @ResponseBody
    String search(@RequestParam Integer number, Integer option)
    {
        switch(option)
        {
            case 1:
                return generator.generateParagraphs(number);
            case 2:
                return generator.generateSentences(number);
            case 3:
                return generator.generateWords(number);
        }
        return "dupa";
    }
}
