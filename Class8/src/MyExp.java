public class MyExp {

    static void setPercentage(int pct) {
        if( pct < 0 || pct > 100) {
             throw new IllegalArgumentException("bad percent");
         }
         System.out.println("HIIII");
    }
    
    public static void main(String[] args) {
        int[] x = { 1, 2, 3 };
        try {
            System.out.println(x[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("It is empty !");
        } finally {
            System.out.println("PRINT ME!!");
        }

        //testing my code
        
        try{
            setPercentage(1000);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Wront Input !!!!"+e.getLocalizedMessage());
        }
        catch(Exception e){
            System.out.println("GENERAL ERROR ");
        }
        finally{System.out.println("BYEEE");}
        System.out.println("Everything else");

    }
}
