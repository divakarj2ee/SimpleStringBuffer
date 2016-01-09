package com.java;

public class MyStringBuffer {
	private String input="";
	private int capacity=16;
	MyStringBuffer(String input){
		this.input=input;
	}
	MyStringBuffer(){
		
	}
	synchronized public void append(String str){
		input = input.concat(str);
	}
	
	public void setLength(int length){
		input= input.substring(0,length);
	}
	
	public String toString(){
		return input;
	}
	
	public int capacity(){
		return capacity;
	}
}
