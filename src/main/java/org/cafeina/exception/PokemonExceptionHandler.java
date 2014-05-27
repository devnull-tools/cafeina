package org.cafeina.exception;

import org.cafeina.Command;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Classe que implementa o padrão de projeto Pokemon Exception Handling,
 * que consiste em capturar todas as exceções e aumentar a taxa de suicídio
 * entre os mantenedores de código!
 *
 * @author Marcelo Guimarães
 */
public class PokemonExceptionHandler implements Runnable {

  private final Command command;
  private final PokeBall pokeball;

  public PokemonExceptionHandler(Command command) {
    this.command = command;
    this.pokeball = new PokeBall();
  }

  @Override
  public void run() {
    try {
      command.execute();
    } catch (Throwable exception) {
      pokeball.catchThis(exception);
    }
  }

  class PokeBall {

    private Collection<Throwable> exceptions = new LinkedList<Throwable>();

    public void catchThis(Throwable t) {
      exceptions.add(t);
    }

  }

}
