package Interface;
interface test{
    void meth1();
    void meth2();
}
class A implements test{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }
    @Override
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        test t = new A();
        t.meth1();
        t.meth2();

    }
}
