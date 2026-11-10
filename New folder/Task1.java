class Employee{
    String name ="kiran";
    String id ="202170";
    String salary ="9182986358";
    void work(){
        System.out.println("Writing code");
    }
    void getBonus(){
        System.out.println("Yearly twice 2000 increment");
    }
}
class Task1{
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println(emp.name);
        System.out.println(emp.id);
        System.out.println(emp.salary);
        emp.work();
        emp.getbonus();
    }
}