import java.util.Scanner;
 class Calculate{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
      String name, clas, place;
        int age;
        System.out.println("enter age:");
        age=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name:");
        name =sc.nextLine();
        System.out.println("enter class:");
        clas =sc.nextLine();
        System.out.println("enter place:");
        place =sc.nextLine();
        System.out.println("student details:");
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("class:"+10);
        System.out.println("place:"+place);
    
    
        System.out.println("enter a number:");
        System.out.println("enter b number:");
        System.out.println("enter C number:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int C = sc.nextInt();
        
        System.out.println(a+b-C);

       
       
    }
 }