package cn.neyzoter.springboot.bean.service.impl;

import cn.neyzoter.springboot.bean.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Book Service Implement
 * @author Neyzoter Song
 * @date 2019/9/7
 */
@Service("autowiredBookServiceImpl")
public class BookServiceImpl implements BookService {
    private static final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);
    ArrayList<String> bookList;

    public BookServiceImpl(){
        bookList = new ArrayList<String>();
        bookList.add("Nick's Family");
        bookList.add("Amy is greate");
    }

    @Override
    public ArrayList<String> getBookList(){
        Iterator<String> it = bookList.iterator();
        for(;it.hasNext();){
            logger.info(it.next());
        }
        return bookList;
    }


    @Override
    public String getBookNameByIdx(int idx){
        String bookName = bookList.get(idx);
        logger.info(bookName);
        return bookName;
    }
}
