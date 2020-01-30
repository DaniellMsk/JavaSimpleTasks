package com.danila.serialization;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Notebook extends Computer {
    private Touchpad touchpad;
    private int weight;

    public Notebook(String name, String cpu, String ram, Touchpad touchpad, int weight) {
        super(name, cpu, ram);
        this.touchpad = touchpad;
        this.weight = weight;
    }
}
