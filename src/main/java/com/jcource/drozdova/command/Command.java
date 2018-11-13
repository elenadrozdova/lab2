package com.jcource.drozdova.command;

import com.jcource.drozdova.command.CalcException;
import com.sun.org.apache.xpath.internal.operations.Variable;

import java.util.Map;
import java.util.Stack;

public interface Command {
      void execute (Stack<Double> stack, Map<String, Double> variables, String [] arguments) ;//throws CalcException;
}
