package com.example.tester.boardupdate.service;


import com.example.tester.boardupdate.dto.BoardUpdateDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface BoardService {

    BoardUpdateDto getBoard(Long boardId);
    Long updateBoard(BoardUpdateDto boardupdatedto);
}
