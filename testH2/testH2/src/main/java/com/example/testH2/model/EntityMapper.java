package com.example.testH2.model;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class EntityMapper {

    public MyEntityResponse mapToEntityResponse(MyEntity entity) {
        return MyEntityResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static List<MyEntityResponse> mapAllToEntityResponse(List<MyEntity> all) {
        List<MyEntityResponse> list = new ArrayList<>();
        for (MyEntity entity : all
        ) {
            list.add(mapToEntityResponse(entity));
        }
        return list;
    }
}
