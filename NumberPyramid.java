public class p1{
public static void main(String[]args){
int i,x,y;
x=0;
 for(i=1; i<=9;i++){
            y = x;
            x = y * 10 + i;
            y = x * 8 + i;
            System.out.println(x+ " = "+y);
        }
    }
}