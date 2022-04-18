package com.codecafe.designprinciples.srp.coupling;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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