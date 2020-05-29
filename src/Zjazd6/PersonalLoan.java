/*
Author: Patryk Klimek
Summary: Class PersonalLoan for exercise 6.6
*/
package Zjazd6;

public class PersonalLoan extends Loan {
    public PersonalLoan(int loanID, String customerLastName, double loanAmount, int term, double primeInterestRate) {
        super(loanID, customerLastName, loanAmount, term);
        super.interestRate = primeInterestRate * 1.02;
    }
}
