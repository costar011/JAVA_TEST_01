package controller;

import java.util.List;

import model.DeptVO;
import service.Deptservice;

public class Dpetcontroller {

	public static void main(String[] args) {

		System.out.println("controller 접근");

		Deptservice bb = new Deptservice();

		List<DeptVO> list1 = bb.select_Dept_service();
		System.out.println(list1.size());

		System.out.println(list1.get(2).getDEPTNO());
		System.out.println(list1.get(2).getDNAME());
		System.out.println(list1.get(2).getLOC());

		System.out.println(list1.size());

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getDEPTNO() + "," + list1.get(i).getDNAME());
		}

	}
}
