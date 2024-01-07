package com.Sanket.JWT_Auth_Demo.Entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class jwtRequest {
    private String email;
    private String password;
}
