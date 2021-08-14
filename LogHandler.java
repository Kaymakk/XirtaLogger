package Xirta;
import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.List;

public class LogHandler {
    private static boolean Countlog = false;
    private static String LoggerEntry =
                    "==============================================\n" +
                    "      ╔═╗╔═╗  ╔╗    ╔╗\n" +
                    "      ╚╗╚╝╔╝ ╔╝╚╗   ║║\n" +
                    "       ╚╗╔╝╔╦╩╗╔╬══╗║║  ╔══╦══╦══╦══╦═╗\n" +
                    "====== ╔╝╚╗╠╣╔╣║║╔╗║║║ ╔╣╔╗║╔╗║╔╗║ ═╣╔╝ ======\n" +
                    "      ╔╝╔╗╚╣║║║╚╣╔╗║║╚═╝║╚╝║╚╝║╚╝║ ═╣║\n" +
                    "      ╚═╝╚═╩╩╝╚═╩╝╚╝╚═══╩══╩═╗╠═╗╠══╩╝\n" +
                    "                           ╔═╝╠═╝║\n" +
                    "                           ╚══╩══╝\n" +
                    "==============================================";
 public static List <String> Logs;
    public static List <String> Dir;

        public LogHandler(){
            System.out.println(LoggerEntry);
        }
        //Adding new log into Logs List
        public static void addLog(String log,Object Directory){
            LogHandler.Logs = new LinkedList<>();
            Logs.removeAll(Logs);
            Logs.add(log);
            if(!Countlog){
                new LogHandler();
                Countlog = true;
            }
            new LogHand();
        }
    public static void addLog(String log){
            addLog(log,null);
    }
        //Comparing method output to expected
        public static void IO(@NotNull Object method, Object expected,String Logname,Object directory){
            LogHandler.Logs = new LinkedList<>();
            Logs.removeAll(Logs);
            if(method.equals(expected)){
                Logs.add(String.valueOf("" +"Object - " + Logname+" - output is equal to provided, output is : " + method));
            }else{
                Logs.add("~ " + "Error : " + "Object - " + Logname + " - output isn't equal to provided!");
            }

            if(!Countlog){
                new LogHandler();
                Countlog = true;
            }
            new LogHand();
        }
    public static void IO(@NotNull Object method, Object expected,String Logname) {
            IO(method,expected,Logname,null);
    }

        //Displaying Logs from List Logs
        protected static void LogDisplay(){
           try {
               for(String Logs : Logs){
                   System.out.println("~ " + Logs);
               }
           }catch (Exception exception){
            System.out.println("---- >> LOGGER FATAL ERROR << ----" + " ---> Logs List Null <---\n");
           }

        }
    protected static class LogHand {
        LogHand(){
            LogDisplay();
        }

    }
}
