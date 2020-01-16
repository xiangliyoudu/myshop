package com.xlyd.com.myshop;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyshopApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(MyshopApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Autowired
    private GoodDao goodDao;

    @Test
    void testList() {
        List<Good> goods = goodDao.listAll();
        System.out.println(goods.size());
    }

    @Test
    void testAdd() {
        Good good = new Good();
        good.setPname("产品1");
        good.setSpec("俄罗斯阿孔特品牌");
        good.setSpec("500克/袋 13袋/箱");
        good.setPrice(14.00);
        good.setSalePrice(20.00);
        good.setSellPrice(25.00);
        good.setTotalNumber(1);
        good.setStock(145);
        good.setStorehouse("七号库");
        good.setPicture("E:\\imp-pes-cust\\myshop\\src\\main\\resources\\static\\picture\\product1.png");
        goodDao.addOne(good);
    }

    @Test
    void testDeleteOne() {
        Integer id = 5;
        logger.info("result:", this.goodDao.deleteOne(id));
    }


}
