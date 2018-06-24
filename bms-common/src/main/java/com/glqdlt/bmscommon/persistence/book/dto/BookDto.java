package com.glqdlt.bmscommon.persistence.book.dto;

import com.glqdlt.bmscommon.persistence.artist.entity.Author;
import lombok.Data;

@Data
public class BookDto {

    private Integer id;

    private String title;

    private Author author;


}
