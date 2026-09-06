package com.example.tester.boardinsert;


import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/board")
    public class BoardInsertApi {

        @Autowired
        private BoardInsertMapper boardinsertmapper;



        @PostMapping("/write")
        public Long insertBoard(@RequestBody BoardInsertDto boardInsertDto) {
            boardinsertmapper.insert(boardInsertDto);
            return boardInsertDto.getBoardId();
        }
    }

    @Getter
    @Setter
    class BoardInsertDto {
        private Long boardId;
        private String category;
        private String title;
        private String content;
        private String Writer;
    }

    @Mapper
    interface BoardInsertMapper{
        int insert(BoardInsertDto dto);

    }





    //Dto에 boardid,datetime 넣으면 안됨
    //요청 Dto에서는 필요없는 값




    //게시판은 뭘까 ??
    // 글작성, 글조회, 글수정, 글삭제

    // 글작성
    // insert

    // 데이터 인입 (작성자, 작성글, 작성시간, ...) : DB  --> DB스키마 작성 및 생성
    // 데이터가 들어옴 그 다음 작업  <-- 이거 화면없는데 api나 main static으로 테스트 하는방법... DB 스키마는 내가 이렇게 짰어.

    // 중복검사 ?? <-- // 데이터가 들어왔는데 중복검사는 id, tilte,... 찾아봐, 기존에 어떻게 하는지? ai 한테 ...
    // 중복검사 패스 -> dto에 맞게끔 내용 인입
    // db에 insert
    // 결과값 0,1 -> boolean으로 넘겨주던, 화면서 0,1 확인해서 결과처리


    // 글조회
    // select
    // db에 게시글 select
    // 한번에 10개씩 끊어서
    // 10개씩 가져오는법
    //가져오는 기준은 date
    //순서는 date
    // 10개 넘어가면 페이징
    // 페이지네이션도 10개를 기준
    // title, date, writer,

    // 글 수정
    // update
    // 게시글 하나 select
    // 정보 불러오기 get
    // 기존 board_id 데이터 보여줌
    // 수정 후 update
    // 수정된 해당 게시판으로 이동




    // 글 삭제
    // delete

    // 게시글 상세 이동
    // select 게시글
    // 삭제 delete
    // 해당 게시글 delete
    //게시글 hard delete
