class Demo {
    public static void main(String[] args) {
        Test[] array = new Test[10];

        for (int i = 0; i < 10; i++)
            array[i] = new Test(i);
    }
}