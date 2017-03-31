package com.myles.fun;

public class PgmRef{

    private PgmVar mFrom;
    private PgmVar mTo;

    public PgmRef setFrom(PgmVar var){
        this.mFrom = var;
	return this;
    }

    public PgmRef setTo(PgmVar var){
        this.mTo = var;
	return this;
    }

    public PgmVar getFrom(){
	return this.mFrom;
    }

    public PgmVar getTo(){
	return this.mTo;
    }

    public String toString(){
        return "From:" + this.mFrom + " To:" + this.mTo;
    }


}
