package Rest.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    //UC_01
    //GET Request - Responds with "Hello from BridgeLabz"
    @GetMapping("print")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }


    }


