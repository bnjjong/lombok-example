
package io.bnjjong.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@ToString
@Getter
@Slf4j
@RequiredArgsConstructor
public class User {

  private String name;
  private int age;

  public User(@NonNull String name, int age) {
    if (name == null) {
    }
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    User user = new User(null, 19); // occur Exception
    log.info("{}", user.toString());
  }
}
