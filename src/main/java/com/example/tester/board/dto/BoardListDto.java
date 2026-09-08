package com.example.tester.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BoardListDto{
    private String category;
    private String title;
    private String writer;
    private LocalDateTime createAt;
}
