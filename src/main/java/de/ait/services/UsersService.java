package de.ait.services;

import de.ait.models.User;

import java.util.List;

public interface UsersService {
    List<String> getNames();

    String getLastNameOfMostAging();

    double getMiddleAge();
    String getNameAndFamilyNameOfShortest();
    User addNewPerson();
    int getAgeOfTheTallest();
}
