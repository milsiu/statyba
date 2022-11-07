package com.eshop.statyba.service;

import com.eshop.statyba.dto.CreateUserDto;
import com.eshop.statyba.entity.Role;
import com.eshop.statyba.entity.User;
import com.eshop.statyba.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(String.format("User %s does not exist", username)));
    }

    public void createNewUser(CreateUserDto createUserDto) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        User user = new User(createUserDto.getUsername(),
                encoder.encode(createUserDto.getPassword()));
        user.setRoles(Set.of(new Role(UUID.fromString("60dbb7bb-99a0-42eb-a837-8be6b697c074"), "USER")));
        userRepository.save(user);
    }
}
