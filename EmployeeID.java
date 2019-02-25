//Jorge Cubillos
// Employee ID and Gross Pay

package employeeid;

public class EmployeeID {

    public static void main(String[] args) {
    
        //Variables and Array
        //I wasn't sure if I needed to give sample values or 
        //if it was supposed to intitalize as a emtpy list
        //I commented out an empty initialization which works
        //if you comment out the sample, and uncomment the empty list
        
        //Sample Initialization
        int numOfEmployees = 10;
        int[] employeeID = {1,2,3,4,5,6,7,8,9,10};
        double[] grossPay = {10000.1,10000.2,10000.3,10000.4,10000.5,10000.6,
            10000.7,10000.8,10000.9,10000.12};
        
        /*
        //Empty Intilization 
        int numOfEmployees = 10;
        int[] employeeID = new int[numOfEmployees];
        double[] grossPay = new double[numOfEmployees];
        */
        
        // Counter
        int i;
        
        //For Loop to Print
        for (i = 0; i < numOfEmployees; ++i){
            System.out.println("Employee ID: " + employeeID[i]);
            System.out.println("Gross Pay: " + grossPay[i]);
        }

      } 
    }
