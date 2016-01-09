package com.java;

public class StringBuffer {
	private StringBuilder sb;
	private int capacity=16;
	StringBuffer(){
		sb= new StringBuilder();
	}
	public StringBuffer(String input){
		sb= new StringBuilder(input);
	}
	public StringBuffer(int capacity){
		sb= new StringBuilder();
		this.capacity=capacity;
	}
	synchronized public void append(String str){
		sb.append(str);
	}
	public String toString(){
		return sb.toString();
	}
	public void setLength(int length){
		sb.setLength(length);;
	}
	public int capacity(){
		return capacity;
	}
	public synchronized char charAt(int index){
		return sb.toString().charAt(index);
	}
	public synchronized String substring(int startIndex, int endIndex){
		return sb.toString().substring(startIndex, endIndex);
	}
	public synchronized String substring(int endIndex){
		return sb.toString().substring(endIndex);
	}
	public synchronized StringBuffer reverse(){
		sb= sb.reverse();
		return this;
	}
	
}
