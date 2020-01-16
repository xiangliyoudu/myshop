package com.xlyd.com.myshop;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodDao goodDao;

    @GetMapping("/listAll")
    public List<Good> listAll() {
        return goodDao.listAll();
    }

    @Transactional
    @PostMapping("/addOne")
    public Integer addOne(Good good) {
        Integer result = 0;
        // 上传文件
        try {
            MultipartFile picFile = good.getPicFile();
            if (picFile != null && !picFile.isEmpty()) {
                File file = new File(picFile.getOriginalFilename());
                if (!file.exists()) {
                    file.createNewFile();
                }
                picFile.transferTo(file);
            }
            result = goodDao.addOne(good);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @PostMapping("/uploadPic")
    public void uploadPicture(MultipartFile file) {
        System.out.println(file.getOriginalFilename());
    }

    @Transactional
    @DeleteMapping("/deleteOne")
    public Integer deleteOne(Integer id) {
        Integer result = goodDao.deleteOne(id);
        return result;
    }

    public static void main(String[] args) {

    }
}
