/*
 * The MIT License
 *
 *        Copyright (c) 2014 Marcelo Guimaraes <ataxexe@gmail.com>
 * ----------------------------------------------------------------------
 * Permission  is hereby granted, free of charge, to any person obtaining
 * a  copy  of  this  software  and  associated  documentation files (the
 * "Software"),  to  deal  in the Software without restriction, including
 * without  limitation  the  rights to use, copy, modify, merge, publish,
 * distribute,  sublicense,  and/or  sell  copies of the Software, and to
 * permit  persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this  permission  notice  shall be
 * included  in  all  copies  or  substantial  portions  of the Software.
 *                        -----------------------
 * THE  SOFTWARE  IS  PROVIDED  "AS  IS",  WITHOUT  WARRANTY OF ANY KIND,
 * EXPRESS  OR  IMPLIED,  INCLUDING  BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN  NO  EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * CLAIM,  DAMAGES  OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT  OR  OTHERWISE,  ARISING  FROM,  OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE   OR   THE   USE   OR   OTHER   DEALINGS  IN  THE  SOFTWARE.
 */

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
