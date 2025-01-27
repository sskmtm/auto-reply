package com.sskmtm.autoreply.api.openai.model;

import lombok.Data;

import java.util.List;

/**
 * 创建补全响应
 * <a href="https://platform.openai.com/docs/api-reference/completions/create">参考文档</a>
 */
@Data
public class CreateCompletionResponse {

    private Integer created;

    private Usage usage;

    private String model;

    private String id;

    /**
     * 回答列表
     */
    private List<ChoicesItem> choices;

    private String object;

    @Data
    public static class ChoicesItem {

        private String finishReason;

        private Integer index;

        private String text;

        private Integer logprobs;
    }

    @Data
    public static class Usage {

        private Integer completionTokens;

        private Integer promptTokens;

        private Integer totalTokens;
    }
}
