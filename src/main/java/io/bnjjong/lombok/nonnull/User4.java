package io.bnjjong.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Getter
@ToString
public class User4 {


  private String name;
  private int age;

  public User4(@NonNull String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    User4 user = new User4(null, 19); // occur Exception
  }
}
