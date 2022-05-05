package FILE;
//没有软件包就从项目目录下走
//有就不用走项目包，

import java.io.IOException;

public class FILE {

    public void file(String parent, String name) throws IOException {

        /*file.txt
        C:\IDEA\project\Java_Io\src\main\java\FILE\file.txt
        false
        * */
        //创建一个file文件
        java.io.File file = new java.io.File(parent, name);
        //创建文件
        file.createNewFile();
        //获取文件名字
        System.out.println(file.getName());
        //获取路径
        System.out.println(file.getAbsoluteFile());
        //删除文件
        file.delete();
        System.out.println(file.exists());


    }


}
