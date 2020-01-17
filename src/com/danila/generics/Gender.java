package com.danila.generics;

public enum Gender implements Gengerable {
    MALE{
        @Override
        public String getGender() {
            return "Мужчина";
        }
    },
    FEMALE{
        @Override
        public String getGender() {
            return "Женщина";
        }
    }
}
