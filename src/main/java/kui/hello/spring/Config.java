package kui.hello.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Bean 定義
 *
 * <p>今回は {@link ComponentScan} だけ</p>
 */
@EnableAutoConfiguration
@ComponentScan("kui.hello.spring")
public class Config {
}
