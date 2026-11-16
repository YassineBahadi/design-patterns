package com.yassine.service;

import org.springframework.stereotype.Service;

/**
 * @author pc
 **/
@Service
public class MetierImpl implements IMetier {
    @Override
    public void process() {
        System.out.println("Business Process .....");
    }

    @Override
    public double compute() {
        double data=78;
        System.out.println("Business Computing and returning");
        return data;
    }
}
