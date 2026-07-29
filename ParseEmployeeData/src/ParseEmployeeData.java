/*
Q62 — Employee CSV Parser

A payroll system receives employee data as a single comma-separated line. Split each line into individual fields and display them labeled.

Input:

String line = "Fatima Ahmadi,32,Stockholm,Backend Developer,85000";

Expected Output:

Name:       Fatima Ahmadi
Age:        32
City:       Stockholm
Role:       Backend Developer
Salary:     85000

Constraint: Use split(","). Access each part by its index. Do not hardcode the values.


*/



public class ParseEmployeeData {
    public static void main(String[] args) {
        String line = "Fatima Ahmadi,32,Stockholm,Backend Developer,85000";

        parseEmployeeData(line);


    }


    public static void parseEmployeeData(String line) {

        String  [] lines = line.split(",") ;
        String [] info = { "Name" ,"Age" , "City" , "Role","salary"};
        for (int i = 0; i<info.length; i++) {
            System.out.println(info [i] +":\t"+lines[i]);

        }





    }

}