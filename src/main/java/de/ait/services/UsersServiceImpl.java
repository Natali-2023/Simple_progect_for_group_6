package de.ait.services;

import de.ait.models.User;
import de.ait.repositories.UsersRepository;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.*;

public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<String> getNames() {
        List<User> users = usersRepository.findAll();
        List<String> names = new ArrayList<>();

        for (User user : users) {
            names.add(user.getFirstName());
        }
        return names;
    }

    @Override
    public String getLastNameOfMostAging() {
        List<User> users = usersRepository.findAll();
        Map<Integer, String> userAge = new HashMap<>();

        for (User user : users) {
            userAge.put(user.getAge(), user.getLastName());
        }

        int maxAge = Collections.max(userAge.keySet());
        return userAge.get(maxAge);
    }

    @Override
    public double getMiddleAge() {
        List<User> users = usersRepository.findAll();

        double sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }

    @Override
    public String getNameAndFamilyNameOfShortest() {
        List<User> users = usersRepository.findAll();
        Map<Double, String> userHeightLastName = new HashMap<>();
        Map<Double, String> userHeightFamilyName = new HashMap<>();

        for (User user : users) {
            userHeightLastName.put(user.getHeight(), user.getLastName());
            userHeightFamilyName.put(user.getHeight(), user.getFirstName());
        }

        Double minHeight = Collections.min(userHeightLastName.keySet());
        Double minHeight1 = Collections.min(userHeightFamilyName.keySet());

        return "" + userHeightFamilyName.get(minHeight) + " " + userHeightLastName.get(minHeight1);

    }

    @Override
    public String addNewPerson() {


        return "";
    }

    @Override
    public int getAgeOfTheTallest() {
        List<User> users = usersRepository.findAll();
        Map<Double, Integer> userHeight = new HashMap<>();

        for (User user : users) {
            userHeight.put(user.getHeight(), user.getAge());
        }

        double maxHeight = Collections.max(userHeight.keySet());
        return userHeight.get(maxHeight);
    }

//
}
