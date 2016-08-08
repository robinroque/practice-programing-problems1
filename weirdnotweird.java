import java.util.*;
class weird{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n;
        System.out.println("Enter an Integer:");
        n=s.nextInt();
        if (n % 2 == 1){
            System.out.println("Weird");
        }
            else if (n == 4){
                    System.out.println("Not Weird");
            }
            else if (n>6&&n<20&&n%2==0){
                System.out.println("Weird");
                    }
            else if (n>20 && n%2==0){
                System.out.println("Not Weird");
            }
    }
}