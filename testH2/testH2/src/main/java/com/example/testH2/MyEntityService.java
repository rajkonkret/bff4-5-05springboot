package com.example.testH2;

import com.example.testH2.model.EntityMapper;
import com.example.testH2.model.MyEntity;
import com.example.testH2.model.MyEntityResponse;
import com.example.testH2.repository.MyEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MyEntityService {

    private final MyEntityRepository myEntityRepository;

    public List<MyEntityResponse> getAll() {
        List<MyEntity> all = myEntityRepository.findAll();
        return EntityMapper.mapAllToEntityResponse(all);
    }
}
