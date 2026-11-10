class Globalscope{
    public static void main(String[]args){
        int a =10; // global scope
        int c;
        {
            int b =20; // local scope
            c = b;
            System.out.println(a);
            System.out.println(b);
        }
        System.out.println(a);
        System.out.println(c);
    }
}