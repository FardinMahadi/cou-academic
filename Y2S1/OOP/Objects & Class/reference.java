class Test {
    int a;

    Test(int i) {
        a = i;
    }

    Test incrementByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

class Demo {
    public static void main(String[] args) {
        Test obj1 = new Test(2);
        Test obj2;
        obj2 = obj1.incrementByTen();

        System.out.println(obj1.a);
        System.out.println(obj2.a);
    }
}
