public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " JAVA";
            System.out.println(nomeCompleto);

        int numero = 5;

        numero = - numero;

            System.out.println(++ numero);

        numero = numero * -1;

            System.out.println(-- numero);
        
        boolean variavel = true;
                variavel = !variavel;

            System.out.println(!variavel);
        
        int a, b;
            a = 5;
            b = 6;

        String resultado = a==b ? "Verdadeiro" : "Falso";

/*      if (a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
*/ 
        
                System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 2;
        int numero4 = 3;

        if(numero2 == numero3){
            System.out.println("Essa sentença é verdadeira");
        }

         boolean simNao = numero1==numero2;
            System.out.println("Numero 1 é igual a numero 2? " + simNao);
                simNao = numero2 >= numero3;
            System.out.println("Numero 2 é igual ou maior que numero 3? " + simNao);
        if(numero2 == numero3){
            System.out.println("Essa sentença é verdadeira!");
        }
                simNao = numero4 <= numero3;
            System.out.println("Numero 4 é igual ou menor que numero 3? " + simNao);
        if(numero4 >= numero3 ){
            System.out.println("Essa sentança é falsa!");
        }
    
        boolean condicao1 = true;
        
        boolean condicao2 = false;
        
        if(condicao1 && 7 > 4){
            System.out.println("As duas condições são verdadeiras");
        }
            System.out.println("fim.");

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("fim.");


    }
}
