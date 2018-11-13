package com.jcource.drozdova.command;

import java.util.Map;
import java.util.Stack;

public class Push implements Command {
    public void execute(Stack<Double> stack, Map<String, Double> variables, String[] arguments) //throws CalcException
    {
        String variableName = arguments[1];
      //  try {
            double value = Double.parseDouble(variableName);
            stack.push(value);
        /*} catch (NumberFormatException e){
            System.out.println("Не правильный формат данных");
            throw new CalcException ("Не правильный формат");
        }*/
    }
}
