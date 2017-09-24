package cn.sepiggy.imooc.girlliao_shi_xiong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say() {
        // return "Hello Spring Boot!";
        // return cupSize + age;
        // return content;
        return girlProperties.getCupSize();
    }

}
