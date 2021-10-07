package Week06;

class StaticSample2 {
    public int n;
    public void g() {
        m = 20;
    }
    public void h() {
        m = 30;
    }
    public static int m;
    public static void f() {
        m = 5;
    }
}

public class StaticEx2 {
    public static void main(String[] args) {
        StaticSample2.m = 10;

        StaticSample2 s1;
        s1 = new StaticSample2();
        System.out.println(s1.m);
        s1.f();
        StaticSample2.f();
    }
}
