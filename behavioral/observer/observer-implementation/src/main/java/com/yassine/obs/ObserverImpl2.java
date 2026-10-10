package com.yassine.obs;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pc
 **/
public class ObserverImpl2 implements Observer {
    private List<Integer> history=new ArrayList<>();
    @Override
    public void update(Observable observable) {
        if(observable instanceof  ObservableImpl obs){
            if(history.size()<2){
                history.add(obs.getState());
                int sum=0;
                int size=history.size();
                for(int i=0;i<size;i++){
                    sum+=history.get(i);
                }
                System.out.println("$$$$$$$$$ ObserverImpl2 $$$$$$$$$");
                System.out.println("La moyenne="+sum/size);
            }
        }
    }
}
