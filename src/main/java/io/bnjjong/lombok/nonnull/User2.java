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
public class User2 {

  @NonNull
  private String name;
  private int age;

  public User2(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    User2 user = new User2(null, 19); // it's valid
    log.info("{}", user.toString());
  }
}
