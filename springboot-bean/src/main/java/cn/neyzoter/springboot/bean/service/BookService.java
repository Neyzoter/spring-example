package cn.neyzoter.springboot.bean.service;

import java.util.ArrayList;

public interface BookService {

    /**
     * @apiNote get book list
     * @return {@link ArrayList}
     */
    ArrayList<String> getBookList();


    /**
     * @apiNote get book name by id
     * @return {@link String}
     */
    String getBookNameByIdx(int idx);

}
