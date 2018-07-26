package xanxus.spring.hellobasicauthentication;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

@RestController
@Secured("ROLE_ADMIN")
public class WebController {

    @RequestMapping(value = "/api/test1", method = {RequestMethod.GET})
    @ResponseBody
    public String queryFirstName() {
        return "Hello";
    }

}
