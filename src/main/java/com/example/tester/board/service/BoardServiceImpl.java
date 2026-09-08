package com.example.tester.board.service;

import com.example.tester.board.dto.BoardInsertDto;
import com.example.tester.board.dto.BoardListDto;
import com.example.tester.board.dto.BoardListResponseDto;
import com.example.tester.board.dto.BoardUpdateDto;
import com.example.tester.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardmapper;


    @Override
    public Long insertBoard(BoardInsertDto boardInsertDto){
        boardmapper.insert(boardInsertDto);
        return boardInsertDto.getBoardId();
    }

    @Override
    public BoardListResponseDto boardList(int page, int size , String keyword, String searchtype) {
        int offset = (page -1) * size;

        List<BoardListDto> content = boardmapper.findByPage(offset,size,keyword,searchtype);
        long totalElements = boardmapper.countAll(keyword,searchtype);
        int totalPage = (int) Math.ceil((double) totalElements / size);

        return new BoardListResponseDto(content,totalElements,totalPage,page);
    }

    @Override
    public Long deleteBoard(Long boardId) {
        boardmapper.deleteBoard(boardId);
        return boardId;
    }
    @Override
    public BoardUpdateDto getBoard(@PathVariable Long boardId) {
        return boardmapper.findselect(boardId);
    }

    @Override
    public Long updateBoard(@RequestBody BoardUpdateDto boardupdatedto){
        boardmapper.update(boardupdatedto);
        return boardupdatedto.getBoardId();
    }
}
