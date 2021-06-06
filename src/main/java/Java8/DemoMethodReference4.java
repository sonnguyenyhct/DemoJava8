package Java8;
interface SayHello{
    void display(String say);
}

class Hello implements SayHello{
    public Hello(String say) {
        System.out.println(say);
    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}
public class DemoMethodReference4 {
    public static void main(String[] args) {
        SayHello ref = Hello::new;
        ref.display("hello");
    }
}
