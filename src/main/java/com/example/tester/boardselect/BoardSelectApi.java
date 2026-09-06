package com.example.tester.boardselect;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;



@Controller
@RestController
@RequestMapping("/board")
public class BoardSelectApi {

    @Autowired
    private BoardListMapper boardlistmapper;


    @GetMapping("/list")
    public List<BoardListDto> boardSelect() {
        List<BoardListDto> boardlist = boardlistmapper.findAll();
        return boardlist;
    }
}
    @Getter
    @AllArgsConstructor
    class BoardListDto{
        private String category;
        private String title;
        private String writer;
        private LocalDateTime createAt;
    }

@Mapper
interface BoardListMapper{
    List<BoardListDto> findAll();
}

/*
    퀘이사존 질문/토론
    게시글 전체 목록 조회
    select
    입력은 /board
    category , title, writer, create_at
    기준은 create_at순으로 정렬
    board_id는 안보여줘
    category별 목록 분리
    페이징처리 10페이지 페이징은 10개씩
    검색처리
    검색은 title,title + content, writer


 */