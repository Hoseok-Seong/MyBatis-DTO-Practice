package shop.mtcoding.mybatisdto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardJoinUserDtoV2 {
    private BoardDto board;
    private UserDto user;
}
