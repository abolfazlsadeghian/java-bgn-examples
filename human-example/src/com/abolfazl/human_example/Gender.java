package com.abolfazl.human_example;

public enum Gender {

    FEMALE (1,"female"),
    MALE(2,"male"),
    UNDEFINED(3,"undefined"){
        @Override
        public String comment() {
            return "to be decided later: "+ getRepr()+ ", "+getDescr();
        }
    };

    private final int repr;
    private final String descr;

    Gender (int repr, String descr){
        this.repr=repr;
        this.descr=descr;
    }

    public int getRepr(){
        return repr;
    }

    public String getDescr(){
        return descr;
    }

    public String comment(){
        return repr + ": "+ descr;
    }
}
