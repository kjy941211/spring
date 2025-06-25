package org.scoula.security.account.domain;

import org.springframework.security.core.userdetails.User;

public class CustomUser extends User {
    // Security 내에서 회원정보를 담을 객체는 User객체임
    // 우리의 회원정보는 MemberVo에 있음
    // MemverVO --> User 객체에 매핑시켜주어야함

    private final MemberVO memberVO;

    // 생성자 2개를 만들어줌
    public CustomUser(MemberVO memberVO) {
        super(memberVO.getUsername(), memberVO.getPassword(), memberVO.getAuthList());
        this.memberVO = memberVO;
    }

}
