import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import FILE.FILE;
import FILE.DIR;
import java.io.IOException;
import FILE.FILE_READ;
import FILE.BuffereD;

public class TEST {
    @Test
    public  void  test(){
        try {
            new FILE().file("src/main/java/FILE/","file.txt");
            System.out.println("--------");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    @Test
    public  void test1(){
        new DIR().Mkdir("src/main/java/FILE/","file");

    }


    @Test
    public  void  test2(){
        try {
            new FILE_READ().READ("src/main/java/FILE/","图片不行-文本来.txt");
        } catch (IOException e) {
           e.getMessage();
        }
    }

    @Test
    public  void test3(){
        try {
            new BuffereD().buffereD("src/main/java/FILE/","th.jpg");

        } catch (IOException e) {
            e.getMessage();
        }
    }


    @Test
    public  void test4(){
        try {
           new BuffereD().new BuffereD1().buffereD1("src/main/java/FILE/","th.jpg");

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public  interface   TT1{
         public  Integer  getTT(int a);
    }

    // 静态成员类可以被实例化,跟普通的没什么用
    public  static class  tt{
         public    Integer gettt(int a){return a;}
    }
    @Test
    public void  test5(){
        //可以理解为调用一个接口的方法返回一个值来传递，
        //但是这个接口是我直接用匿名内部类实现的，并且重写了它的方法，并在生成后直接调用，保存直JVM
        //成员接口和成员静态类不用在NEW 可以直接调用，而普通成员类则要
        //如果调用的是成员静态类的非静态方法，则要NEW一下成员静态类

        int a = new tt().gettt(6);
        System.out.println( a);
        System.out.println("***************");
        a = new TEST.TT1(){
            @Override
            public Integer getTT( int b){
                return b;
            };
        }.getTT(5);
        System.out.println("*****************");
        System.out.println(a);
    }




}
