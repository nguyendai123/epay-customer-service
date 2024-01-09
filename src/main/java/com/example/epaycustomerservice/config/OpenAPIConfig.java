package com.example.epaycustomerservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Epay Customer Service API Docs", version = "1.0"),
        security = {@SecurityRequirement(name = "basicAuth"),
        @SecurityRequirement(name = "bearerToken"),
        @SecurityRequirement(name = "mySecretHeader")}
)
@SecuritySchemes({
        @SecurityScheme(name = "basicAuth",
                type = SecuritySchemeType.HTTP,
                scheme = "basic"

        ),
        @SecurityScheme(name = "bearerToken",
        type = SecuritySchemeType.HTTP,
                scheme = "bearer",
                bearerFormat = "JWT"
        ),
        @SecurityScheme(name = "mySecretHeader",
        type = SecuritySchemeType.APIKEY,
        in = SecuritySchemeIn.HEADER
        )
})
public class OpenAPIConfig {
    // Cấu hình OpenAPI (Swagger) cho hệ thống
}
