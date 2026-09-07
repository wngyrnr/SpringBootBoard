package com.example.tester.boardinsert.mapper;

import com.example.tester.boardinsert.dto.BoardInsertDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardInsertMapper{
    int insert(BoardInsertDto dto);

}