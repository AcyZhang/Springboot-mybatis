package com.example.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.common.FileUtil;
import com.example.common.HttpAPIService;
import com.example.common.img;
import com.example.pojo.User;
import com.example.service.UserService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by AcY on 2018/4/25.
 */

@Controller
@RequestMapping("/boot")
@Component
public class userController {
    @Autowired
    private UserService userService;
    @Autowired
    private HttpAPIService httpAPIService;

    @RequestMapping("/sss")
    @ResponseBody
    public List<User> he() {
        return userService.getUsers();
    }


    @RequestMapping("/list")
    // @ResponseBody
    public String getUsersd(Model model) {
        List<User> user = userService.getUsers();
        model.addAttribute("list", user);
        return "sel";
    }

    @RequestMapping(value = "/login")
    public String login(Model model) {
//        List<User> user=userService.getUsers();
//        model.addAttribute("item",user);
        //  ModelAndView mav = new ModelAndView("items");
        return "uploadfile";
    }

    /**
     * 通过http请求返回数据
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/httpc")
    @ResponseBody
    public String httpc() throws Exception {
        String str = httpAPIService.get("http://127.0.0.1:8080/boot/login");
        //  String str =httpAPIService.get("http://www.jianshu.com");
        System.out.println(str);
        return str;
    }


    @RequestMapping(value = "/index", method = RequestMethod.POST)
//     @ResponseBody
    public String uploadImg(User user, @RequestParam("attachs") MultipartFile file,
                            HttpServletRequest request) {
        String contentType = file.getContentType();
        boolean flag = true;
        String fileName = file.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        try {
            FileUtil.uploadFiles(file.getBytes(), filePath, fileName);
        } catch (Exception e) {

        }
        if (flag) {
            user.setImgpath(filePath + fileName);
            int count = userService.dubAdd(user);
            if (count > 0) {
                return "redirect:/boot/list";
            }
        }
        return "uploadfile";
    }
//    @RequestMapping("/DelDub")
//    public String delete( Integer id) {
//        userService.DelDub(id);
//        return "redirect:sel";
//    }


    @RequestMapping("/DelDub")
    @ResponseBody
    public Map<String, String> deldub(@RequestParam(value = "id", defaultValue = "0") Integer id) {
        int mun = userService.DelDub(id);
        Map<String, String> map = new HashMap<>();
        System.out.println("===========" + id);
        if (mun >= 1) {
            map.put("messag", "1");
            return map;
        } else {
            map.put("messag", "0");
        }
        return map;
    }

    @RequestMapping("/uupdub")
    public String upDub(@RequestParam("id") Integer id, Model model) {
        User user = userService.getUpDub(id);
        model.addAttribute("Dub", user);
        return "upup";
    }


//    public String index(User user, @RequestParam(value = "attachs", required = false)
//            MultipartFile[] attachs, HttpServletRequest request, HttpSession session) {
//        String idPicPath = null;
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
//                        System.out.println("+++++++++++++++++++"+path);
//                    }
//                    try {
//                        System.out.println("==========="+path);
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
//        if (flag) {
//            user.setImgpath(idPicPath);
//            int count = userService.dubAdd(user);
//            if (count > 0) {
//                System.out.println("dfdffsf");
//                return "uploadfile";
//            }
//        }
//        System.out.println("出错了");
//        return "uploadfile";
//    }
}
