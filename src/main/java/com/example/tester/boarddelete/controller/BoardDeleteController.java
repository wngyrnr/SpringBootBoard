package com.example.tester.boarddelete.controller;

import com.example.tester.boarddelete.service.BoardDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/board")
public class BoardDeleteController {

    @Autowired
    private BoardDeleteService boardDeleteService;

    @DeleteMapping("/delete/{boardId}")
    public Long deleteBoard(@PathVariable Long boardId) {
        boardDeleteService.deleteBoard(boardId);
        return boardId;
    }
}
