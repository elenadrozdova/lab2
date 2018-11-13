package com.jcource.drozdova.command;

import java.util.Map;
import java.util.Stack;

public class Plus implements Command {

    public void execute(Stack<Double> stack, Map<String, Double> variables, String[] arguments) //throws CalcException
    {

        if (stack.size() >=2)
        {
            stack.push(stack.pop() + stack.pop());
        }
        else
        { }

    }

}
