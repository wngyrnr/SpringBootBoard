package com.example.tester.boardupdate.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Getter
@Setter
@AllArgsConstructor
public class BoardUpdateDto{
    private Long boardId;
    private String category;
    private String title;
    private String content;
    private String Writer;
}
