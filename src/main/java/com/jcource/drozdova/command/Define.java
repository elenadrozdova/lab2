package com.jcource.drozdova.command;

import java.util.Map;
import java.util.Stack;

public class Define implements Command {
    public void execute(Stack<Double> stack, Map<String, Double> variables, String[] arguments)
    {
        String varName = arguments[1];
        double varValue = Double.parseDouble(arguments[2]);

        variables.put(varName, varValue);

    }
}
