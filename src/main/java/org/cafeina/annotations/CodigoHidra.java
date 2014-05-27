package org.cafeina.annotations;

/**
 * Indica que um código lendário foi introduzido. Prepare-se para atacá-lo e
 * ver que, a cada bug resolvido, vários outros aparecerão.
 *
 * @author Marcelo Guimarães
 */
public @interface CodigoHidra {

  /**
   * Indica quantos novos bugs são introduzidos para cada bug solucionado.
   */
  int fatorDeCrescimento() default 2;

}
