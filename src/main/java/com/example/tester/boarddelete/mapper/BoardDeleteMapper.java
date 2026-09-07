package com.example.tester.boarddelete.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDeleteMapper {
    int deleteBoard(Long boardId);
}
