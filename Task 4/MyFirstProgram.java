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
class MySecondClass{
    private int num1;
    private int num2;

    public MySecondClass(int num1, int num2){
        modification1(num1);
        modification2(num2);
    }

    public void modification1(int num1){
        this.num1=num1;
    }

    public void modification2(int num2){
        this.num2=num2;
    }

    public int actions(){
        int res = num1*num2;
        return res;
    }
}