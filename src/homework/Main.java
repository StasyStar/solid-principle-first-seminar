package homework;

import homework.Model.Persisterable.Persisterable;
import homework.Model.Persisterable.impl.Persister;
import homework.Model.Reportable.impl.ReportFor;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persisterable persister = new Persister();
        ReportFor reportfor = new ReportFor();
        persister.save(user);
        reportfor.report(user);
    }
}