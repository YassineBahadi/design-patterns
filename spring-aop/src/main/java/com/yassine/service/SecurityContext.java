package com.yassine.service;

/**
 * @author pc
 **/
public class SecurityContext {
    private static String username="";
    private static String password="";
    private static String[] roles={};

    public static void authenticate(String u,String p,String[] r){
        if(u.equals("14N13B14")&&p.equals("14N13B14")){
            username=u;
            password=p;
            roles=r;
        }
        else{
            throw new RuntimeException("Access denied");
        }
    }

    public static boolean hasRole(String r){
        for(String role:roles){
            if(role.equals(r)){
                return true;
            }
        }
        return false;
    }
}
