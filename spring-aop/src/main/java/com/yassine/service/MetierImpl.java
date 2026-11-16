package com.yassine.service;

import com.yassine.aspects.Log;
import com.yassine.aspects.SecuredByAspect;
import org.springframework.stereotype.Service;

/**
 * @author pc
 **/
@Service
public class MetierImpl implements IMetier {
    @Override
    @Log
    @SecuredByAspect(roles={"USER","ADMIN"})
    public void process() {
        System.out.println("Business Process .....");
    }

    @Override
    @Log
    @SecuredByAspect(roles = {"ADMIN"})
    public double compute() {
        double data=78;
        System.out.println("Business Computing and returning");
        return data;
    }
}
