package com.stocks.cb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FulfillmentMessage {

@SerializedName("text")
public Text text;

public Text getText() {
	return text;
}

public void setText(Text text) {
	this.text = text;
}


}