package com.sskmtm.autoreply.monitor;

import com.sskmtm.autoreply.answerer.Answerer;
import com.sskmtm.autoreply.model.TaskListItem;

/**
 * 默认监控者
 */
public class DefaultMonitor extends Monitor {

    public DefaultMonitor(TaskListItem taskListItem) {
        super(taskListItem);
    }

    @Override
    public void onMonitor(Answerer answerer) {
        String mockMessage = "我是一个新的消息";
        System.out.println(answerer.doAnswer(mockMessage));
    }

}
