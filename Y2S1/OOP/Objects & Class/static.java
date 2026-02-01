class Test {
    static int a = 10;
    static int b;

    {
        System.out.println("Outside static block");
    }

    static {
        b = a * 4;
        System.out.println("Static block initialized");
    }
}