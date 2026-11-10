import java.util.Scanner;

class Add{
    Add (int a,int b){
    Int res=a+b;
    System.out.println(res);
    }
}
class Sub{
    Sub (int a,int b){
    Int res=a-b;
    System.out.println(res);
    }
}
class Mul{
    Mul (int a,int b){
    Int res=a*b;
    System.out.println(res);
    }
}
class Div{
    Div (int a,int b){
    Int res=a/b;
    System.out.println(res);
    }
}
class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two values");
        int s=sc.nextInt();
        int c=sc.nextInt();
        Add ad =new Add(s,c);
        Sub su =new Sub(s,c);
        Mul mu =new Mul(s,c);
        Div di =new Div(s,c);
    }
}