package myfirstpackage;
public class MySecondClass{
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