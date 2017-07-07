package com.nowcoder.model;

import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;


/**
 * Created by hp on 2017/5/12.
 */

@Component
public class HostHolder {

    private static ThreadLocal<User> users = new ThreadLocal<User>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }
}
