package br.com.dio;

/**
 * *Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */

public class Main {

    public static void main(String[] args) {

        int i;
        //int i; variável nao deve ter o mesmo nome
        int I;
        // int 1a; variável nao deve começar com números
        //int _1a; nao se deve iniciar  com underline, boas praticas
        // int$aq; nao se deve iniciar  com $, boas praticas

        i = 5;
        I = 10;
        // _1a = 20;
        //$aq = 7;

        final int j = 10;
        // j = 15; a variavel foi definida como constante (final) logo nao pode mudar o valor
        int asrn24678md;
        //int asrn246 78md; variável nao deve ter espaço
        //int asrn2$4678md; variável nao deve ter $, boas praticas
        //  int asrn2$46%78_md; variável nao deve ter $, %, boas praticas

        asrn24678md = 100;
        // asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; segue a notacao camelo, mas na boa pratica tem que ter a ptimeira letra minuscula
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; nao existe notaçao camelo para final
        //int QUANTIDADE_OPCOES = 25; nao é final, entao nao deve estar tudo maiusculo
        //int qtdProd; a expressividade nao foi aplicada

        System.out.println(i);
        System.out.println(I);
        //System.out.println(_1a);
        //System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        //System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        //System.out.println(QUANTIDADE_OPCOES);



    }
}
