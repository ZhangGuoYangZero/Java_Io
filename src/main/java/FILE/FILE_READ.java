package FILE;

import java.io.*;

public class FILE_READ {

    public void  READ(String parent,String name) throws IOException {
        Reader reader = new FileReader(parent+name);
        Writer writer = new FileWriter(parent+"c.txt");
        char[] cbuf = new char[1024];
        int i = 0;
        while((i = reader.read(cbuf))!= -1) {
            writer.write(cbuf, 0, i);
            writer.flush();
        }
        System.out.println("------------");
    }
}
