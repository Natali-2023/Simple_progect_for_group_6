package de.ait.services;

import de.ait.repositories.UsersRepositoryListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersServiceImplTest {
    private UsersServiceImpl usersService;
    @BeforeEach
    void setUp() {
        this.usersService = new UsersServiceImpl(new UsersRepositoryListImpl());
    }


    @DisplayName("Выводим средний возраст всех пользователей")
    @Test
    void getMiddleAgeTest6(){
        double actual = usersService.getMiddleAge();

        assertEquals(29.666666666666668, actual);
    }

    @DisplayName("Выводим возраст самого высокого человека")
    @Test
    void getAgeOfTheTallest_test(){
        assertEquals(29, usersService.getAgeOfTheTallest());
    }

    @DisplayName("Выводим имя и фамилию самого низкого человека")
    @Test
    void getNameAndFamilyNameOfShortest_test(){
        assertEquals("Maxim Ivanov",usersService.getNameAndFamilyNameOfShortest());
    }

}