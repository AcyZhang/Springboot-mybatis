package com.example.common;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by AcY on 2018/7/17.
 */
public class FileUtil {

    public static void uploadFiles(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

}
