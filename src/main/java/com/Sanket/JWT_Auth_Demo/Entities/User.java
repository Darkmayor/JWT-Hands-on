package com.Sanket.JWT_Auth_Demo.Entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String name;

    private String id;
    private String email;
}
