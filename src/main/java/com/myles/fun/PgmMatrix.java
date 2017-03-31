package com.myles.fun;

import java.util.List;
import java.util.ArrayList;

public class PgmMatrix{
    
    private ArrayList<PgmVar> mVarList;
    private int[][] mMatrix;

    public PgmMatrix(){
        this.mVarList = new ArrayList<PgmVar>();
	this.mMatrix = new int[100][100];
    }

    public void registerPgmVar(PgmVar var){
        this.mVarList.add(var);
    }

    public void addPgmRef(PgmRef ref){
        System.out.println("Add Program Reference:" + ref);
    }

    public String toString(){
	return "Pgm Matrix to String Method";
    }

}
