package com.stocks.cb.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Intent {

public String name;
public String displayName;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDisplayName() {
	return displayName;
}
public void setDisplayName(String displayName) {
	this.displayName = displayName;
}


}