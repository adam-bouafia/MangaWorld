package it.univaq.sose.mangastorecommons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

@Configuration
@EnableJpaAuditing
public class AuditingConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new SpringSecurityAuditAwareImpl();
    }
}

/**
 * Implementation of the AuditorAware interface for Spring Security.
 * This class is responsible for providing the current auditor (user) for auditing purposes.
 */
class SpringSecurityAuditAwareImpl implements AuditorAware<String> {

    /**
     * Retrieves the current auditor (user) from the Spring Security context.
     *
     * @return An Optional containing the current auditor (user) if available, or an empty Optional otherwise.
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null ||
                !authentication.isAuthenticated() ||
                authentication instanceof AnonymousAuthenticationToken) {
            return Optional.empty();
        }

        String userPrincipal = (String)authentication.getPrincipal();

        return Optional.ofNullable(userPrincipal);
    }
}
