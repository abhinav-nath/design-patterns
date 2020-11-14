package com.designpatterns.builder.example2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    String firstName;
    String lastName;

    AddressInfo addressInfo;
    SocialInfo socialInfo;

}