package com.ssm.test;

public class TestLambda {

	/*// 1. 不需要参数,返回值为 5
	() -> 5

	// 2. 接收一个参数(数字类型),返回其2倍的值
	x -> 2 * x

	// 3. 接受2个参数(数字),并返回他们的差值
	(x, y) -> x – y

	// 4. 接收2个int型整数,返回他们的和
	(int x, int y) -> x + y

	// 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
	(String s) -> System.out.print(s)*/
	public static void main(String[] args) {

		TestLambda lambda = new TestLambda();

		// 类型声明
		MathOperation addition = (int a,int b) -> a + b;

		//不用类型声明
		MathOperation subtraction = (a,b) -> a-b;

		//大括号中的返回语句
		MathOperation multiplication = (a,b) ->{
			return a*b;
		} ;

		System.out.println(addition.operation(5, 10));
		System.out.println(lambda.operate(10,5,addition));
		System.out.println(lambda.operate(10, 5, subtraction));
		System.out.println(lambda.operate(10, 5, multiplication));

		GreetingService greetingService =(String message)->System.out.println(message);
		GreetingService greetingService2 = message ->System.out.println(message);
		GreetingService greetingService3 =(message) ->{
			System.out.println(message);
		};

		greetingService.sayMessage("Hello World");
		greetingService2.sayMessage("Hello World");
		greetingService3.sayMessage("Hello World");

		int num = 1;
		int num1 = 2;
		ConVerter<Integer, String> c = (a) ->{
			System.out.println(num+a);
		};

		c.convert(2);

		Comparable<Integer> comparable = (num2) -> Integer.compare(num, num1);

	}

	interface MathOperation{
		int operation(int a, int b);
	}

	interface GreetingService{
		void sayMessage(String message);
	}

	private int operate(int a , int b ,MathOperation mathOperation) {

		return mathOperation.operation(a, b);
	}

	interface ConVerter<T1,T2>{
		void convert(int a);
	}

}
