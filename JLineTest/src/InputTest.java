/**
 * Created with IntelliJ IDEA.
 * User: kdrake
 * Date: 13.10.12
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */

import jline.*;

import java.io.IOException;

public class InputTest {

    public static void main (String[] args)         {
        String password = null;
        try {

            UnixTerminal ut = new UnixTerminal();
            ut.initializeTerminal();
            ut.beforeReadLine(new ConsoleReader(),"Hello World",new Character('*'));

                    password = new ConsoleReader().readLine(new Character('*'));
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        System.out.print(password);

    }



}
