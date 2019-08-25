package com.example.demo.entity;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
public class UserEntity {

	@Id
	@GeneratedValue
	int uid;
	@JsonIgnore
	private String at_hash;
	
	
	@JsonIgnore
	private String aud;
	@JsonIgnore
	private String azp;
	
	@Column(name="uemail")
	public String email;
	@Column(name="is_verified")
	private boolean email_verified;
	@JsonIgnore
	private long exp;
	@JsonIgnore
	private String family_name;
	@JsonIgnore
	private String given_name;
	@JsonIgnore
	private long iat;
    @Column(name="iss")
	private String iss;
	
	@JsonIgnore
	private String jti;
	@JsonIgnore
	private String locale;
	
	@Column(name="uname")
	private String name;
	@Column(name="image_url")
	private String picture;
	@Column(name="googleId")
	private String sub;
	
	

	
   @OneToMany(mappedBy="ue")
    Set<UserResponseEntity> ur;




public int getUid() {
	return uid;
}




public void setUid(int uid) {
	this.uid = uid;
}




public String getAt_hash() {
	return at_hash;
}




public void setAt_hash(String at_hash) {
	this.at_hash = at_hash;
}




public String getAud() {
	return aud;
}




public void setAud(String aud) {
	this.aud = aud;
}




public String getAzp() {
	return azp;
}




public void setAzp(String azp) {
	this.azp = azp;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public boolean isEmail_verified() {
	return email_verified;
}




public void setEmail_verified(boolean email_verified) {
	this.email_verified = email_verified;
}




public long getExp() {
	return exp;
}




public void setExp(long exp) {
	this.exp = exp;
}




public String getFamily_name() {
	return family_name;
}




public void setFamily_name(String family_name) {
	this.family_name = family_name;
}




public String getGiven_name() {
	return given_name;
}




public void setGiven_name(String given_name) {
	this.given_name = given_name;
}




public long getIat() {
	return iat;
}




public void setIat(long iat) {
	this.iat = iat;
}




public String getIss() {
	return iss;
}




public void setIss(String iss) {
	this.iss = iss;
}




public String getJti() {
	return jti;
}




public void setJti(String jti) {
	this.jti = jti;
}




public String getLocale() {
	return locale;
}




public void setLocale(String locale) {
	this.locale = locale;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public String getPicture() {
	return picture;
}




public void setPicture(String picture) {
	this.picture = picture;
}




public String getSub() {
	return sub;
}




public void setSub(String sub) {
	this.sub = sub;
}




public Set<UserResponseEntity> getUr() {
	return ur;
}




public void setUr(Set<UserResponseEntity> ur) {
	this.ur = ur;
}
   
   
   
   
   
   
   
   
   
 
	


}
   
 
	
