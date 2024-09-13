package com.example.springtest.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonViewEntity {

    private String all;

    @JsonView()
    private String allAnno;

    @JsonView(Create.class)
    private String create;

    @JsonView(Update.class)
    private String update;

    @JsonView(Delete.class)
    private String delete;

    @JsonView({Update.class, Create.class})
    private String updateOrCreate;

}

