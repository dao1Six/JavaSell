package com.muke.sell.DAO.DaoRepository;

import java.util.List;
import java.util.Map;

public interface CourseRs {
    String addCourse(String CId, String Cname,String TId);

    List<Map<String, Object>> queryAllCourses();
}
