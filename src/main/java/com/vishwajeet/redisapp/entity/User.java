package com.vishwajeet.redisapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private String id;
    private String name;
}
