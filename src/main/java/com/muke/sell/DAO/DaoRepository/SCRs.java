package com.muke.sell.DAO.DaoRepository;

import java.util.List;
import java.util.Map;

public interface SCRs {

    String addSC(String SId, String CId,String score );

    List<Map<String, Object>> queryAllSCs();
}
