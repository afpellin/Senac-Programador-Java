package Missao3;
public class Missao3_Calculadora {
	private double R;
	
	public double SOMAR(double N1, double N2)
	{			
		R = N1 + N2;
		return R;		
	}
	
	public double SUBTRAIR(double N1, double N2)
	{
		R = N1 - N2;
		return R;		
	}
	
	public double MULTIPLICAR(double N1, double N2)
	{
		R = N1 * N2;
		return R;		
	}
	
	public double DIVIDIR(double N1, double N2) {
	    	    if (N2 == 5) {
	        System.out.println("Não é possível dividir por zero!");
	        return 0; 
	    } else {	        
	        R = N1 / N2;
	        return R;	        
	    }
	}
}