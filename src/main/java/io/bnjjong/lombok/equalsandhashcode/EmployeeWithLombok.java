/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/09/05
 */

package io.bnjjong.lombok.equalsandhashcode;

import lombok.EqualsAndHashCode;
import lombok.Getter;

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
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EmployeeWithLombok {
  @EqualsAndHashCode.Include
  private int id;

  private String name;

  private int age;

  @EqualsAndHashCode.Include
  private String email;

  private String department;

  public EmployeeWithLombok(int id, String name, int age, String email, String department) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.email = email;
    this.department = department;
  }
}
