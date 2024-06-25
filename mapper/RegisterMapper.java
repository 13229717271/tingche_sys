package com.lab.thelab.mapper;


import com.lab.thelab.entity.Register;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RegisterMapper {
    //注册
    public void addRegister(Register register);
    Register findStudent(String username,String password);
    List<Register> queryRegisterList();
    public void  updateRegister(Register register);
    public void  deleteRegister(String stuno);
    Register queryRegisterByStuno(String stuno);
}
