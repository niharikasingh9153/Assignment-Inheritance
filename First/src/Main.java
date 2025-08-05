public class Main {
    public static void main(String[] args) {
        String name = myName();
        System.out.println(name);
        MyJavaClass mc = new MyJavaClass();
        mc.myNameMethod(name);


    }

    public static String myName() {
        return "Niharika";
    }
}