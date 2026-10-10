package com.yassine;

import com.yassine.file.system.File;
import com.yassine.file.system.Folder;

/**
 * @author pc
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");
        root.addChild(new File("pom.xml"));
        root.addChild(new File(".git"));
        Folder src=(Folder) root.addChild(new Folder("src"));
        src.addChild(new File("README.md"));
        Folder java= (Folder) src.addChild(new Folder("java"));
        java.addChild(new File("Main.java"));
        root.print();
    }
}