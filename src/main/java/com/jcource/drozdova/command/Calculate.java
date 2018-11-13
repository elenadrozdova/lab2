package com.jcource.drozdova.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculate  {
        public Stack<Double> stack = new Stack<Double>();
        public Map<String, Double> map = new HashMap<String, Double>();
        public String [] arg;

        private Command  cmdPush;
        private Command  cmdPlus;
        private Command  cmdPrint;
        private Command  cmdMult;
        private Command  cmdDefine;

    public Calculate(Command cmdPush,Command cmdPlus, Command cmdPrint,Command cmdMult, Command cmdDefine){
        this.cmdPush =  cmdPush;
        this.cmdPlus =  cmdPlus;
        this.cmdPrint = cmdPrint;
        this.cmdMult  = cmdMult;
        this.cmdDefine = cmdDefine;
        }
        public void Push(){
            cmdPush.execute(stack,map,arg);
        }
        public void Plus(){
            cmdPlus.execute(stack,map,arg);
        }
        public void Print(){
            cmdPrint.execute(stack,map,arg);
        }
         public void Mult(){
            cmdMult.execute(stack,map,arg);
        }
        public void Define(){
            cmdDefine.execute(stack,map,arg);
    }

}

