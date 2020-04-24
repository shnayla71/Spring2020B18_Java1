package day03_VariablesContinue;

public class SalaryCalculator {
/*  rate=55;
    stateTaxRate=0.04;
    federalTaxRate=0.22;
    weeklyHours=40;
    output will be:
    your salary is=105600 usd
    your total tax=27456 usd

 */
    public static void main(String[] args) {
     double hourlyRate = 65;
     double stateTaxRate = 0.04;
     double federalTaxRate = 0.22;
     byte weeklyHours = 45;
     byte totalWeeks = 48;
     // salary= hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks;
        // stateTax = salary * stateTaxRate
        double stateTax =salary * stateTaxRate;
        //federalTax=salary* federalTaxRate
        double federalTax = salary * federalTaxRate;
        //salaryAfterTax = salary -stateTax- federalTax
        double salaryAfterTax =salary -(stateTax+ federalTax);

        System.out.println("Your salary is: $"+ salary);
        System.out.println("State tax is: $"+ stateTax);
        System.out.println("Federal tax is: $"+ federalTax);
        System.out.println("Total tax is: $"+ (federalTax+ stateTax));
        System.out.println("Salary After tax is: $"+ salaryAfterTax);





    }




}
