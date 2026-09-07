package com.example.tester.boardinsert.controller;


import com.example.tester.boardinsert.dto.BoardInsertDto;
import com.example.tester.boardinsert.service.BoardInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class BoardInsertController {

    @Autowired
    private BoardInsertService boardinsertservice;

    @PostMapping("/write")
    public Long insertBoard(@RequestBody BoardInsertDto boardInsertDto) {
        return boardinsertservice.insertBoard(boardInsertDto);
    }

}
