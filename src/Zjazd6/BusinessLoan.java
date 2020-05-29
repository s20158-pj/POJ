/*
Author: Patryk Klimek
Summary: Class BusinessLoan for exercise 6.6
*/
package Zjazd6;

public class BusinessLoan extends Loan {
    public BusinessLoan(int loanID, String customerLastName, double loanAmount, int term, double primeInterestRate) {
        super(loanID, customerLastName, loanAmount, term);
        super.interestRate = primeInterestRate * 1.01;
    }
}
