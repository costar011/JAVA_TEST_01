package service;

import java.util.List;

import Dao.Deptdao;
import model.DeptVO;

public class Deptservice {

	Deptdao dDao = new Deptdao();
	
	public List<DeptVO>select_Dept_service(){
		System.out.println("service접근");
		
		
		List<DeptVO>list = dDao.selet_Dept_dao();
	    return list;
		
		
		
		
	}
	
}
