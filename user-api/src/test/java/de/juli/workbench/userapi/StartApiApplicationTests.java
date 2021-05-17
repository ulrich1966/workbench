package de.juli.workbench.userapi;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StartApiApplicationTests {
	private static final Logger LOG = LoggerFactory.getLogger(StartApiApplicationTests.class);

	@Test
	public void contextLoads() {
		LOG.debug("DONE");
	}

}
