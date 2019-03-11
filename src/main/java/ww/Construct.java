package ww;

class B{
    int i;
    public B() {
        System.out.println("Конструктор супер-пупер-класса (класса-прародителя)");
    }
    public B(int i) {
        this.i = i;
        System.out.println("Конструктор супер-пупер-класса с параметрами");
    }
        }
class A extends B{
    int j;
    public A() {
        System.out.println("Конструктор суперкласса (класса-родителя)");
    }
    public A(int i, int j){
        super(i);
        this.j = j;
        System.out.println("Конструктор суперкласса с параметрами и обращением к к-ру родителя");
    }
}

public class Construct extends A{
    public Construct(int a, int b){
        super(a, b);
        System.out.println("Конструктор подкласса с обращением к конструктору класса-родителя");
    }
//    public Construct(int a, int b){
//        i = a;
//        j = b;
//        System.out.println("Конструктор подкласса (класса-наследника) с параметрами");
//    }
    public Construct() {
        System.out.println("Конструктор подкласса (класса-наследника)");
    }

    public static void main(String[] args) {
//        A a = new A();
//        System.out.println();
//        Construct construct = new Construct();
//        System.out.println();
//        A b = new Construct();
//        System.out.println();
//        B c = new A();
//        System.out.println();
        B d = new Construct(1,2);
    }
}
