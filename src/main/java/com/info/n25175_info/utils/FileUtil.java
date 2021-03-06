package com.info.n25175_info.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;

/**
 * Class Name: com.info.n25175_info.utils.FileUitl
 * ==================================
 * Author c25175 黄凯
 * Date 2019/12/2411:38
 * Description: FileUitl
 * ==================================
 */
public class FileUtil {
    /**
     * Compress all .xlsx Files under original path.
     *
     * */
    public static void compress(File original, ZipOutputStream out) {
        try {
            if (original == null) {
                System.err.println("Null original file is not allowed.");
            }
            if (!original.isFile()) {
                File[] files = original.listFiles();
                for (File file : files) {
                    compress(file, out);
                }
            } else if (original.isFile() && original.getName().endsWith(".xlsx")) {
                FileInputStream fis = new FileInputStream(original);
                int j = 0;
                byte[] buffer = new byte[1024];
                out.putNextEntry(new ZipEntry(original.getName()));
                while ((j = fis.read(buffer)) > 0) {
                    out.write(buffer, 0, j);
                }
                fis.close();
                out.flush();
            } else if (original.isFile() && original.getName().endsWith(".docx")) {
                FileInputStream fis = new FileInputStream(original);
                int j = 0;
                byte[] buffer = new byte[1024];
                out.putNextEntry(new ZipEntry(original.getName()));
                while ((j = fis.read(buffer)) > 0) {
                    out.write(buffer, 0, j);
                }
                fis.close();
                out.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete all files under path.
     *
     * */
    public static boolean deleteDir(String path){
        File file = new File(path);
        if(!file.exists()){
            System.err.println("The dir are not exists!");
            return false;
        }
        String[] content = file.list();
        for(String name : content){
            File temp = new File(path, name);
            if(temp.isDirectory()){
                deleteDir(temp.getAbsolutePath());
                temp.delete();
            }else{
                if(!temp.delete()){
                    System.err.println("Failed to delete " + name);
                }
            }
        }
        return true;
    }

    /**
     * Create zip file
     * @param originalFile : the directory contains all files prepared to compress.
     * @param out : ZIP file out put stream
     * */
    public static void createZipFile(File originalFile, ZipOutputStream out) {
        FileUtil.compress(originalFile, out);
        if (out != null) {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * clone input stream
     *
     * */
    public static ByteArrayOutputStream cloneInputStream(InputStream in) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while((len=in.read(buffer)) >0) {
                out.write(buffer, 0, len);
            }
            out.flush();
            return out;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    /*public static void main(String[] args) {
        deleteDir("C:\\Users\\mh\\Desktop\\TEMP");
    }*/
}
