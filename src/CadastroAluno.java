public class CadastroAluno {
  public static void main(String[] args) {
    String[] alunos = new String[25];
    int i;
    for (i = 0; i < 25; i++) {
      alunos[i] = "aluno " + i;
      System.out.println("adicionado " + alunos[i]);
    }
  }
}
/*
 * Qual é a dificuldade de inserir os novos alunos nessa estrutura de dados?
 * Justifique sua resposta direcionando aos conceitos de gerenciamento de
 * memória.
 * Bom, a dificuldade que encontrei em inserir os novos 5 alunos foi que como o
 * vetor já
 * estava cheio e a estrutura utilizada era uma estrutura estática então não é
 * possível
 * fazer tal processo, pois o vetor tem um tamanho fixo que já estava
 * preenchido, nesse
 * caso seria o ideal a utilização de uma estrutura dinâmica que não tem tamanho
 * fixo e
 * aceitaria a adição de mais cinco alunos sem nenhum problemas ou então
 * programar o
 * vetor com um tamanho maior.
 * Cheguei com essa combinação com a ajuda do texto abaixo.
 * Uma estrutura de dados estática possui tamanho fixo, porém este é declarado
 * no código, pelo
 * programador. Quando uma variável estática é criada, seu tamanho não pode ser
 * alterado até
 * que o programa seja finalizado, mas ela suporta consultas por meio do uso de
 * índices, como
 * os arrays, que podem ser unidimensionais, bidimensionais ou
 * multidimensionais.
 * Diferentemente da estrutura estática, a estrutura de dados dinâmica não tem
 * tamanho fixo,
 * pois seu comprimento evolui conforme a necessidade. No entanto, há um ponto
 * em comum
 * entre as duas estruturas, visto que a dinâmica também suporta consultas e
 * atualizações. Nesse
 * caso, são utilizados ponteiros para se fazer consultas, os quais “apontam”
 * para os dados na
 * memória.
 * Um exemplo de estrutura dinâmica é a lista, que faz alocação de memória para
 * cada item
 * inserido, sendo realizada em tempo de execução. A limitação da estrutura
 * dinâmica é o limite
 * físico da memória do computador.
 */
