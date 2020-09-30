package eu.europeana.auth.keycloakuser.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by luthien on 30/09/2020.
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "G'day dudes and duderinas!";
    }
}
