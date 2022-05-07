package com.fc.service.impl;

import com.fc.bean.Rank;
import com.fc.bean.Resultss;
import com.fc.mapper.ResultMapper;
import com.fc.mapper.StudentMapper;
import com.fc.service.ResultssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ResultssServiceImpl  implements ResultssService {

    @Autowired
    private ResultMapper resultMapper;

    @Override
    public List<Resultss> getAllResult() {
        return resultMapper.selectAllResult();
    }

    @Override
    public List<Resultss> selectByStuId(String stuId) {
        return resultMapper.selectResultByStuId(stuId);
    }

    @Override
    public List<Resultss> selectByStuIdAndResTerm(String loginUser, String resTerm) {
        return null;
    }

    @Override
    public Resultss selectResultByResId(int resId) {
        return null;
    }

    @Override
    public int addResult(Resultss resultss) {
        return resultMapper.insertResult(resultss);
    }

    @Override
    public Resultss selectResultByStuIdAndSubName(String stuId, String subName) {
        return null;
    }
}
