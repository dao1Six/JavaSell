package com.muke.sell.DAO.DaoRepository;

import java.util.List;
import java.util.Map;

public interface TeacherRs {
    String addTeacher(String TId, String Tname);

    List<Map<String, Object>> queryAllTeachers();

}
