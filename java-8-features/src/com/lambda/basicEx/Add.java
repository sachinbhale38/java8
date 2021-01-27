package com.lambda.basicEx;

public class Add {
	public static void main(String[] args) {
		
		
		Addable withLambdaD = (int a,int b) ->{ return (a+b); } ;
		
        System.out.println(withLambdaD.add(100,200));  
	}

}
