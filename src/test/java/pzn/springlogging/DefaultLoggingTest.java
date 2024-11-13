package pzn.springlogging;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Slf4j
@SpringBootTest
//menambahkan properties baru untul belajar level
@TestPropertySource("classpath:application-log-level.properties")
public class DefaultLoggingTest {

    @Test
    void testDefaultLogging() {
        log.info("Hello World");
        //setelah menggunakan properties yang sudah di set, log.info tidak keluar
        //di karenakan di atur untuk folder pzn, level lognya warn ke atas, sehingga info tidak keluar
        log.warn("java logging");
        log.error("jav(a)");

        //ketika di jalankan, akan muncul default logging dimana ada tanggal, waktu
        //dan jenis log (level), process id, thread, class, dan pesan log.
    }

    //membuat test untuk rolling
    @Test
    void testLongLogging() {
        for (int i = 0; i < 100_000; i++) {
            log.warn("Hello {}", i);
        }
    }
    //hati hati jalaninnya, bisa lebih dari 1000 file

    //Jika tidak ingin menggunakan konfigurasi yang disediakan springboot, bisa membuat file logback.xml
    //namun tidak di anjurkan karena lebih rumit, dan lebih mudah menggunakan properties, yang selama ini dipelajari
}
