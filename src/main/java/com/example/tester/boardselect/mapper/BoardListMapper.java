package com.example.tester.boardselect.mapper;

import com.example.tester.boardselect.dto.BoardListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardListMapper{
    List<BoardListDto> findAll();
}