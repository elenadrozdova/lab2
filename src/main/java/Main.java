import com.jcource.drozdova.command.*;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws CalcException {

        InputStream console = System.in;
        Scanner scanner = new Scanner(console);


        Command cmdPush     = new Push();
        Command cmdPrint    = new Print();
        Command cmdPlus     = new Plus();
        Command cmdMult     = new Mult();
        Command cmdDefine   = new Define();
        Calculate c = new Calculate(cmdPush,cmdPlus,cmdPrint,cmdMult, cmdDefine);
        c.stack = new Stack<Double>();
        c.map =   new HashMap<String, Double>();
        String cmd;
        do {
            String str = scanner.nextLine();
            c.arg = str.split(" ");
             cmd = c.arg[0];

            if (cmd.equals("print"))
            {
                c.Print();
            } else if (cmd.equals("push"))
            {
                c.Push();
            } else if (cmd.equals("plus"))
            {
                c.Plus();
            } else if (cmd.equals("mult"))
            {
                c.Mult();
            } else if (cmd.equals("define")){
                c.Define();
            }

        } while (!cmd.equals("exit"));

    }

    }

