public class p2{
public static void main(String[]args){ 
double x,k,i,arctan;
       x=0.5;
       k=3;
       arctan=0;

       for (i=0; i<=4; i++){
        if (i == 0){
            arctan = x ;
        }
        else if ( i % 2==0 ){
            
            arctan = arctan + (Math.pow(x,k)/k);
        
         k = k+2;   
        }
        else if (i%2==1){
            arctan = arctan -(Math.pow(x,k)/k);
        
        k = k+2;
        
        }
        }
      
         System.out.println("result:");
       System.out.println(arctan);
       System.out.println(Math.atan(0.5));
       
     
    }
    
}
