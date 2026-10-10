package com.yassine.file.system;

/**
 * @author pc
 **/
public abstract class Component {
    protected  String name;
    protected  int level=0;

    public Component(String name) {
        this.name=name;
    }

    public abstract  void print();

    protected String tabs(){
        String tabs="";
        for(int i=0;i<level;i++){
            tabs+="\t";
        }
        return tabs;
    }
}
