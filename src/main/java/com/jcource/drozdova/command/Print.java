package com.jcource.drozdova.command;

import java.util.Map;
import java.util.Stack;

public class Print implements Command {
    public void execute(Stack<Double> stack, Map<String, Double> variables, String[] arguments) //throws CalcException
     {

        for (Double st : stack) {
            System.out.println(st);
        }
    }
}
