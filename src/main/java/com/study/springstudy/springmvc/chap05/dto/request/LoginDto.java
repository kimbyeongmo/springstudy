package com.study.springstudy.springmvc.chap05.dto.request;

import lombok.*;
import org.checkerframework.checker.units.qual.A;

@Setter @Getter @ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class LoginDto {

    private String account;
    private String password;
    private boolean autoLogin; // 자동로그인 체크 여부


}
