package cadastroninja.cadastroninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/Wellcome")
    public String boasVindas() {
        return "It is my first router!!!";
    }

}
