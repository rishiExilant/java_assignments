package com.exilant.assignment.Quiz;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Quiz {
	String questions, options, answer, enter;
	char ch;
	int i, correct = 0;
	Quiz[] quiz = new Quiz[5];
	int count = 0;

	public void quizStart() {
		for (i = 0; i < 5; i++) {
			quiz[i] = new Quiz();
		}

	}


	public void quizQuestions() {
		try {
			quiz[0].questions = "Which is a reserved word in the Java programming language?";
			quiz[1].questions = "Which is a valid keyword in java?";
			quiz[2].questions = "Which one is a valid declaration of a boolean?";
			quiz[3].questions = "What is the name of the method used to start a thread execution?";
			quiz[4].questions = "Which two are valid constructors for Thread?";

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.err.println("Error Occur!\n" + e.getMessage());
			System.exit(0);
		}
	}


	public void quizOptions() {
		try {
			quiz[0].options = " A.method \n B.native\n C.subclasses\n D.reference";
			quiz[1].options = " A.interface\n B.string \n C.Float\n D.unsigned";
			quiz[2].options = " A.boolean b1 = 0; \n B.boolean b2 = 'false'; \n C.boolean b3 = false;\n D.boolean b4 = Boolean.false();";
			quiz[3].options = " A.init();; \n B.start();; \n C.run();\n D.resume()";
			quiz[4].options = " A.Thread(Runnable r, String name) \n B.Thread(Runnable r, int priority) \n C.Thread(int priority)\n D.Thread(Runnable r, ThreadGroup g)";

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error Occur!\n" + e.getMessage());
			System.exit(0);
		}
	}

	public void quizAnswers() {
		quiz[0].answer = "B";
		quiz[1].answer = "A";
		quiz[2].answer = "C";
		quiz[3].answer = "B";
		quiz[4].answer = "A";

	}

	public void quiz() {
		try {
			Scanner sc = new Scanner(System.in);
			String temp = "";

			for (i = 0; i < 5; i++) {
				System.out.println("--------------------------------------------------------------------");
				System.out.println("Question " + (i + 1) + ": " + quiz[i].questions + "\n" + quiz[i].options);
				System.out.printf("Enter Your Answer:" + "\n");

				temp = sc.next();
				ch = temp.charAt(0);
				temp = Character.toString(ch);

				if (temp.equalsIgnoreCase(quiz[i].answer)) {
					System.out.println("--------------------------------------------------------------------");
					System.out.println("Question " + (i + 1));
					System.out.println("Entered Answer is CORRECT");
					correct++;
					System.out.println("--------------------------------------------------------------------");

				} else {
					System.out.println("--------------------------------------------------------------------");
					System.out.println("Question " + (i + 1));
					System.out.println("Entered Answer is INCORRECT");
					System.out.println("Correct Answer is: " + quiz[i].answer);
					System.out.println("--------------------------------------------------------------------");
				}

			}
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error Occur3c!\n" + e.getMessage());
			System.exit(0);
		} catch (InputMismatchException e) {
			System.err.println("Error Occur1!\n" + e.getMessage());
			System.exit(0);
		}
	}


	public void finalAssessments() {

		System.out.println("--------------------------------------------------------------------");
		System.out.println("------------------ Final Assessment is:- -----------------------");
		System.out.println(
				"You answered 5 questions out of which \n" + correct + " Correct and \n" + (5 - correct) + " Incorrect!");
		System.out.println("--------------------------------------------------------------------");

	}


	public static void main(String[] args) {

		Quiz Object = new Quiz();
		Object.quizStart();
		Object.quizQuestions();
		Object.quizOptions();
		Object.quizAnswers();
		Object.quiz();
		Object.finalAssessments();
	}
}