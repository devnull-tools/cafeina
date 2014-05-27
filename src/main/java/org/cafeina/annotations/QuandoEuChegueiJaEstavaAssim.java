package org.cafeina.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Anotação para ser usada naquelas vezes em que seu nome será lembrado pra
 * sempre por estar no histórico de alterações do SCM. Use isto e limpe sua
 * honra.
 *
 * @author Marcelo Guimarães
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface QuandoEuChegueiJaEstavaAssim {
}
