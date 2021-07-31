package pl.szadoq.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.szadoq.demo.model.AppUser;
import pl.szadoq.demo.repo.AppUserRepo;

@Configuration
public class UserTest {

    public UserTest(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder) {
        AppUser appUser = new AppUser();
        appUser.setUsername("Adam");
        appUser.setPassword(passwordEncoder.encode("Adam123"));
        appUser.setRole("ROLE_ADMIN");
        appUserRepo.save(appUser);
    }
}
