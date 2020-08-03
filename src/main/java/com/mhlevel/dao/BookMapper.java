package com.mhlevel.dao;

import com.mhlevel.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author superquanbin@gmail.com
 * @date 2020-08-03 17:16
 */
public interface BookMapper {

    // 增加一本书
    int addBook(Books books);

    // 删除一本书
    int deleteBookById(@Param("bookId") int id);

    // 更新一本书
    int updateBook(Books books);

    // 查询一本书
    Books queryBookById(@Param("bookId")int id);

    // 查询全部的书
    List<Books> queryAllBook();
}
