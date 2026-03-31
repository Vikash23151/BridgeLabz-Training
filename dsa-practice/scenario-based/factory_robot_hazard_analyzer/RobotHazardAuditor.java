package factory_robot_hazard_analyzer;

import java.util.Scanner;

public class RobotHazardAuditor {
	
	void ValidateArmPrecision(double armPrecision) throws RobotSafetyException {
		if(!(armPrecision>=0.0 && armPrecision<=1.0)) {
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}	
	}
	
	void ValidateWorkerDensity(int workerDensity) throws RobotSafetyException  {
		if(!(workerDensity>=1 && workerDensity<=20)) {
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}	
	}
	
	void ValidateMachineryState(String machineryState) throws RobotSafetyException {
		if(!(machineryState.equals("Worn")||machineryState.equals("Faulty")||machineryState.equals("Critical"))) {
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
	}
	
	public double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		ValidateArmPrecision(armPrecision);
		ValidateWorkerDensity(workerDensity);
		ValidateMachineryState(machineryState);
		
		double riskFactor=0;
		switch(machineryState) {
			case "Worn":
				riskFactor=1.3;
				break;
			case "Faulty":
				riskFactor=2.0;
				break;
			case "Critical":
				riskFactor=3.0;
				break;
		}
		double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * riskFactor);
		return hazardRisk;	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		RobotHazardAuditor rha=new RobotHazardAuditor();
		System.out.println("Enter Arm Precision (0.0 - 1.0):");
		double armPrecision=sc.nextDouble();
		System.out.println("Enter Worker Density (1 - 20):");
		int workDensity=sc.nextInt();
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState=sc.next();
		sc.close();
		try {
			System.out.println("Robot Hazard Risk Score: "+rha.calculateHazardRisk(armPrecision, workDensity, machineryState));
		}catch(RobotSafetyException e) {
			System.out.println(e.getMessage());
		}	
	}
}
