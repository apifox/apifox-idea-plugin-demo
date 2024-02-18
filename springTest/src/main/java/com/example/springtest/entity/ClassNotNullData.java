package com.example.springtest.entity;

import com.example.springtest.anno.ClassNotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ClassNotNull
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassNotNullData {

    private String nameClassNotNullData;
    private String ageClassNotNullData;
    private String addressClassNotNullData;

}
