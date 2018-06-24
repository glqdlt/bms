package com.glqdlt.bmsserver.controller.api.book;


import com.glqdlt.bmscommon.persistence.book.entity.Book;
import com.glqdlt.bmsserver.controller.api.DataTableVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping(value = "/book")
@RestController
public class BookRestController {

    @GetMapping("/find/books")
    public DataTableVo<Book> findBooks(){
        return null;
    }
}
