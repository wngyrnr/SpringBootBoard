package com.example.tester.boardinsert.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardInsertDto {
    private Long boardId;
    private String category;
    private String title;
    private String content;
    private String Writer;
}