package com.mhlevel.service;

import com.mhlevel.dao.BookMapper;
import com.mhlevel.pojo.Books;

import java.util.List;

/**
 * @author superquanbin@gmail.com
 * @date 2020-08-03 18:19
 */
public class BookServiceImpl implements BookService {


    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper){
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
