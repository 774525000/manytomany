package com.company;

import com.bean.Role;
import com.bean.User;
import com.utils.HUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {
        Session session = HUtils.session();
        Transaction ts = session.beginTransaction();

        User user = session.get(User.class, 1L);
        Role role1 = session.get(Role.class, 1L);
        Role role2 = session.get(Role.class, 2L);

        user.getRole().remove(role1);
        user.getRole().add(role2);

        session.save(user);

        ts.commit();
        session.close();
    }
}
