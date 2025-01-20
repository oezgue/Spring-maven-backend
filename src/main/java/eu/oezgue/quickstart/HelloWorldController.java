package eu.oezgue.quickstart;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
    //@CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping(path = "/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello Oezgue!");
        return response;
    }
}
