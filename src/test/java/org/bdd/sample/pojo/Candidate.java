package org.bdd.sample.pojo;

import java.util.Objects;

public class Candidate {

  private String userName;
  private String password;
  private int age;
  private String organization;

  public Candidate(String userName, String password, int age, String organization) {
    this.userName = userName;
    this.password = password;
    this.age = age;
    this.organization = organization;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }

  public String getUserName() {
    return userName;
  }

  public String getPassword() {
    return password;
  }

  public int getAge() {
    return age;
  }

  public String getOrganization() {
    return organization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Candidate candidate = (Candidate) o;
    return age == candidate.age && Objects.equals(userName, candidate.userName) && Objects.equals(password, candidate.password) && Objects.equals(
        organization, candidate.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, age, organization);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Candidate{");
    sb.append("userName='")
        .append(userName)
        .append('\'');
    sb.append(", password='")
        .append(password)
        .append('\'');
    sb.append(", age=")
        .append(age);
    sb.append(", organization='")
        .append(organization)
        .append('\'');
    sb.append('}');
    return sb.toString();
  }

}
