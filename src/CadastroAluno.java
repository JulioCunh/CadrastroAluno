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
