package io.bnjjong.lombok.jacksonized;/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/09/11
 */

import static org.junit.jupiter.api.Assertions.assertThrows;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * create on 2021/09/11. create by IntelliJ IDEA.
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
class MemberTest {
  private static ObjectMapper mapper;

  @BeforeAll
  static void beforeAll() {
    mapper = new ObjectMapper();
  }

  @Test
  @DisplayName("mapper exception test")
  void test01() throws JsonProcessingException {
    // given
    String memberJson = "{\"name\":\"jordan\", \"age\":37 }";

    // then
    assertThrows(JsonProcessingException.class, () -> {
      mapper.readValue(memberJson, Member.class);
    });
  }
}