//JOrge Cubillos
//Array Operations Methods

package arrayoperationstest;

public class ArrayOperations {
    
    //Methods
    //Total of 16
    
    //INT VALUES
    
    //Return the Int Total
    public static int getTotal(int[] array1) {
        int total = 0;
        int i;
        
        for (i=0; i < array1.length; ++i){
            total = total + array1[i];
        }
        
        return total;
    }

    //Return the Int Average
    public static int getAverage(int[] array1) {
        int avg = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            avg = avg + array1[i];
        }
        
        avg = avg / array1.length;
        
        return avg;
    }
    
    //Return the Int Highest
    public static int getHighest(int[] array1) {
        int high = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            if (array1[i] > high) {
                high = array1[i];
            }   
        }    
        return high;
    }
    
    
    //Return the Int Lowest
    public static int getLowest(int[] array1) {
        int low = 0;
        int i;
        
        for (i = 0; i < array1.length; ++i) {
            if (array1[i] < low) {
                low = array1[i];
            }
        }
        return low;
    }
    
    //FLOAT VALUES
    
    //Return the float Total
    public static float getTotal(float[] array1) {
        float total = 0;
        int i;
        
        for (i=0; i < array1.length; ++i){
            total = total + array1[i];
        }
        
        return total;
    }

    //Return the Float Average
    public static float getAverage(float[] array1) {
        float avg = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            avg = avg + array1[i];
        }
        
        avg = avg / array1.length;
        
        return avg;
    }
    
    //Return the Float Highest
    public static float getHighest(float[] array1) {
        float high = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            if (array1[i] > high) {
                high = array1[i];
            }   
        }    
        return high;
    }
    
    
    //Return the Float Lowest
    public static float getLowest(float[] array1) {
        float low = 0;
        int i;
        
        for (i = 0; i < array1.length; ++i) {
            if (array1[i] < low) {
                low = array1[i];
            }
        }
        return low;
    }
    
    
    //DOUBLE Values
    
        //Return the double Total
    public static double getTotal(double[] array1) {
        double total = 0;
        int i;
        
        for (i=0; i < array1.length; ++i){
            total = total + array1[i];
        }
        
        return total;
    }

    //Return the double Average
    public static double getAverage(double[] array1) {
        double avg = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            avg = avg + array1[i];
        }
        
        avg = avg / array1.length;
        
        return avg;
    }
    
    //Return the double Highest
    public static double getHighest(double[] array1) {
        double high = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            if (array1[i] > high) {
                high = array1[i];
            }   
        }    
        return high;
    }
    
    
    //Return the double Lowest
    public static double getLowest(double[] array1) {
        double low = 0;
        int i;
        
        for (i = 0; i < array1.length; ++i) {
            if (array1[i] < low) {
                low = array1[i];
            }
        }
        return low;
    }
    
   
    //LONG TYPES
    
    
        //Return the long Total
    public static long getTotal(long[] array1) {
        long total = 0;
        int i;
        
        for (i=0; i < array1.length; ++i){
            total = total + array1[i];
        }
        
        return total;
    }

    //Return the long Average
    public static long getAverage(long[] array1) {
        long avg = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            avg = avg + array1[i];
        }
        
        avg = avg / array1.length;
        
        return avg;
    }
    
    //Return the long Highest
    public static long getHighest(long[] array1) {
        long high = 0;
        int i;
        
        for (i=0; i < array1.length; ++i) {
            if (array1[i] > high) {
                high = array1[i];
            }   
        }    
        return high;
    }
    
    
    //Return the long Lowest
    public static long getLowest(long[] array1) {
        long low = 0;
        int i;
        
        for (i = 0; i < array1.length; ++i) {
            if (array1[i] < low) {
                low = array1[i];
            }
        }
        return low;
    }
    
    
    
    
}
