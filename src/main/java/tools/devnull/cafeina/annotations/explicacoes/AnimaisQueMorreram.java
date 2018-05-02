package tools.devnull.cafeina.annotations.explicacoes;

import tools.devnull.cafeina.enums.Animal;

/**
 * Anotação para informar os animais que morreram durante a confecção
 * do referido código.
 *
 * Cuidado! Você pode ser o próximo.
 *
 * @author Marcelo Guimarães
 */
public @interface AnimaisQueMorreram {

  Animal[] value();

}
