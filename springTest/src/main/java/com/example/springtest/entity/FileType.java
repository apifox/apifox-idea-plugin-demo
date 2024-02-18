package com.example.springtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileType {


    private Long id;

    /**
     * @fileType java.lang.String
     */
    private Long idDoc;

    @com.example.springtest.anno.FileType("java.lang.String")
    private Long idAnno;



}
