package com.flow.board.web.dto;

import com.flow.board.web.entity.FixedExtension;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class FixedExtensionDto {
    private long id;

    private String name;

    private String use;
    public FixedExtension toEntity(){
        return new FixedExtension(id, name, use);
    }
}
