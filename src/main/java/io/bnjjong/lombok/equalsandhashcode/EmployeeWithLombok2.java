/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/09/05
 */

package io.bnjjong.lombok.equalsandhashcode;

import lombok.AllArgsConstructor;
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
public class EmployeeWithLombok2 {
  @EqualsAndHashCode.Include
  private String id;
  private String name;
  private String age;

  @EqualsAndHashCode.Include
  private String email;

  private String department;

  public static void main(String[] args) {

  }

}
