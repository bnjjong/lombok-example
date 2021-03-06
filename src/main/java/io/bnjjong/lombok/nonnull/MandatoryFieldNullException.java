/*
 * Created By dogfootmaster@gmail.com on 2021
 * This program is free software
 *
 * @author <a href=“mailto:dogfootmaster@gmail.com“>Jongsang Han</a>
 * @since 2021/08/29
 */

package io.bnjjong.lombok.nonnull;

/**
 * create on 2021/08/29. create by IntelliJ IDEA.
 *
 * <p> 클래스 설명 </p>
 * <p> {@link } and {@link }관련 클래스 </p>
 *
 * @author Jongsang Han
 * @version 1.0
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
public class MandatoryFieldNullException extends RuntimeException{

  public MandatoryFieldNullException(String message) {
    super(message);
  }


}
