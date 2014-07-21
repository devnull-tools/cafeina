/*
 * The MIT License
 *
 * Copyright (c) 2014 Marcelo Guimaraes <ataxexe@gmail.com>
 *
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

package tools.devnull.cafeina.enums;

/**
 * Alimentos ricos em ferro.
 *
 * @author Marcelo Guimarães
 */
public enum AlimentosRicosEmFerro {

  // origem animal
  COSTELA_DE_PORCO(3),
  VITELA(3.6),
  CORDEIRO(2.2),
  FIGADO_DE_VITELA(10.6),
  FARINHA_DE_PEIXE(41),
  MEXILHAO_COZIDO(6),
  GEMA_DE_OVO(5.87),

  // origem vegetal

  PAO_DE_CEVADA(6.5),
  PAO_INTEGRAL(4.5),
  CEREAL(4.5),
  AVEIA_CRUA(4.5),
  SALSA(3.1),
  GRAO_DE_BICO_COZIDO(1.4),
  ERVILHA_COZIDA(1.9),
  LENTILHA_COZIDA(2.44),
  AGRIAO(2.6),
  BETERRABA_CRUA(2.5),
  GRAO_INTEGRAL(7.1),
  NOZES(7.1),
  CASTANHAS(7.1),
  FEIJAO(7.1),
  MELADO_DE_CANA_DE_ACUCAR(4.2),
  RAPADURA(4.2),
  ACUCAR_MASCAVO(4.2),
  PIMENTAO(8.7),
  CHOCOLATE_MEIO_AMARGO(4.4);

  private final double mgDeFerroPor100g;

  AlimentosRicosEmFerro(double mgDeFerroPor100g) {
    this.mgDeFerroPor100g = mgDeFerroPor100g;
  }

  /**
   * Retorna a quantidade de ferro em mg presente em 100 g de alimento.
   *
   * @return a quantidade de ferro em mg presente em 100 g de alimento.
   */
  public double mgDeFerroPor100g() {
    return mgDeFerroPor100g;
  }

}
