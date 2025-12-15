package com.kabita.airBnbClone.airBnbClone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(
        properties = {
                "spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
        }
)
class AirBnbCloneApplicationTests {

	@Test
	void contextLoads() {
        System.out.println("running");
	}

}
