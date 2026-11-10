class Car{
    String color;
    void speed(){
        System.out.println("speed"+num);
    }
}
class Task3{
    public static void main(String[] args){
        Car bmw = new Car();
        Car rr = new Car();
        Car tesla = new Car();
        Car ferari = new Car();

        bmw.color ="red";
        System.out.println(bmw.color);
        bmw.speed(200);
        rr.color ="blue";
        System.out.println(rr.color);
        rr.speed(300);
        tesla.color ="black";
        System.out.println(tesla.color);
        tesla.speed(400);
        ferari.color ="white";
        System.out.println(ferari.color);
        ferari.speed(500);
    }
}