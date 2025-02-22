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

    //UC_04
// todo - Use POST Request Method and pass first name and last name in the Body
//todo.  Create User DTO Bean with firstName and lastName as   attributes.

    @PostMapping("/post")
    public String greetUser(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName() + " from BridgeLabz";
    }

    @GetMapping("/get")
    public String getUser(@RequestBody UserDTO userDTO) {
        return "Hello " + userDTO.getFirstName() + " " + userDTO.getLastName() + " from BridgeLabz";
    }

//UC05

    /* todo: Make REST Call to show Hello Mark Taylor from BridgeLabz -  Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter */

    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";


    }


}


