package com.study.springstudy.springmvc.chap05.entity;

import lombok.*;
/*
    CREATE TABLE tbl_reply_reaction (
    reply_reaction_id INT(8) PRIMARY KEY AUTO_INCREMENT,
    board_no INT(8) NOT NULL,
    account VARCHAR(50) NOT NULL,
    reply_reaction_type ENUM('RELIKE') NOT NULL,
    reply_reaction_date DATETIME DEFAULT current_timestamp
);
 */

@Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ReplyReaction {

    private String replyReactionId;
    private String boardNo;
}
