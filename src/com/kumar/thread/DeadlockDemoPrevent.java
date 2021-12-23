package com.kumar.thread;

public class DeadlockDemoPrevent {
	/**
	 * Both method are now requesting lock in same order, first Integer and then
	 * String. You could have also done reverse e.g. first String and then Integer,
	 * both will solve the problem, as long as both method are requesting lock in
	 * consistent order.
	 */
	public void method1() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Aquired lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Aquired lock on String.class object");
			}
		}
	}

	public static void main(String[] args) {
		DeadlockDemoPrevent deadlockDemoPrevent1 = new DeadlockDemoPrevent();
		deadlockDemoPrevent1.method1();
		
		DeadlockDemoPrevent deadlockDemoPrevent2 = new DeadlockDemoPrevent();
		deadlockDemoPrevent2.method1();
		deadlockDemoPrevent2.method2();
	}
}
