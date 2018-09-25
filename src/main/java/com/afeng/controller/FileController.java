package com.afeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

/**
 * @author afeng
 * @date 2018/9/25 20:53
 **/
@Controller
public class FileController
{
    @RequestMapping("fileUpload")
    public String fileUpload(MultipartFile file)
    {
        //获取原始文件名
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);

        File fileCategory = new File(fileName);
        try
        {
            file.transferTo(fileCategory);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return "/success.html";
    }


    /**
     * 多文件上传
     * @param files
     * @return
     */
    @RequestMapping("/multiFileUpload")
    public String multiFileUpload(MultipartFile[] files)
    {

        /**
         * 上传多文件,foreach遍历
         */
        for (MultipartFile file : files)
        {
            String fileName = file.getOriginalFilename();
            System.out.println(fileName);

            File f = new File(UUID.randomUUID() + fileName);
            try
            {
                /**
                 * 将表单提交的文件对象传输到新建的文件对象
                 */
                file.transferTo(f);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        return "/success.html";
    }


}
