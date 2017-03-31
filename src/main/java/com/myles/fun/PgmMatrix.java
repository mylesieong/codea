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

    private void registerPgmVar(PgmVar var){
        if (this.findVar(var) < 0){
            this.mVarList.add(var);
	}
    }

    private int findVar(PgmVar var){
        for (int i = 0 ; i < this.mVarList.size(); i++){
            if (this.mVarList.get(i).getName().compareTo(var.getName()) == 0) return i;
	}
	return -1;
    }

    public void addPgmRef(PgmRef ref){
        System.out.println("Add Program Reference:" + ref);

	this.registerPgmVar(ref.getFrom());
	this.registerPgmVar(ref.getTo());

        int fromIndex = this.findVar(ref.getFrom());
        int toIndex = this.findVar(ref.getTo());

	this.mMatrix[fromIndex][toIndex] ++;
    } 
	
    public String toString(){
        String result = "";
        for (int i = 0 ; i < this.mVarList.size(); i++){
	    result = result + "from: " + this.mVarList.get(i);
            for (int j = 0 ; j < this.mVarList.size(); j++){
	        result = result + this.mMatrix[i][j] + "\t"; 
	    }
	    result = result + "\n";
	}
	return result;
    }

}
