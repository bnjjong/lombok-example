/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/09/05
 */

package io.bnjjong.lombok.equalsandhashcode;

import java.util.HashSet;
import java.util.Set;

/**
 * create on 2021/09/05. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Jongsang Han
 * @version 1.0
 * @see
 * @since 1.0
 */
public class Employee {
  private int id;

  private String name;

  private int age;

  private String email;

  private String department;

  public Employee(int id, String name, int age, String email, String department) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
    this.department = department;
  }

  /**
   * hashCode 오버라이딩
   * id가 같으면 같은 직원으로 인식하기 위하여 해시코드 값도 동일하게 반환한다.
   */
  @Override
  public int hashCode() {
    return (41 * (41 + getId()) + getEmail().hashCode());
  }

  /**
   * equals 오버라이딩
   * id가 같으면 같은 직원이다.
   */
  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (o == this) return true;
    if (getClass() != o.getClass()) return false;

    Employee e = (Employee) o;
    return (this.getId() == e.getId() && this.getEmail().equals(e.getEmail()) );
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getDepartment() {
    return department;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", email='" + email + '\'' +
        ", department='" + department + '\'' +
        '}';
  }

  public static void main(String[] args) {

    Set<Employee> employeeSet= new HashSet<>();
  }
}
