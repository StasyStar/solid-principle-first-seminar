package homework.Model.Reportable.impl;

import homework.User;
import homework.Model.Reportable.Reportable;

public class ReportFor implements Reportable {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
