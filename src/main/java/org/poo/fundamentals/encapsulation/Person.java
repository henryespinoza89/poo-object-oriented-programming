package org.poo.fundamentals.encapsulation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {
  private static final Logger logger = LoggerFactory.getLogger(Person.class);
  private String name;
  private int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    if (age >= 0) {
      this.age = age;
    } else {
      logger.info("Age cannot be negative.");
    }
  }
  public void describe() {
    logger.info("Name: {}, Age: {}", name, age);
  }
}
