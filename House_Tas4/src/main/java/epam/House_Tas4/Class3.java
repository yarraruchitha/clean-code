package epam.House_Tas4;

public class Class3 {
	Double intrestcalculation(Double amount,Double rate,Double duration,Double increment)
	{
		Double ci=amount*Math.pow(1+rate/increment,increment*duration);
		return ci-amount;
	}
}
