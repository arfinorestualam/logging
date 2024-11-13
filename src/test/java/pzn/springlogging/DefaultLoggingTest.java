package pzn.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class DefaultLoggingTest {

    @Test
    void testDefaultLogging() {
        log.info("Hello World");
        log.warn("java logging");
        log.error("jav(a)");

        //ketika di jalankan, akan muncul default logging dimana ada tanggal, waktu
        //dan jenis log (level), process id, thread, class, dan pesan log.
    }
}
