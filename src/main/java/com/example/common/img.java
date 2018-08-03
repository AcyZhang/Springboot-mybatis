package com.example.common;

//import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

/**
 * Created by AcY on 2018/7/16.
 */
public class img {

//    public static void imgupload(MultipartFile[] attachs, HttpServletRequest request, HttpSession session){
//        String idPicPath=null;
//        String errorInfo = null;
//        boolean flag = true;
//        String path = request.getSession().getServletContext().getRealPath("statics" + File.separator + "uploadfiles");
//        for (int i = 0; i < attachs.length; i++) {
//            MultipartFile attach = attachs[i];
//            if (!attach.isEmpty()) {
//                if (i == 0) {
//                    errorInfo = "uploadFileError";
//                } else if (i == 1) {
//                    errorInfo = "uploadWpErrpr";
//                }
//                String oldFileName = attach.getOriginalFilename();
//                String prefix = FilenameUtils.getExtension(oldFileName);
//                int fileseze = 5000000;
//                if (attach.getSize() > fileseze) {
//                    request.setAttribute("uploadFileError", "文件上传大小超过上限");
//                    flag = false;
//                } else if (prefix.equalsIgnoreCase("jpg") ||
//                        prefix.equalsIgnoreCase("png") ||
//                        prefix.equalsIgnoreCase("pneg") ||
//                        prefix.equalsIgnoreCase("jpeg")) {
//                    String fileName = System.currentTimeMillis() + "_person.jpg";
//                    File targetFile = new File(path, fileName);
//                    if (!targetFile.exists()) {
//                        targetFile.mkdirs();
//                    }
//                    try {
//                        attach.transferTo(targetFile);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                        request.setAttribute("uploadFileError", "文件上传失败");
//                        flag = false;
//                    }
//                    if (i == 0) {
//                        idPicPath = path + File.separator + fileName;
//                    }
//                } else {
//                    request.setAttribute(errorInfo, "*上传图片格式不正确");
//                    flag = false;
//                }
//            }
//        }
//    }
}
