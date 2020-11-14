package com.paipai.Array1;
//使用一维数组模拟栈数据结构，可以存储任何类型的数据，push方法压栈，pop方法弹栈，栈满，栈空都要有提示信息
//new栈对象，push，pop方法，模拟操作
public class Test {

    public static void main(String[] args) {
        MyStack mm=new MyStack();
        boolean result=false;

        mm.push("123");
        mm.printArray();

        System.out.println(mm.pop());
        mm.printArray();

        mm.push("123");
        mm.printArray();

        System.out.println(mm.pop());
        mm.printArray();

    }



}


class MyStack{
    Object[] mystack={"aaa","bbb","ccc"};
    int mystack_length=3;
    int index=mystack_length;

    public boolean push(Object obj){
        if(index==mystack.length) {
            System.out.println("栈已满！");
            return false;
        }
        else {
            mystack[index] = obj;
            System.out.println("压栈元素"+mystack[index]);
            index++;
            return true;
        }

    }
    public Object pop(){
        if(mystack.length==-1) {
            System.out.println("栈已空！");
            return null;
        }
        else {
            index--;
            return mystack[index];
        }
    }
    MyStack(){}
    MyStack(Object[] mystack){
        this.mystack=mystack;
        this.mystack_length= mystack.length;


    }
    public void printArray(){
        int i;
        System.out.println("=============");
        if (index<=mystack_length) {
            for (i = 0; i < index; i++)
                System.out.println(mystack[i]);
        }
        System.out.println("=============");
    }
}


