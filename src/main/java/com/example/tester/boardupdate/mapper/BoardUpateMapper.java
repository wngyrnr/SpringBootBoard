package com.example.tester.boardupdate.mapper;

import com.example.tester.boardupdate.dto.BoardUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;


@Mapper
public interface BoardUpateMapper{
    int update(@PathVariable BoardUpdateDto dto);
    BoardUpdateDto findselect(Long boardId);
}
