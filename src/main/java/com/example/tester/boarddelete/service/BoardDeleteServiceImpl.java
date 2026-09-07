package com.example.tester.boarddelete.service;

import com.example.tester.boarddelete.mapper.BoardDeleteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDeleteServiceImpl implements BoardDeleteService {

    @Autowired
    private BoardDeleteMapper boardDeleteMapper;

    @Override
    public Long deleteBoard(Long boardId) {
        boardDeleteMapper.deleteBoard(boardId);
        return boardId;
    }
}
