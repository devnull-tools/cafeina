package org.cafeina;

/**
 * Interface que indica algo que faz alguma coisa... independente de ser
 * uma coisa boa ou não.
 *
 * @author Marcelo Guimarães
 */
public interface Command {

  /**
   * Tenta fazer alguma coisa.
   *
   * @throws Throwable se der merda
   */
  void execute() throws Throwable;

}
