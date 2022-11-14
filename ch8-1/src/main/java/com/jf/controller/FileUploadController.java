package com.jf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Description
 * @Author lzzz
 * @Date 2022-10-23 17:27
 */
@Controller
public class FileUploadController {

    /**
     * 执行文件上传
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(
            @RequestParam("file") MultipartFile file,
            @RequestParam("name") String name,
            HttpServletRequest request) {
        if (!file.isEmpty()) {
            // 获取原始文件名
            String originalFileName = file.getOriginalFilename();
            // 设置文件的保存路径
            String dirPath = request.getServletContext().getRealPath("/upload/");
            File filePath = new File((dirPath));
            // 目录不存在则创建目录
            if (!filePath.exists()) {
                filePath.mkdirs();
            }
            String fileName = name + "_" + UUID.randomUUID() + "_" + originalFileName;
            try {
                System.out.println(fileName);
                file.transferTo(new File(dirPath + fileName));
            } catch (IOException ex) {
                ex.printStackTrace();
                return "error";
            }
            return "success";
        } else {
            return "error";
        }
    }
}
