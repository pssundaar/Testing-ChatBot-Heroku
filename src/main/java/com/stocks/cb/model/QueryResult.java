package com.stocks.cb.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QueryResult {

public String queryText;
public String action;
public Parameters parameters;
public Boolean allRequiredParamsPresent;
public List<FulfillmentMessage> fulfillmentMessages = null;
public Intent intent;
public Integer intentDetectionConfidence;
public String languageCode;
public String getQueryText() {
	return queryText;
}
public void setQueryText(String queryText) {
	this.queryText = queryText;
}
public String getAction() {
	return action;
}
public void setAction(String action) {
	this.action = action;
}
public Parameters getParameters() {
	return parameters;
}
public void setParameters(Parameters parameters) {
	this.parameters = parameters;
}
public Boolean getAllRequiredParamsPresent() {
	return allRequiredParamsPresent;
}
public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
	this.allRequiredParamsPresent = allRequiredParamsPresent;
}
public List<FulfillmentMessage> getFulfillmentMessages() {
	return fulfillmentMessages;
}
public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
	this.fulfillmentMessages = fulfillmentMessages;
}
public Intent getIntent() {
	return intent;
}
public void setIntent(Intent intent) {
	this.intent = intent;
}
public Integer getIntentDetectionConfidence() {
	return intentDetectionConfidence;
}
public void setIntentDetectionConfidence(Integer intentDetectionConfidence) {
	this.intentDetectionConfidence = intentDetectionConfidence;
}
public String getLanguageCode() {
	return languageCode;
}
public void setLanguageCode(String languageCode) {
	this.languageCode = languageCode;
}

}