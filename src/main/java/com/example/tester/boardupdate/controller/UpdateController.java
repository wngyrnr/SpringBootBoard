package com.example.tester.boardupdate.controller;

import com.example.tester.boardupdate.dto.BoardUpdateDto;
import com.example.tester.boardupdate.mapper.BoardUpateMapper;
import com.example.tester.boardupdate.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/board")
public class UpdateController {

    @Autowired
    private BoardService boardservice;

    @GetMapping("/{boardId}")
    public BoardUpdateDto detailBoard(@PathVariable Long boardId) {
        return boardservice.getBoard(boardId);
    }

    @PostMapping("/edit/{boardId}")
    public Long updateBoard(@RequestBody BoardUpdateDto dto) {
        return boardservice.updateBoard(dto);
    }

}