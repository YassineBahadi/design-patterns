package com.yassine.obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class ObserverImpl2 implements Observer {
    private List<Integer> history=new ArrayList<>();
    @Override
    public void update(int newState) {
        history.add(newState);
        int sum=0;
        int size=history.size();
        for(int i=0;i<size;i++){
            sum+=history.get(i);
        }
        System.out.println("La moyenne="+sum/size);
    }
}
