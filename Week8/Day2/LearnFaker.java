package week8.day2;

import com.github.javafaker.Faker;

public class LearnFaker {

	public static void main(String[] args) {
		Faker fake=new Faker();
		String name = fake.company().name();
		System.out.println(name);
		
		String firstName = fake.name().firstName();
		System.out.println(firstName);

	}

}
