package SimpleProject;

import Xirta.LogHandler;

public class Simple {
/*
*                   *
*   Testing Class   *
*                   *
*/



    public static void main(String[] args) {

       Xirta.LogHandler.addLog("Hello Xirta!");
       Xirta.LogHandler.addLog("Hello User!");
       Xirta.LogHandler.Output(money(5));



    }

    public static int money(int x){
        return x;
    }
}
