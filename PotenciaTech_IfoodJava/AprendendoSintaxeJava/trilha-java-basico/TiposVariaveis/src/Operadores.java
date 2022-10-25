public class Operadores {
  public static void main(String[] args) {

 // Aula Concatenação
    /*
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    String concatenacao ="?"; 
    System.out.println(concatenacao);

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao); */

 // Aula Números negativos
    /*
    int numero = 5;
          
      //Imprimindo o numero negativo
    System.out.println(- numero);

    numero = - numero;
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);
    */

 // Aula Incremento e Decremento
    /*
    int numero = 5;
    // System.out.println(numero++);
    // System.out.println(numero);
    System.out.println(++numero);

    System.out.println(numero--);
    System.out.println(numero);
    System.out.println(numero);
    */

 // Aula Negação
  /*
    boolean variav = true;
    variav = !variav;

    System.out.println(variav);
    System.out.println(!variav);
  */

 // Aula Condição Ternária
    /*
    int a, b;

    a = 5;
    b = 6;
    
    String resultado = "";
      //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
    
    if(a==b)
        resultado = "verdadeiro";
    else
        resultado = "falso";

      System.out.println(resultado);
    
    
      //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a==b) ? "verdadeiro" : "falso";
    System.out.println(resultado);
    */

 // Aula Operadores Relacionais
    /*
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    System.out.println("numeroUm é igual a numeroDois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente a numeroDois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois? " + simNao);

    String nomeUm = "GENILDON";
    String nomeDois = "GENILDON";

    System.out.println(nomeUm.equals(nomeDois));
    */

 // Aula Lógicos
    //
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2){
      System.out.println("as duas condições são verdadeiras");
    }

    if(condicao1 && (7 > 4)){
      System.out.println("as duas condições são verdadeiras");
    }

    if(condicao1 || condicao2){
      System.out.println("uma das duas condições é verdadeira");
    }
    
    System.out.println("Fim");

  }
}
