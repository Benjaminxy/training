/*
Q63 — Multi-Format Log Parser

A log aggregator receives lines from different systems. Some use commas, some semicolons, some pipes as separators. Split each line regardless of which delimiter it uses.

Input:

String log1 = "2024-01-15,ERROR,NullPointerException,UserService";
String log2 = "2024-01-15;WARN;Slow query detected;DatabaseService";
String log3 = "2024-01-15|INFO|User logged in|AuthService";

Expected Output:

log1 → [2024-01-15] [ERROR] [NullPointerException] [UserService]
log2 → [2024-01-15] [WARN] [Slow query detected] [DatabaseService]
log3 → [2024-01-15] [INFO] [User logged in] [AuthService]

Constraint: Use split("[,;|]") — one pattern that handles all three delimiters at once.
*/
class MultiFormatLogParser {
    public static void main(String[] args) {


        String [] logs = {"2024-01-15,ERROR,NullPointerException,UserService",
                "2024-01-15;WARN;Slow query detected;DatabaseService",
                "2024-01-15|INFO|User logged in|AuthService"};

        for (int i =0 ; i<logs.length; i++){

            multiFormatLogParser(i , logs[i]) ;
        }

    }


    public static void multiFormatLogParser (int number , String logs)

    {

        System.out.print("log " + (number+1)+ "-> ");
        String [] log = logs.split("[,;|]");

        for (int i = 0 ; i <log.length; i++) {

            System.out.print( "[" + log[i] + "] " );

        }
        System.out.println("" );
    }

}