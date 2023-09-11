package com.example.productmanagement.controller;
import com.example.productmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.productmanagement.entity.User; // Import your User entity
import org.springframework.security.crypto.password.PasswordEncoder; // Import PasswordEncoder
import com.example.productmanagement.entity.Role; // Import your Role entity
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


@Controller
@SuppressWarnings("unused")
public class RegistrationController {

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "registration"; // Render the registration form
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) {

        String encodedPassword = passwordEncoder.encode(password);

        // Creating a User entity and set its properties
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(encodedPassword);

        // Creating a Set of roles
        Set<Role> roles = new HashSet<>();
        roles.add(new Role("ROLE_USER")); // Assign the "USER" role
        user.setRoles(roles);

        System.out.println("User details for registration:");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Encoded Password: " + encodedPassword);

        //Saving the user to the database using UserRepository
        User savedUser = userRepository.save(user);
        System.out.println("Saved User ID: " + savedUser.getId());

        return "redirect:/login";
    }
}
