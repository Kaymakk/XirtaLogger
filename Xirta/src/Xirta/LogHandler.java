package Xirta;
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

        public LogHandler(){
            System.out.println(LoggerEntry);
        }
        //Adding new log into Logs List
        public static void addLog(String log){
            LogHandler.Logs = new LinkedList<>();
            Logs.removeAll(Logs);
            Logs.add(log);
            if(!Countlog){
                new LogHandler();
                Countlog = true;
            }
            new LogHand();
        }
        //Adding Method output log to List Logs
        public static void Output(Object method){
            LogHandler.Logs = new LinkedList<>();
            Logs.removeAll(Logs);
            Logs.add(String.valueOf(method));
            if(!Countlog){
                new LogHandler();
                Countlog = true;
            }
            new LogHand();
        }
        //Displaying Logs from List Logs
        protected static void LogDisplay(){
           try {
               for(String Logs : Logs){
                   System.out.println("~ " + Logs);
               }
           }catch (Exception exception){
            System.out.println("---- >> LOGGER FATAL ERROR << ----" + "---> Logs List Null <---\n");
           }

        }

    private static class LogHand {
        LogHand(){
            LogDisplay();
        }
    }
}
