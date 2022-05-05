package FILE;

import java.io.*;

public class BuffereD {

    public void buffereD(String Parent, String name) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(Parent + name));

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(Parent + "zg.jpg"));

        //可也i自定义一个BATY数组，也可以不用 就直接用缓冲区
        int temp;
        while ((temp = bufferedInputStream.read()) != -1)
            bufferedOutputStream.write(temp);
        bufferedOutputStream.flush();

        System.out.println("--------------------");

    }


    public class BuffereD1 {

        public void buffereD1(String parent, String name) throws IOException {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(parent + name),1024);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(parent + "zg.jpg"),1024);

            byte[] bytes = new byte[1024];
            int temp;
            while ( (temp = bufferedInputStream.read(bytes))!=-1)
                bufferedOutputStream.write(bytes,0,temp);
            bufferedOutputStream.flush();
            System.out.println("--------------------");

        }
    }

}
