package www.hojoon.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import www.hojoon.board.vo.BoardVO;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }


    @RequestMapping("/boardWrite")
    public String boardWrite(Model model){
        BoardVO boardVO = new BoardVO();
        model.addAttribute(boardVO);
        return "boardWrite";
    }

    @RequestMapping("/boardWritePost")
    public String boardWRitePost(@ModelAttribute("boardVO")BoardVO boardVO){
        System.out.println(boardVO);
        return null;
    }

}
