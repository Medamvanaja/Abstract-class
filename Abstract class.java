 abstract class Banks
 {
     abstract double getRateofInterest();
 }
    class HDFC extends Banks
    {
        double getRateofInterest()
        {
            return 8.50;
        }
    }
 
 class ICIC extends Banks
 {
     double getRateofInterest()
     {
         return 7.95;
     }
 }
 class Main
 {
     public static void main(String args[])
     {
         System.out.println("Gold loan EMI based information");
         Banks b;
         b=new HDFC();
         System.out.println(" Rate of Interest inHDFC is:"+b.getRateofInterest()+"%");
         b=new ICIC();
         System.out.println("Rate of Interest in ICIC is:"+b.getRateofInterest()+"%");
     }
 }
 
     
 
            
        
    
 
