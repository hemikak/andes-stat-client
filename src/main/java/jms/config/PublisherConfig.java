/*
 * Copyright 2015 Asitha Nanayakkara
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jms.config;

public class PublisherConfig extends PubSubConfig {

    private long messageCount;
    private int parallelPublishers;
    private int publisherMaxThroughput;
    private String messageContent;

    private String queueName;
    
    public PublisherConfig(GlobalConfig globalConfig) {
        super(globalConfig);
    }

    public long getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(long messageCount) {
        this.messageCount = messageCount;
    }

    public int getParallelPublishers() {
        return parallelPublishers;
    }

    public void setParallelPublishers(int parallelPublishers) {
        this.parallelPublishers = parallelPublishers;
    }

    public int getPublisherMaxThroughput() {
        return publisherMaxThroughput;
    }

    public void setPublisherMaxThroughput(int publisherMaxThroughput) {
        this.publisherMaxThroughput = publisherMaxThroughput;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    /**
     * Topics this will be the topic name
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }
}
