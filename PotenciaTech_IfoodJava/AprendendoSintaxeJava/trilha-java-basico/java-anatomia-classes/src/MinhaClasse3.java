public class MinhaClasse3 {

  // Aula referente a Variáveis e Métodos

  public static void main (String [] args) {
    
    String primeiroNome = "Genildon";
    String  segundoNome = "Barreto";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
  }
}
