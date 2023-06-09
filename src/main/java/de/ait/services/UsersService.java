package de.ait.services;

import java.util.List;

public interface UsersService {
    List<String> getNames();

    String getLastNameOfMostAging();

    double getMiddleAge();
    String getNameAndFamilyNameOfShortest();

    int getAgeOfTheTallest();

   void createUser(String name,String familyName,int ageUser,double height);
}
