
package com.stocks.cb.model;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Conversation {

    private String conversationId;
    private Integer type;
    private String conversationToken;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getConversationToken() {
        return conversationToken;
    }

    public void setConversationToken(String conversationToken) {
        this.conversationToken = conversationToken;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("conversationId", conversationId).append("type", type).append("conversationToken", conversationToken).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conversationToken).append(additionalProperties).append(conversationId).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conversation) == false) {
            return false;
        }
        Conversation rhs = ((Conversation) other);
        return new EqualsBuilder().append(conversationToken, rhs.conversationToken).append(additionalProperties, rhs.additionalProperties).append(conversationId, rhs.conversationId).append(type, rhs.type).isEquals();
    }

}
