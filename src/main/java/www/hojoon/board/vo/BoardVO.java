package www.hojoon.board.vo;

import lombok.Data;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

@Data

public class BoardVO {
    private long boardIdx;
    private String writer;
    private String boardTitle;
    private String boardContent;
    private String hit;
    private Date writeDate;
    private Date modifyDate;
    private String fileSaveName;
    private String fileOriginalName;
    private MultipartFile file;
}
