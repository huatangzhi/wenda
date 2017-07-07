package com.nowcoder.async;

import java.util.List;

/**
 * Created by hp on 2017/7/7.
 */
public interface EventHandler {

    void doHandler(EventModel model);

    List<EventType> getSupportEventTypes();

}
