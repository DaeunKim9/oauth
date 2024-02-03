package com.people.findclothes.repository;

import com.people.findclothes.domain.User;
import com.people.findclothes.domain.constant.UserStatus;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void insertTest() {
        User user = User.builder()
                .id("userId")
                .password("1234")
                .email("email@google.com")
                .nickname("nickname")
                .name("신짱구")
                .userStatus(UserStatus.BASIC)
                .build();

        userRepository.save(user);
    }

}
