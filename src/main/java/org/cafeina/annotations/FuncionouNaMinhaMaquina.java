package org.cafeina.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Certificado de qualidade suprema em forma de anotação. Qualquer coisa
 * anotada com ela estará automaticamente isenta de testes.
 *
 * @author Marcelo Guimarães
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface FuncionouNaMinhaMaquina {
}
