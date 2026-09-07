package com.example.tester.boardselect.controller;

import com.example.tester.boardselect.dto.BoardListDto;
import com.example.tester.boardselect.service.BoardSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/board")
public class BoardSelectController {

    @Autowired
    private BoardSelectService boardselectservice;

    @GetMapping("/list")
    public List<BoardListDto> list(){
        return boardselectservice.boardSelect();
    }
}
