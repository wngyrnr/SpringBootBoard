package com.example.tester.boardupdate.service;


import com.example.tester.boardupdate.dto.BoardUpdateDto;
import com.example.tester.boardupdate.mapper.BoardUpateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardUpateMapper boardupatemapper;

    @Override
    public BoardUpdateDto getBoard(@PathVariable Long boardId) {
        return boardupatemapper.findselect(boardId);
    }
    @Override
    public Long updateBoard(@RequestBody BoardUpdateDto boardupdatedto){
        boardupatemapper.update(boardupdatedto);
        return boardupdatedto.getBoardId();
    }
}
