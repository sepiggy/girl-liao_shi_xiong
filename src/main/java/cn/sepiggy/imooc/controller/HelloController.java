package cn.sepiggy.imooc.controller;

import cn.sepiggy.imooc.dto.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
// @ResponseBody
// @Controller
public class HelloController {

    // @Value("${cupSize}")
    // private String cupSize;
    //
    // @Value("${age}")
    // private Integer age;
    //
    // @Value("${content}")
    // private String content;

    @Autowired
    private GirlProperties girlProperties;

    // @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    // @RequestMapping(value = {"/hello"})
    // @RequestMapping(value = "/{id}/say", method = RequestMethod.GET)
    // @RequestMapping(value = "/say", method = RequestMethod.GET)
    // public String say(@PathVariable("id") int id) {
    @GetMapping(value = "/say") // 组合注解, 类似的还有 @PostMapping @DeleteMapping
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer myId) {
        // return "Hello Spring Boot!";
        // return cupSize + age;
        // return content;
        // return girlProperties.getCupSize();
        // return "index";
        // return "id: " + id;
        return "myId: " + myId;
    }

}
