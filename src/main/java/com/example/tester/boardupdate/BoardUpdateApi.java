package com.example.tester.boardupdate;

import lombok.Getter;
import lombok.Setter;

public class BoardUpdateApi {



}







    @Getter
    @Setter
    class BoardUpdateDto{
        private Long boardId;
        private String category;
        private String title;
        private String content;
        private String Writer;
    }

    interface BoardUpateMapper{
        int insert
    }


// 게시글 수정
// update
// board/boardid/ select
// boardid/ select 된 게시판 (boardid,writer, category, title, content)가져옴
// 해당 내용 수정
// update요청
// 게시글 업데이트 (update_at수정)