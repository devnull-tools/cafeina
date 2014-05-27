package org.cafeina.annotations;

import java.lang.annotation.*;

/**
 * Ei! Acho que já vi esse código antes...
 *
 * @author Marcelo Guimarães
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Dejavu {

  /**
   * Locais onde o código já foi visto aprontando das suas.
   */
  String[] value() default {};

}
