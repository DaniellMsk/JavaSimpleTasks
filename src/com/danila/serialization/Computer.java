package com.danila.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer implements Serializable {
    private String name;
    private String cpu;
    private String ram;
}
