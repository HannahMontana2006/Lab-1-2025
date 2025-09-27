import myfirstpackage.MySecondClass;
class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(5,6);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.modification1(i);
                o.modification2(j);
                System.out.print(o.actions());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
