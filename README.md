# CAFEINA

Este é o cafeína (CAixa de FErramentas INúteis para Anotações), um projeto destinado a mapear as diversas situações que nós, mantenedores de código, temos que enfrentar em nossos árduos e sombrios dias (e noites, e madrugadas, e mais outros dias) de trabalho como papel higiênico de TI com folha dupla.

Este projeto tem uma forte influência do [Google Annotations Gallery][gag] e do [New Programming Jargon][npj], bem como usa diversas figurinhas conhecidas pelos programadores brasileiros, como o glorioso [Gérson][gerson] e o ~~pouco~~ nem um pouco talentoso [Alonso][alonso].

# Montando o Projeto

Basta executar o comando `gradle dist` e pronto!

# Utilizando o Projeto

O CAFEINA agora está no Maven Central, basta importá-lo com os seguintes identificadores:

- groupId: tools.devnull
- artifactId: cafeina

# Usando as Anotações

## @AcheiNoGoogle

Anotação para imunizar o autor do código de qualquer ameaça sofrida, já que o código original nem era dele. É uma forma alternativa de transferência de culpa.

## @EmTerraDePernetaQualquerChuteEhVoadora

Tudo é relativo! Pra que colocar aquele código lindo, bem desacoplado, coeso e de fácil manutenção em um sistema porco e mal feito? O código só precisa ser menos imbecil do que o resto do sistema.

## @FizEnquanto

Fez algo que não se orgulha e seu nome tá no SCM? Diga a todos o porquê dessa merda binária e durma tranquilo. Também pode ser usado pra se gabar de algo complexo que você fez.

## @NaoTemCavalo

Anotação para aqueles momentos mágicos onde o necessário é uma linda utopia. Geralmente utilizada em campos onde deveria ocorrer uma injeção de dependência.

~~~java
@Inject
@NaoTemCavalo
private Repositorio repositorio;
~~~

OBS: Para mais detalhes, assista a peça *"A Invenção do Futebol"*, da Companhia de Comédia Os Melhores do Mundo.

## @PropriedadeDe

Anotação para aqueles códigos em que o autor se recusa a deixar alguém mexer. Qualquer tentativa de alteração será subitamente engolida pelo controlador de versão e o autor te perseguirá eternamente.

~~~java
@PropriedadeDe("Gonçalo")
public class DoubleSortedDynaArray {
// ...
}
~~~

## @SoQueNao

Anotação perfeita para aqueles códigos onde a especificação não passa de um mero detalhe que não foi dado a devida atenção.

~~~java
/**
 * Método que retorna a lista de contatos.
 */
@SoQueNao
public List<Contato> obterListaDeContatos() {
  return agenda.listarAniversariantesDoDia();
}
~~~

## @TiveEssaIdeia

Anotação destinada a deixar para a posteridade como uma ideia (brilhante ou não) surgiu.

## @AlonsoEsteveAqui

Cuidado ao analisar qualquer código com essa anotação. E nem adianta perguntar pro Alonso porque, provavelmente, ele nem saberá o que queria fazer.

## @BugsonDeHiggs

Indica um bug existente apenas em um ínfimo número de possibilidades relacionadas a entradas de log, temperatura retal do usuário no momento do erro, softwares não instalados no computador e outras coisas que tornam o bug praticamente impossível de identificar (se é que ele de fato existe).

## @ONomeDizTudo

Quem precisa de comentários e documentação quando se pode ter nomes esclarecedores?

~~~java
@ONomeDizTudo
public class RegraWrapperSolicitanteTemPerfilGestorOuSecretarioSiga2000OuFuncaoSecretarioEUnidadeAlvoNaoEhGabineteAutoridadeUsuarioAlvoNaoLotado {
  // ...
}
~~~

## @FaltaFerro

Anotação para diagnósticos de modelo anêmico.

~~~java
@FaltaFerro(consumir = {
  FEIJAO, CEREAL, RAPADURA, VITELA, GRAO_DE_BICO
})
public class Conta {
  private BigDecimal saldo;
  private BigDecimal limite;

  public void setSaldo //...
  public BigDecimal getSaldo //...

  public void setLimite //...
  public BigDecimal getLimite //...

}
~~~

## @GluGlu

Para aquele código chato, pentelho e ultrapassado que insiste em aparecer em todos os cantos.

## @Heisenbug

Anotação que indica a presença de um bug que tende a se modificar quando é analisado.

## @InfinitoEnquantoDura

Poética anotação destinada aos métodos cujo desempenho é tão questionável que chega a dar a impressão de parar o tempo.

~~~java
@InfinitoEnquantoDura
public void assinarEConfirmar() {
  setDataNotificacao(new Date());
  try {
    // espera 10 segundos
    Thread.sleep(10 * 1000);
  } catch(IOException) {
    // não vai rolar
  }
  // o sistema não deixa cadastrar
  // com menos de 10 segundos
  // de diferença entre as datas
  setDataConfirmacao(new Date());
}
~~~

## @Lavoisier

Nada se cria, tudo se copia! Anotação que indica a presença do padrão de projeto LavoisierCoding. Essa anotação geralmente vem acompanhada de `@AcheiNoGoogle`.

## @Miau

Gambiarra detected!

~~~java
@Miau(THUNDERCAT)
public void processar(String operacao) {
  try {
    // as operações são de 0 a 9
    int codigo = Integer.parseInt(operacao);
    processar(codigo);
  } catch (NumberFormatException e) {
    cancelar(); // 'C' cancela
  }
}
~~~

## @PegadinhaDoMalandro

Pensou que era só alterar o `for`?

## @PokemonExceptionHandling

Indica que o método implementa o padrão de projeto Pokemon Exception Handling, que consiste em capturar todas as exceções e aumentar a taxa de suicídio entre os mantenedores de código!

~~~java
@PokemonExceptionHandling
public void cadastrar() {
  try {
    fachada.inserir(objeto);
  } catch (Throwable e) {
    // vamos pegar tudo!!
  }
}
~~~

## @Refudeuracao

Anotação que indica que um engenhoso processo de refatorar diversas vezes um código bem escrito até dar origem a uma porcaria que não pode ser mantida por mais ninguém foi feito com sucesso!

## @SeFuncionouNaoMexe

Anotação para os códigos onde não se sabe ao certo se estão corretos, mas, se estiverem, é um sinal do nascimento de um novíssimo código hidra.

## @SomenteOsInteligentesPodemVer

Indica um tipo de código especial que somente os inteligentes podem ver. Não se reprima caso não consiga lê-lo.

~~~java
@SomenteOsInteligentesPodemVer
public String converter() {
  // TODO generated method
  return null;
}
~~~

## @TinhaUmBugNoMeioDoCaminho

Padrão de projeto que consiste em desviar um código de seu curso natural para águas profundas a fim de contornar algum bug (geralmente um Heisenbug).

## @CodigoHidra

Indica que um código lendário foi introduzido. Prepare-se para atacá-lo e ver que, a cada bug resolvido, vários outros aparecerão.

## @DeixaQuieto

Não mexa! Tá funcionando! Qualquer tentativa de melhoria pode acarretar no surgimento de um código hidra.

## @FodasticoIsso

Anotação para aquela "brilhante" ideia cujo autor merece ser sodomizado pela Masamune do Sephiroth.

~~~java
  /**
   * Método que converte uma String no padrão #,##0.00 para um double
   */
  @FodasticoIsso
  public static double stringToDouble(String pString) {
    if (stringVazia(pString)) {
      return Double.NEGATIVE_INFINITY;
    }

    String aux = pString;
    String[] vecPonto = stringToArray(pString, ".", true);
    String[] vecVirgula = stringToArray(pString, ",", true);

    if (vecVirgula.length > 1 && vecPonto.length > 1) {
      if (vecVirgula.length == vecPonto.length) {
        if (vecVirgula[0].length() < vecPonto[0].length()) {
          aux = trocaSubString(aux, ",", "");
        } else {
          aux = trocaSubString(aux, ".", "");
          aux = trocaSubString(aux, ",", ".");
        }
      } else if (vecVirgula.length > vecPonto.length) {
        aux = trocaSubString(aux, ",", "");
      } else {
        aux = trocaSubString(aux, ".", "");
        aux = trocaSubString(aux, ",", ".");
      }
    } else if (vecVirgula.length > 2 || vecPonto.length > 2) {
      aux = trocaSubString(aux, ".", "");
      aux = trocaSubString(aux, ",", "");
    } else if (vecVirgula.length == 2) {
      aux = trocaSubString(aux, ",", ".");
    }

    return (new Double(aux)).doubleValue();
  }
~~~

## @FoiOGersonQuemFez

Esta anotação indica um códio feito pelo Gérson e, portanto, impossível de ser mexido. Aceite sua condição inferior e vá tomar um café.

## @FuncionouNaMinhaMaquina

Certificado de qualidade suprema em forma de anotação. Qualquer coisa anotada com ela estará automaticamente isenta de testes.

## @GambiarraInside

Padrão de projeto supremo!

## @Macarronada

Anotação para aquele código espaguete-de-birosca-da-esquina.

## @PadraoFIFA

Anotação para aquele "elevado" padrão de qualidade.

## @PiorQueTaNumFica

Nível supremo da insuficiência cerebral. Nada pode tornar o código pior. Isso indica o último estágio que beira o limite da compreensão humana.

## @CorramParaAsColinas

Projejam-se! O código do estagiário vem aí!!!

## @EhUmaCiladaBino

Cuidado!!! Você foi avisado (talvez tarde demais). Rejeite a demanda, arrume um atestado médico, mude de país, faça qualquer coisa, mas não aceite dar manutenção nesse código.

## @EuDisseQueIaDarMerda

Anotação para enfiar o dedo na cara de quem não te ouviu.

## @IssoVaiDarMerda

Anotação para uso em análises de risco e prevenção de acidentes.

## @CaiDeParaquedas

Anotação utilizada para indicar que o programador caiu de paraquedas no desenvolvimento do sistema. O poder desta anotação é tão supremo que permite qualquer tipo de cagada sem punição alguma. Use com moderação.

## @DeCuEhRola

Anotação para expressar desgosto. Use sem moderação.

~~~java
@DeCuEhRola("Struts")
public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) {
 // ...
}
~~~

## @SoPraTestar

Anotação que indica algo feito somente para fins de testes (como aquelas classes lindas com métodos main maravilhosos e um monte de System.out felizes e contentes tomando cerveja e dançando Macarena).

## @Dejavu

Ei! Acho que já vi esse código antes...

## @EpicFail

Tão épico que dispensa comentários.

## @EuSabiaIssoComMacas

Anotação que indica uma funcionalidade que, por se tratar de outros objetos envolvidos, foi implementada de uma maneira não muito ortodoxa.

## @EuSoEstouDandoManutencao

Anotação usada para indicar que você não foi o responsável por nenhuma cagada, apenas corrigiu algum bug (geralmente um carinhoso NPE) ou implementou alguma funcionalidade exótica.

## @FacePalm

Dispensa comentários. Combine-a com uma bela acrobacia para ilustrar o quão terrível foi a sensação.

~~~java
@FacePalm(DOUBLE_TAIL_WHIP_CANCAN)
public int converteStringPraInt(String string) {
  return Integer.parseInt(string);
}
~~~

## @IssoDavaUmaLinha

Esse macarrão binário com certeza seria resolvido em uma só linha caso a linguagem fosse outra.

~~~java
@IssoDavaUmaLinha(em = "haskell"
    fatality = "product [1..n]")
public int fatorial(int n) {
  int fatorial = 1;
  for (int i = 1; i <= n; i++) {
    fatorial *= i;
  }
  return fatorial;
}
~~~

## @IssoNonEcziste

Nenhum código pode ser assim tão tosco! Até mesmo o compilador torna-se temperamental e se recusa a compilar o código. Esse, provavelmente, é o maior desafio para um programador ~~foda~~ muito experiente.

## @PraQueEstaMerda

Encontrou um código mais fedorento do que um gambá bêbado no lixão? Use esta anotação e indique uma maneira mais simples de se fazer as coisas.

~~~java
@PraQueEstaMerda(se = "o Java faz o autoboxing")
public int toInt(Integer integer) {
  return integer.intValue();
}
~~~

## @PutaQuePariu

Define uma situação de fúria assassina.

## @QuandoEuChegueiJaEstavaAssim

Anotação para ser usada naquelas vezes em que seu nome será lembrado pra sempre por estar no histórico de alterações do SCM. Use isto e limpe sua honra.

## @SoFizOQueMandaram

Anotação para transferência de culpa (mesmo que seja sua).

## @SouFoda

Anotação para aquela necessidade de autoafirmação, de mostrar quem é o macho alfa dos programadores já que você resolveu aquele bug em um código macarrônico que provava existir um universo paralelo entre o compilador e o código.

## @VaoSeFoderem

Expresse sua ira e libere o seu KI.

## @ViuComoFunciona

Foi desafiado? Mate a cobra e mostre o pau com esta anotação. Não interessa se ficou bom, o que interessa é que a bagaça funcionou!

## @AgoraSimFudeu

Anotação para aqueles momentos em que você achava que nada iria superar aquela jumentice no código... mas... você percebeu que estava errado.

# Exemplos de Uso

~~~java
/**
 * Envia os o email de aceite para as listas de distribuições
 */
@SoQueNao
public void enviarEmailDeAceite(List<Distribuicao> distribuicoes, Usuario usuarioLogado) {
  for (Distribuicao distribuicao : distribuicoes) {
    this.enviaEmailUsuarioAceite(distribuicao, usuarioLogado);
    this.enviaEmailResponsavelTecnico(distribuicao, usuarioLogado);
    this.enviaEmailResponsavelAgir(distribuicao, usuarioLogado);
    this.enviaEmailChefeGabinete(distribuicao, usuarioLogado);
    break;
  }
}
~~~

~~~java
@AcheiNoGoogle
@FodasticoIsso
@PokemonExceptionHandling
public Method getMethod(Class classe, String nomeMetodo, Class... parametros) {
  Method method = null;
  try {
    if (parametros.length > 0) {
      method = classe.getMethod(nomeMetodo, parametros);
    } else {
      method = classe.getMethod(nomeMetodo);
    }
  } catch (SecurityException e) {

  } catch (NoSuchMethodException e) {

  }
  return method;
}
~~~

~~~java
@PutaQuePariu
@SeFuncionouNaoMexe
@IssoVaiDarMerda
@PadraoFIFA
public abstract class DaoFactory extends ServicoMensagem {
  // ...
}

@AgoraSimFudeu
@IssoNonEcziste
@EhUmaCiladaBino
@CorramParaAsColinas
public class ServicoModeloFachada extends DaoFactory {
  // ..
}
~~~

[npj]: <http://blog.codinghorror.com/new-programming-jargon>
[gag]: <https://code.google.com/p/gag/>
[gerson]: <http://vidadesuporte.com.br/tag/gerson-suporte-a-serie>
[alonso]: <http://vidadeprogramador.com.br/tag/alonso>
