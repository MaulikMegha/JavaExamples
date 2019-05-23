package com.example.interview.blackRock.tree;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String args[]){
        List<Issuer> issuerList = new ArrayList<>();
        issuerList.add(new Issuer("ROOT","1"));
        issuerList.add(new Issuer("1","2"));
        issuerList.add(new Issuer("1","3"));
        issuerList.add(new Issuer("1","4"));
        issuerList.add(new Issuer("2","25"));
        issuerList.add(new Issuer("2","28"));
        issuerList.add(new Issuer("2","27"));
        issuerList.add(new Issuer("4","41"));
        issuerList.add(new Issuer("4","42"));
        issuerList.add(new Issuer("4","43"));
        issuerList.add(new Issuer("3","13"));



    }

}

class  Issuer {
    private String parentId;
    private String id;

    Issuer(String parentId, String id){
        this.parentId = parentId;
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public String getId() {
        return id;
    }
}