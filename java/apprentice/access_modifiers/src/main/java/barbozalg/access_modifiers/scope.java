package barbozalg.access_modifiers;

public class scope {
    private int a;
    int b;
    protected int c;
    public int d;

    public scope(){
        this.a = 1;
        this.b = 2;
        this.c = 3;
        this.d = 4;

        System.out.println("----- Read From class -----");
        System.out.println("private int a: " + this.a);
        System.out.println("int b (Default): " + this.b);
        System.out.println("protected int c: " + this.c);
        System.out.println("public int d: " + this.d + "\n");

        System.out.println("----- Write From class -----");
        this.a += 1;
        System.out.println("private int a: " + this.a);
        this.b += 1;
        System.out.println("int b (Default): " + this.b);
        this.c += 1;
        System.out.println("protected int c: " + this.c);
        this.d += 1;
        System.out.println("public int d: " + this.d + "\n");
    }

}
