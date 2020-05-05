package com.muke.sell.DAO.DaoRepository;

import java.util.List;
import java.util.Map;

public interface StudentRs {

    String addStudent(String SId, String Sname, String Sage, String Ssex);

    List<Map<String, Object>> queryAllStudents();

}
