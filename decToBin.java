import java.util.*;
public class decToBin {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("*Decimal--->"+i);
        binary(i);
        octal(i);
        hexaDecima(i);
    }
    public static void binary(int i){
        //System.out.println("Enter your DECIMAL NO");
        int j = 0;
        String t="";
        while(i!=0){
            j=i%2;
            t=Integer.toString(j)+t;
            i=i/2;
        }
        System.out.println("*Binary--->"+t);
    }
    public static void octal(int i){
        //System.out.println("Enter your DECIMAL NO");
        int j = 0;
        String t="";
        while(i!=0){
            j=i%8;
            t=Integer.toString(j)+t;
            i=i/8;
        }
        System.out.println("*Octal--->"+t);
    }
    public static void hexaDecima(int i){
        int j = 0;
        String t="";
        while(i!=0){
            j=i%16;
            if(j==10){
                t="A"+t;
            }
            else if(j==11){
                t="B"+t;
            }
            else if(j==12){
                t="C"+t;
            }
            else if(j==13){
                t="D"+t;
            }
            else if(j==14){
                t="E"+t;
            }
            else if(j==15){
                t="F"+t;
            }
            else {
                t = Integer.toString(j) + t;
            }
            i=i/16;
        }
        System.out.println("*Hexadecimal--->"+t);
    }
}
