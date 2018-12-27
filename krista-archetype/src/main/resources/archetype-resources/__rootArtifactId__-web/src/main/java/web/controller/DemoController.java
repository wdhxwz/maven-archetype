package ${package}.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 * @version V1.0.0
 * @since
 */
@RequestMapping("demo")
@RestController
public class DemoController {
    @GetMapping("/")
    public String index() {
        return "hello web";
    }
}