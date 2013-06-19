package com.kozlowski.geektic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Interet {

	 @Id
	 @SequenceGenerator(name = "generateurDeInteret", sequenceName = "INTERNET_SEQ", allocationSize = 1)
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generateurDeInteret")
	 @Column(name = "ID_INTERET")
	 private int id;
	 private boolean python;
	 private boolean php;
	 private boolean javascript;
	 private boolean javal;
	 private boolean cplusplus;
	 private boolean dotnet;
	 
	 
	 @ManyToMany
	 @JoinColumn(name = "id_geek", nullable = false)
	 @JoinTable (
				name = "INTERET_GEEK",
				joinColumns = @JoinColumn(name = "ID_INTERET"),
				inverseJoinColumns = @JoinColumn(name = "ID_GEEK")
				)
	 
	 private List<Geek> geek;
	 
	 public Interet (){	
	 }
	 
	 public Interet(boolean python, boolean php, boolean javascript, boolean javal, boolean cplusplus, boolean dotnet){
		 super();
		 this.python=python;
		 this.php=php;
		 this.javascript = javascript;
		 this.javal = javal;
		 this.cplusplus = cplusplus;
		 this.dotnet = dotnet;
	 }
	 
	 public int getId(){
		 return this.id;
	 }
	 
	 public void setId(int id){
		 this.id = id;
	 }
	 
	 public boolean getPython(){
		 return python;
	 }
	 
	 public void setPython(boolean python){
		 this.python = python;
	 }
	 
	 public boolean getPhp(){
		 return php;
	 }
	 
	 public void setPhp(boolean php){
		 this.php = php;
	 }
	 
	 public boolean getJavascript(){
		 return javascript;
	 }
	 
	 public void setJavascript(boolean javascript){
		 this.javascript = javascript;
	 }
	 
	 public boolean getJaval(){
		 return javal;
	 }
	 
	 public void setJaval(boolean javal){
		 this.javal = javal;
	 }
	 
	 public boolean getCPlusPlus(){
		 return cplusplus;
	 }
	 
	 public void setCPlusPlus(boolean cplusplus){
		 this.cplusplus = cplusplus;
	 }
	 
	 public boolean getDotNet(){
		 return dotnet;
	 }
	 
	 public void setDotNet(boolean dotnet){
		 this.dotnet = dotnet;
	 }
}
