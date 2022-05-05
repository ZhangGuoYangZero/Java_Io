package FILE;

import java.io.File;

public class DIR {

    //protected default private 都不能挎包使用除非有继承
    public void Mkdir(String parent,String name){
        File file = new File(parent,name);
        //创建目录
        System.out.println(file.mkdir());
        System.out.println(file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.delete());
        //文件夹跟文件一样的操作，除非了创建的方式不一样，其他都一样
        System.out.println("-------------");


    }
}
