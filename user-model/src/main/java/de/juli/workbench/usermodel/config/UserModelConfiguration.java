package de.juli.workbench.usermodel.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = { "de.juli.workbench.usermodel.entities.*" })
@EnableJpaRepositories(basePackages = { "de.juli.workbench.usermodel.repositories.*" })
public class UserModelConfiguration {

}
