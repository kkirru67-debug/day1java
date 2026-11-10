class Smartphone{
    String model ="nothing";
    String os = "andriod";
    String storagecapacity ="256";
    void takephoto(){
        System.out.println("Click photo captured");
    }
    void browserinternet(){
        System.out.println("Browser loading");
    }
}
class Task2{
    public static void main(String[] args){
        Smartphone smart = new Smartphone();
        System.out.println(smart.model);
        System.out.println(smart.os);
        System.out.println(smart.storagecapacity);
        smart.takephoto();
        smart.browserinternet();
    }
}
