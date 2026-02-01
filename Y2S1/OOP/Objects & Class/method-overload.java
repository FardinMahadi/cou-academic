class Test {
    int a, b;

    Test(int i, int j) {
        this.a = i;
        this.b = j;
    }

    boolean equalTo(Test obj) {
        if (obj == null)
            return false;

        return obj.a == a && obj.b == b;
    }
}

class Demo {
    public static void main(String[] args) {

        Test obj1 = new Test(100, 22);
        Test obj2 = new Test(100, 22);
        Test obj3 = new Test(-1, -1);

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equalTo(obj2));
        System.out.println(obj1.equalTo(obj3));
    }
}
