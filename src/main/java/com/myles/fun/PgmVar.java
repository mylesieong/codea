package com.myles.fun;

public class PgmVar{

    private String mName;

    public PgmVar(String name){
        this.mName = name;
    }

    public String getName(){
        return this.toString();
    }

    public String toString(){
        return this.mName;
    }
}
