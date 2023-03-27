package com.sskmtm.autoreply.answerer;

/**
 * 默认回答者（降级）
 */
public class DefaultAnswerer implements Answerer {

    @Override
    public String doAnswer(String prompt) {
        return "抱歉，我不理解您的问题：" + prompt;
    }
}
