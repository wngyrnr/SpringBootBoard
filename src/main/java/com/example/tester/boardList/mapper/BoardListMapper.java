package com.example.tester.boardList.mapper;

import com.example.tester.boardList.dto.BoardListDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardListMapper{
    List<BoardListDto> findByPage(@Param("offset")int offset,
                                  @Param("size") int size,
                                  @Param("keyword")String keyword,
                                  @Param("searchType")String searchType);
    long countAll(@Param("keyword")String keyword,
                 @Param("searchType")String searchType);
}