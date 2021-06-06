package JavaClonable;

public class CloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Programer programer = new Programer("Son",25);
        Programer programer1 = programer.clone();
        programer1.setName("Son1");

        System.out.println(programer.getName());
        System.out.println(programer1.getName());
    }
}
