package org.cafeina.exception;

/**
 * Exceção lançada quando aquele erro proveniente de um código ou ação
 * inacreditável. Geralmente indica um elevado nível de estupidez humana.
 *
 * @author Marcelo Guimarães
 */
public class UnbelievableException extends RuntimeException {

  public UnbelievableException() {
  }

  public UnbelievableException(String message) {
    super(message);
  }

  public UnbelievableException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnbelievableException(Throwable cause) {
    super(cause);
  }

}
