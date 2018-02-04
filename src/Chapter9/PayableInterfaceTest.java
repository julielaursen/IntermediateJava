package Chapter9;

public class PayableInterfaceTest {
	
	public static void main(String[] args)
	{
	Payable[] payableObjects = new Payable[6];
	
	payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
	payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
	payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
	payableObjects[3] = new HourlyEmployees("Karen", "Price", "222-22-2222", 16.75, 40);
	payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
	payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
	
	System.out.println("Invoices and Employees procssed polymorphically:");
	
	for (Payable currentPayable: payableObjects)
	{
		System.out.println(currentPayable.toString());
		
		if (currentPayable instanceof BasePlusCommissionEmployee)
		{
			BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
			employee.setBaseSalary(1.10 * employee.getBaseSalary());
			
			currentPayable = employee;
			//System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
		}
		System.out.printf("%s: $%,.2f%n%n", "payment due", currentPayable.getPaymentAmount());
			
		
		//System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
	}
}
}
