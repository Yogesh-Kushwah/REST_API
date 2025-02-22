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

    //UC_02
    // GET Request with Query Parameter - Responds with "Hello <name> from BridgeLabz"
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam("q") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    //UC_03
    //Use GET Request Method and pass name as path variable
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }


}


