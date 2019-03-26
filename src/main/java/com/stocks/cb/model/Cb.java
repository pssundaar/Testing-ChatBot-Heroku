package com.stocks.cb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cb {
public String responseId;
public QueryResult queryResult;
public OriginalDetectIntentRequest originalDetectIntentRequest;
public String session;
public String getResponseId() {
	return responseId;
}
public void setResponseId(String responseId) {
	this.responseId = responseId;
}
public QueryResult getQueryResult() {
	return queryResult;
}
public void setQueryResult(QueryResult queryResult) {
	this.queryResult = queryResult;
}
public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
	return originalDetectIntentRequest;
}
public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
	this.originalDetectIntentRequest = originalDetectIntentRequest;
}
public String getSession() {
	return session;
}
public void setSession(String session) {
	this.session = session;
}
@Override
public String toString() {
	return "Cb [responseId=" + responseId + ", queryResult=" + queryResult + ", originalDetectIntentRequest="
			+ originalDetectIntentRequest + ", session=" + session + "]";
}



}