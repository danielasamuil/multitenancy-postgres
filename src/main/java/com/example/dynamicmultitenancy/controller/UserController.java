package com.example.dynamicmultitenancy.controller;

import com.example.dynamicmultitenancy.model.dto.UserDto;
import com.example.dynamicmultitenancy.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.dynamicmultitenancy.controller.UrlMapping.ENTITY;
import static com.example.dynamicmultitenancy.controller.UrlMapping.USERS;


@RestController
@RequestMapping(USERS)
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto user) {
        return userService.create(user);
    }

    @PutMapping(ENTITY)
    public UserDto edit(@PathVariable Integer id, @RequestBody UserDto userDto) {
        return userService.update(id, userDto);
    }

    @DeleteMapping()
    public void deleteAll() {
        userService.deleteAll();
    }

    @DeleteMapping(ENTITY)
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }
}
