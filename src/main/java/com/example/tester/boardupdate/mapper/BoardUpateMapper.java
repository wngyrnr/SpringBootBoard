package com.example.tester.boardupdate.mapper;

import com.example.tester.boardupdate.dto.BoardUpdateDto;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardUpateMapper{
    int update(BoardUpdateDto dto);
    BoardUpdateDto findselect(Long boardId);
}
