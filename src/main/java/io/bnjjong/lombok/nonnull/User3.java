package io.bnjjong.lombok.nonnull;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@ToString
@Getter
@Slf4j
public class User3 {

  @NonNull
  @Setter
  private String name;
  private int age;

  public static void main(String[] args) {
    User3 user = new User3();
    user.setName(null); // occur Exception
    log.info("{}", user.toString());
  }
}
