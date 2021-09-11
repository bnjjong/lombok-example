package io.bnjjong.lombok.equalsandhashcode;/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/09/05
 */

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
@Slf4j
class EmployeeWithLombokTest {

  @Test
  @DisplayName("equals test")
  void equalsTest() {
    Employee jongsang1 = getJongsang();
    Employee jongsang2 = getJongsang();

    log.info("jongsang1 hashcode : {}", jongsang1.hashCode());
    log.info("jongsang2 hashcode : {}", jongsang2.hashCode());

    assertThat(jongsang1).isEqualTo(jongsang2);
    assertThat(jongsang1.hashCode()).hasSameHashCodeAs(jongsang2.hashCode());
  }

  @Test
  @DisplayName("contains test")
  void containsTest() {
    List<Employee> employees = getEmployees();
    Employee jongsang = getJongsang();

    boolean contains = employees.contains(jongsang);

    assertThat(contains).isTrue();

    Set<Employee> employeeSet = new HashSet<>();
    employeeSet.add(getJongsang());
    employeeSet.add(getMinsoo());

    boolean contains1 = employeeSet.contains(jongsang);

    assertThat(contains1).isTrue();
  }

  @Test
  @DisplayName("lombok test")
  void test04() {
    List<EmployeeWithLombok> employee = new ArrayList<>();
    employee.add(getJongsang1());
    employee.add(getMinsoo2());

    boolean contains = employee.contains(getJongsang1());

    assertThat(contains).isTrue();
  }

  private Employee getJongsang() {
    return new Employee(
        1,
        "jongsang",
        37,
        "jongsang@email.com",
        "develop"
    );
  }

  private Employee getMinsoo() {
    return new Employee(
        2,
        "minsoo",
        30,
        "minsoo@email.com",
        "develop"
    );
  }


  private EmployeeWithLombok getJongsang1() {
    return new EmployeeWithLombok(
        1,
        "jongsang",
        37,
        "jongsang@email.com",
        "develop"
    );
  }

  private EmployeeWithLombok getMinsoo2() {
    return new EmployeeWithLombok(
        2,
        "minsoo",
        30,
        "minsoo@email.com",
        "develop"
    );
  }

  private List<Employee> getEmployees() {
    Employee jongsang = getJongsang();
    Employee minsoo = getMinsoo();
    return Arrays.asList(jongsang, minsoo);
  }






}