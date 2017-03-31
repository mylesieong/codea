package com.myles.fun;

public class App {

    /* This abstract the structure of below snippet
     * temp = a
     * a = b
     * b = c
     * c = temp
     */
    public static void main( String[] args ){

        PgmMatrix pm = new PgmMatrix();

        PgmVar temp = new PgmVar("temp");
        PgmVar a = new PgmVar("a");
        PgmVar b = new PgmVar("b");
        PgmVar c = new PgmVar("c");

        pm.addPgmRef(new PgmRef().setFrom(a).setTo(temp));
        pm.addPgmRef(new PgmRef().setFrom(b).setTo(a));
        pm.addPgmRef(new PgmRef().setFrom(c).setTo(b));
        pm.addPgmRef(new PgmRef().setFrom(temp).setTo(c));

        System.out.println(pm);

    }

}
