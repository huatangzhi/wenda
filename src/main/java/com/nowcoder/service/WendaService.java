package com.nowcoder.service;


import org.springframework.stereotype.Service;

/**
 * Created by hp on 2017/5/2.
 */
@Service
public class WendaService {
    public String getMessage(int userId) {
        return "Hello Message:" + String.valueOf(userId);
    }
}
