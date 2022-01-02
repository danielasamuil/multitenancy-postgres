package com.example.dynamicmultitenancy.model.mapper;

import com.example.dynamicmultitenancy.model.dto.UserDto;
import com.example.dynamicmultitenancy.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(target = "name", source = "user.username")
    })
    UserDto userMinimalFromUser(User user);

    @Mappings({
            @Mapping(target = "username", source = "name")
    })
    User fromDto(UserDto userDto);
}