/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/08/31
 */

package io.bnjjong.lombok.settergetter;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * create on 2021/08/31. create by IntelliJ IDEA.
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
@Setter
public class Product {
  @Setter(AccessLevel.PRIVATE)
  private int productId;

  private String name;

  private int price;

  private String title;

  @Setter(AccessLevel.PROTECTED)
  private boolean soldout; // setSoldout, isSoldout 메서드를 생성함.


}
