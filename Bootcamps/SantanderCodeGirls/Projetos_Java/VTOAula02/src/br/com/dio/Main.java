package br.com.dio;

public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 400000;       valor maior que o suportado

        //int i1 = -10000000000;    valor menor que o suportado
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; o valor está no formato double faltou um f no final
        float f2 = 10.68f;

        double d1 = 85.69;
        double d2 = 99.04;

        char c1 = 'W';
        //char c2 = 'tw';   ar é só um caractere aqui tem 2o ch
        char c2 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et t KNBJBJBB &* &%& 75894389";

        //String dt1 = "09/02/1981";       string nao é adequado para data

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        //System.out.println(s2);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
