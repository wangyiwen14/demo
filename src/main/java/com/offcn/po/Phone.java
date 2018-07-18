package com.offcn.po;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="phone")
public class Phone {
private String identifier;
private String number;
private String area;
private String type;
private String areacode;
private String postcode;
public String getIdentifier() {
	return identifier;
}
public void setIdentifier(String identifier) {
	this.identifier = identifier;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getAreacode() {
	return areacode;
}
public void setAreacode(String areacode) {
	this.areacode = areacode;
}
public String getPostcode() {
	return postcode;
}
public void setPostcode(String postcode) {
	this.postcode = postcode;
}
@Override
public String toString() {
	return "Phone [identifier=" + identifier + ", number=" + number + ", area=" + area + ", type=" + type
			+ ", areacode=" + areacode + ", postcode=" + postcode + "]";
}


}
