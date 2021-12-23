package com.kumar.exception;

public class ReturnStatementInTryCatchAndFinally {

	public String getInfo() {
		try {
			int result = 10 / 0;

		} catch (Exception e) {
			return "error";
		} finally {
			return "failure";
		}
	}

	public static void main(String[] args) {
		ReturnStatementInTryCatchAndFinally tryCatchAndFinally = new ReturnStatementInTryCatchAndFinally();
		System.out.println(tryCatchAndFinally.getInfo());
	}
}
