package com.yassine.file.system;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class Folder extends  Component {
    private List<Component> components=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(tabs()+"Folder: "+name);
        for(Component c:components){
            c.print();
        }
    }

    public Component addChild(Component c){
        c.level=this.level+1;
        components.add(c);
        return c;
    }
}
