package com.jf;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;


/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-23 20:51
 */
@Controller
public class FileController {

    @RequestMapping("/fileDownload1")
    public void download(HttpServletRequest request, HttpServletResponse response, String fileName){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try{
            // 指定下载文件所在路径
            String path = request.getServletContext().getRealPath("/upload/");
            // 创建该文件的对象
            File file = new File(path + File.separator + fileName);
            // 获取文件长度
            long length = file.length();
            //文件编码
            fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
            // 设置响应头
            response.setContentType("application/octet-stream");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName);
            response.setContentLengthLong(length);
            //以输入流打开文件
            bis = new BufferedInputStream(new FileInputStream(file));
            // 获取响应的输出流
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            //将文件写入响应的输出流
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))){
                bos.write(buff, 0, bytesRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /**
     * 以ResponseEntity进行文件下载
     */
    @RequestMapping("/fileDownload2")
    public ResponseEntity<byte[]> download(HttpServletRequest request, String fileName) throws IOException {
        // 指定下载文件所在路径
        String path = request.getServletContext().getRealPath("/upload/");
        // 创建该文件的对象
        File file = new File(path + File.separator + fileName);
        // 获取文件长度
        long length = file.length();
        //文件编码
        fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        // 设置响应头
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment", fileName);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //使用ResponseEntity对象返回数据
        return new ResponseEntity<>(FileUtils.readFileToByteArray(file), httpHeaders, HttpStatus.OK);
    }
}
