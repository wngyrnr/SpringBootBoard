package com.example.tester.boardList.controller;

import com.example.tester.boardList.dto.BoardListResponseDto;
import com.example.tester.boardList.service.BoardListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardListController {

    @Autowired
    private BoardListService boardselectservice;

    @GetMapping("/list")
    public BoardListResponseDto list(@RequestParam(defaultValue = "1") int page,
                                     @RequestParam(defaultValue = "10") int size,
                                     @RequestParam(required = false)String keyword,
                                     @RequestParam(required = false)String searchtype){
        return boardselectservice.boardList(page, size, keyword,searchtype);
    }

}
