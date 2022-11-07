package com.eshop.statyba.dto;

import com.eshop.statyba.entity.Role;
import com.eshop.statyba.entity.User;
import lombok.Data;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class UserDto {
    private String username;
    private String password;
    private Set<String> roles;

    public UserDto(@NotNull User user) {
        username = user.getUsername();
        password = user.getPassword();
        roles = user.getRoles().stream().map(Role::getName).collect(Collectors.toSet());
    }
}
