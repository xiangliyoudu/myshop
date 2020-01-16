package com.xlyd.com.myshop;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodDao {

    List<Good> listAll();

    Integer addOne(@Param("good") Good good);

    Integer deleteOne(@Param("id") Integer id);
}
