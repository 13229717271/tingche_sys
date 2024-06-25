package com.lab.thelab.mapper;

import com.lab.thelab.entity.Myuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MyuserMapper {
//    Myuser queryUserByRole(Myuser myuser);

    Myuser findUser(String username,String password);
   // List<Myuser> findUser();
}
