package shop.mtcoding.mybatisdto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardJoinUserDto2 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user;
    private Timestamp createdAt;

    @Getter
    @Setter
    public static class UserDto { // 내부 클래스로 만들어서 쓰자.
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;
    }
}
