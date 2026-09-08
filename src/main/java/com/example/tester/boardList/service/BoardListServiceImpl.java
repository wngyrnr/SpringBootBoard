package com.example.tester.boardList.service;


import com.example.tester.boardList.dto.BoardListDto;
import com.example.tester.boardList.dto.BoardListResponseDto;
import com.example.tester.boardList.mapper.BoardListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardListServiceImpl implements BoardListService {

    @Autowired
    private BoardListMapper boardlistmapper;

    @Override
    public BoardListResponseDto boardList(int page, int size) {
        int offset = (page -1) * size;

        List<BoardListDto> content = boardlistmapper.findByPage(offset,size);
        long totalElements = boardlistmapper.countAll();
        int totalPage = (int) Math.ceil((double) totalElements / size);


        return new BoardListResponseDto(content,totalElements,totalPage,page);
    }


}
