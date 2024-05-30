package com.study.springstudy.springmvc.chap05.dto.request;

import com.study.springstudy.springmvc.chap05.entity.Member;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class SignUpDto {

    @NotBlank
    @Size(min = 4,max = 14)
    private String account;

    @NotBlank
    private String password;

    @NotBlank
    @Size(min = 2,max = 6)
    private String name;

    @NotBlank
    @Email
    private String email;


    public Member toEntity() {

        return Member.builder()
                .account(this.account)
                .email(this.email)
                .password(this.password)
                .name(this.name)
                .build();
    }
}
