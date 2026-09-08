package com.example.tester.board.controller;

import com.example.tester.board.dto.BoardListResponseDto;
import com.example.tester.board.dto.BoardInsertDto;
import com.example.tester.board.dto.BoardUpdateDto;
import com.example.tester.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class BoardController{

    @Autowired
    private BoardService boardservice;

    @PostMapping("/write")
    public Long insertBoard(@RequestBody BoardInsertDto boardInsertDto) {
        return boardservice.insertBoard(boardInsertDto);
    }

    @GetMapping("/list")
    public BoardListResponseDto list(@RequestParam(defaultValue = "1") int page,
                                     @RequestParam(defaultValue = "10") int size,
                                     @RequestParam(required = false)String keyword,
                                     @RequestParam(required = false)String searchtype){
        return boardservice.boardList(page, size, keyword,searchtype);
    }

    @GetMapping("/{boardId}")
    public BoardUpdateDto detailBoard(@PathVariable Long boardId) {
        return boardservice.getBoard(boardId);
    }

    @PostMapping("/edit/{boardId}")
    public Long updateBoard(@RequestBody BoardUpdateDto dto) {
        return boardservice.updateBoard(dto);
    }

    @DeleteMapping("/delete/{boardId}")
    public Long deleteBoard(@PathVariable Long boardId) {
        boardservice.deleteBoard(boardId);
        return boardId;
    }

}