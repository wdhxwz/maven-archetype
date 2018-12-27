package ${package}.job.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "hello job";
    }
}