public class Operadores {
    public static void operadores(String[] args){
        // como imprimir um numero na forma negativa
        int a = 5;
        int b = 2;

        a = - a;
        b = -b;
        System.out.println(a);
        System.err.println(b);
        // como imprimir um numero que era negativo e torna lo positivo
        a = a * -1;
        b = b * -1;
        System.out.println(a);
        System.out.println(b);

        // fazendo operacoes
        int soma = a + b; 
        int subtracao = a - b; 
        int multiplicacao = a * b; 
        int divisao = a / b;
        int resto = a % b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);
    }

    public static void repeticao(){
        int a, b;

        a = 5;
        b = 6;

        String resultado = " ";
        if(a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado );
        
    }

    
}
