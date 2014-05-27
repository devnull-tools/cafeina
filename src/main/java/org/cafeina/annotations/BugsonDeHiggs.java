package org.cafeina.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Indica um bug existente apenas em um ínfimo número de possibilidades
 * relacionadas a entradas de log, temperatura retal do usuário no momento do
 * erro, softwares não instalados no computador e outras coisas que tornam o
 * bug praticamente impossível de identificar (se é que ele de fato existe).
 *
 * @author Marcelo Guimarães
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BugsonDeHiggs {
}
