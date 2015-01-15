package kui.hello.spring;

import org.springframework.boot.SpringApplication;

/**
 * エントリポイント
 *
 * <p>{@link SpringApplication} に処理を以上するだけ</p>
 * <p>Bean 定義として {@link Config} を呼ぶ</p>
 */
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Config.class, args);
    }
}
