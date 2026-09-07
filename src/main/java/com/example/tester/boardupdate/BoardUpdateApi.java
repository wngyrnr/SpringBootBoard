package com.example.tester.boardupdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/board")
public class BoardUpdateApi {

    @Autowired
    private BoardUpateMapper boardupatemapper;



    @GetMapping("/{boardId}")
    @ResponseBody
    public BoardUpdateDto detailBoard(@PathVariable Long boardId) {
        return boardupatemapper.findselect(boardId);
    }

    @PostMapping("/edit/{boardId}")
    Long editBoard(@RequestBody BoardUpdateDto boardupdatedto){
        boardupatemapper.update(boardupdatedto);
        return boardupdatedto.getBoardId();
    }



}

    @Getter
    @Setter
    @AllArgsConstructor
    class BoardUpdateDto{
        private Long boardId;
        private String category;
        private String title;
        private String content;
        private String Writer;
    }


    @Mapper
    interface BoardUpateMapper{
        int update(BoardUpdateDto dto);
        BoardUpdateDto findselect(Long boardId);
    }




// 게시글 수정
// update
// board/boardid/ select
// boardid/ select 된 게시판 (boardid,writer, category, title, content)가져옴
// 해당 내용 수정
// update요청
// 게시글 업데이트 (update_at수정)