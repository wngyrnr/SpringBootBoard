package com.example.tester.boardinsert.service;


import com.example.tester.boardinsert.dto.BoardInsertDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface BoardInsertService {
    Long insertBoard(BoardInsertDto boardInsertDto);

}
