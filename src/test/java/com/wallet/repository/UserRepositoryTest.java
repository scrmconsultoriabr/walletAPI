package com.wallet.repository;

import com.wallet.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    private static final String EMAIL = "silviocastro@gmail.com";

    @Autowired
    UserRepository repository;

    @Before
    public void setup() {
        User user = new User();
        user.setName("teste");
        user.setPassword("senha123");
        user.setEmail(EMAIL);

        repository.save(user);
    }

    @After
    public void tearDown() {
        repository.deleteAll();
    }


    @Test
    public void testSave() {
        User user = new User();
        user.setName("Teste");
        user.setPassword("123456");
        user.setEmail("teste@teste.com");

        User response = repository.save(user);

        assertNotNull(response);
    }

    public void testFindByEmail() {

        Optional<User> response = repository.findByEmailEquals(EMAIL);
        assertTrue(response.isPresent());
        assertEquals(response.get().getEmail(), EMAIL);
    }
}
