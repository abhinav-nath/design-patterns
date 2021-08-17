package com.codecafe.designprinciples.srp.coupling;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    private String id;
    private Date dob;
    private String address;

    /*
     * save() method is tightly coupled to Student class
     * it should be moved to a separate StudentRepository class
     */
    public void save() {
        // open JDBC connection
        // insert Student into DB
        // close connection
    }

}