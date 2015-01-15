package kui.hello.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.context.annotation.ComponentScan;


/**
 * コントローラ
 * <p>{@link Config} の {@link ComponentScan} によって検出されるクラス</p>
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/")
    @ResponseBody
    String root() {
        return "<p>Hello world";
    }
}
