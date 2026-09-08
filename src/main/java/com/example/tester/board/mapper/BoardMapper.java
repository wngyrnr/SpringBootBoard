package com.example.tester.board.mapper;

import com.example.tester.board.dto.BoardListDto;
import com.example.tester.board.dto.BoardInsertDto;
import com.example.tester.board.dto.BoardUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insert(BoardInsertDto dto);
    List<BoardListDto> findByPage(@Param("offset")int offset,
                                  @Param("size") int size,
                                  @Param("keyword")String keyword,
                                  @Param("searchType")String searchType);
    long countAll(@Param("keyword")String keyword,
                  @Param("searchType")String searchType);
    int update(@PathVariable BoardUpdateDto dto);
    BoardUpdateDto findselect(Long boardId);
    int deleteBoard(Long boardId);

}
