package com.cristiano.ecommerce.dto;

import com.cristiano.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String email;
    private String name;
    private UserRole userRole;

}
