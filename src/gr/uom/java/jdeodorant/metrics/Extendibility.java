package gr.uom.java.jdeodorant.metrics;

import gr.uom.java.ast.SystemObject;

public class Extendibility {
	public static double ExtendibilityMetric(SystemObject system) {
		String sk;
		
		double coupling   = ImplementationOfMetrics.couplingMetric(system);
		double abstraction   = ImplementationOfMetrics.calculateAbstraction(system);
		double polymorphism  = ImplementationOfMetrics.calculatePolymorphism(system);
		double inheritance = ImplementationOfMetrics.messagingMetric(system);// need to change to DIT
		
		double ExtendibilityValue=0.5*abstraction -0.5*coupling +0.5*inheritance +  0.5*polymorphism;
		
		System.out.println("coupling: " + coupling + " " + "abstraction: " + abstraction + " " + "inheritance: " + inheritance + " " + "polymorphism: " + polymorphism);
		System.out.println("Reusability is : " + ExtendibilityValue);
			  
		sk="The Reusability Design property for the system is : "+ ExtendibilityValue;
		WritingtheValues.WritingtheSyatemvalues(sk);
		
		return  ExtendibilityValue;
	}

	

}
