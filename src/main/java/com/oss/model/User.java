package com.oss.model;


import com.oss.model.enums.Lang;
import com.oss.model.enums.Role;
import com.oss.model.enums.UserState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private Long chatId;
    private String username;
    private String fio;
    private String phoneNumber;
    private Role role;
    private Lang lang;
    private UserState userState;
}
