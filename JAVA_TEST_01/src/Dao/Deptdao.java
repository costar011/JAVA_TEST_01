package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DBconnection;
import model.DeptVO;

public class Deptdao {

	public List<DeptVO> selet_Dept_dao() {
		System.out.println("Dao 접근");
		DBconnection db = new DBconnection();

		String query = "select * from dept";
		ResultSet rs = db.selectQuery(query);

		List<DeptVO> list = new ArrayList<DeptVO>();

		try {
			while (rs.next()) {

				DeptVO vo = new DeptVO();
				vo.setDEPTNO(rs.getNString("DEPTNO"));
				vo.setDNAME(rs.getNString("DNAME"));
				vo.setLOC(rs.getNString("LOC"));

				list.add(vo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

			return list;
		
	}
}
