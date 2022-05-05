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



}
