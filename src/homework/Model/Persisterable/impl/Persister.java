package homework.Model.Persisterable.impl;

import homework.User;
import homework.Model.Persisterable.Persisterable;

public class Persister implements Persisterable{
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
