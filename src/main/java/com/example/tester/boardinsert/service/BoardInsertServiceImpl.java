package com.example.tester.boardinsert.service;

import com.example.tester.boardinsert.dto.BoardInsertDto;
import com.example.tester.boardinsert.mapper.BoardInsertMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class BoardInsertServiceImpl implements BoardInsertService {

    @Autowired
    private BoardInsertMapper boardinsertmapper;

    @Override
    public Long insertBoard(BoardInsertDto boardInsertDto){
        boardinsertmapper.insert(boardInsertDto);
        return boardInsertDto.getBoardId();
    }


}
