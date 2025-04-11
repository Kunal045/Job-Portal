package com.project.mapper;

import com.project.dto.UserDto;
import com.project.model.User;

public class UserMapper {
    public static UserDto getUserDto(User user) {
        return UserDto.builder()
                .id(user.getUserId())
                .name(user.getName())
                .email(user.getEmail())
                .password(user.getPassword())
                .role(user.getRole())
                .build();
    }

    public static User getUser(UserDto userDto) {
        return User.builder()
                .userId(userDto.getId())
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .role(userDto.getRole())
                .build();
    }
}
