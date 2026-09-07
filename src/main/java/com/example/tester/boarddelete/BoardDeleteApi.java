package com.example.tester.boarddelete;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("board/delete")
public class BoardDeleteApi {

    @Autowired
    private BoardDeleteMapper boarddeletemapper;


    @DeleteMapping("/{boardId}")
    public long deleteBoard(Long boardId) {
        boarddeletemapper.deleteBoard(boardId);
        return boardId;
    }


}
    @Mapper
    interface BoardDeleteMapper{
        Long deleteBoard(Long boardId);
    }



    // 글 삭제
    // delete

    // boardid 삭제 delete
    // 해당 게시글 delete
    // 게시글 hard delete
    //

