package com.sskmtm.autoreply.factory;

import com.sskmtm.autoreply.answerer.DefaultAnswerer;
import com.sskmtm.autoreply.answerer.OpenAiAnswerer;
import com.sskmtm.autoreply.answerer.Answerer;

/**
 * 回答者工厂
 */
public class AnswererFactory {

    /**
     * 创建回答者
     *
     * @param answerer
     * @return
     */
    public static Answerer createAnswerer(String answerer) {
        switch (answerer) {
            case "openai":
                return new OpenAiAnswerer();
            default:
                return new DefaultAnswerer();
        }
    }
}
