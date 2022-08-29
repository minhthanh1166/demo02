package com.minhthanh;

import org.springframework.util.SocketUtils;
import org.w3c.dom.ls.LSOutput;

public class tamGiac extends point {
	private point DiemA;
	private point DiemB;
	private point DiemC;
	
	
	public tamGiac(point diemA, point diemB, point diemC) {
		super();
		DiemA = diemA;
		DiemB = diemB;
		DiemC = diemC;
	}


	public point getDiemA() {
		return DiemA;
	}


	public void setDiemA(point diemA) {
		DiemA = diemA;
	}


	public point getDiemB() {
		return DiemB;
	}


	public void setDiemB(point diemB) {
		DiemB = diemB;
	}


	public point getDiemC() {
		return DiemC;
	}


	public void setDiemC(point diemC) {
		DiemC = diemC;
	}
	
	public void Draw() {
		System.out.println("Diem A=(" + this.DiemA.getX() + " , " + this.DiemA.getY() + ")");
		System.out.println("Diem B=(" + this.DiemB.getX() + " , " + this.DiemA.getY() + ")");
		System.out.println("Diem C=(" + this.DiemC.getX() + " , " + this.DiemC.getY() + ")");
	} 
	
	
}
