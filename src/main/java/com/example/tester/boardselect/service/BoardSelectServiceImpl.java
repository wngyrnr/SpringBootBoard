package com.example.tester.boardselect.service;


import com.example.tester.boardselect.dto.BoardListDto;
import com.example.tester.boardselect.mapper.BoardListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardSelectServiceImpl implements BoardSelectService{

    @Autowired
    private BoardListMapper boardlistmapper;

    @Override
    public List<BoardListDto> boardSelect() {
        List<BoardListDto> boardlist = boardlistmapper.findAll();
        return boardlist;
    }

}
