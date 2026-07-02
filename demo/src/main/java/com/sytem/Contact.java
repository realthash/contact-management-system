package com.sytem;

public class Contact {

    private String name;
    private String phoneNum;

    public Contact(String name, String number){
        this.name = name;
        this.phoneNum = number;
    }


    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNum;
    }
    @Override
    public String toString(){
        String contact = String.format("%-20s %s %-10s", name,"-", phoneNum);
        return contact; 
    }

    
}
