package com.yassine.service;

import com.yassine.aspects.Log;
import org.springframework.stereotype.Service;

/**
 * @author pc
 **/
@Service
public class MetierImpl implements IMetier {
    @Override
    @Log
    public void process() {
        System.out.println("Business Process .....");
    }

    @Override
    @Log
    public double compute() {
        double data=78;
        System.out.println("Business Computing and returning");
        return data;
    }
}
