package com.abolfazl.human_example;

public interface Artist {

    String getSchool();
    void setSchool(String school);


    default boolean isCreative(){
     return true;
    }


}
