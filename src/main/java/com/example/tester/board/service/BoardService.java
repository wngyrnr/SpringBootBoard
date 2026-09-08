package com.example.tester.board.service;


import com.example.tester.board.dto.BoardListResponseDto;
import com.example.tester.board.dto.BoardInsertDto;
import com.example.tester.board.dto.BoardUpdateDto;


public interface BoardService{
    Long insertBoard(BoardInsertDto boardInsertDto);
    BoardListResponseDto boardList(int page, int size , String keyword, String searchtype);
    BoardUpdateDto getBoard(Long boardId);
    Long updateBoard(BoardUpdateDto boardupdatedto);
    Long deleteBoard(Long boardId);
}
