package com.danila.exceptions;

import com.danila.arraylistlinkedlist.Actor;

public class TestNullPointer {
    public static void main(String[] args) {
        Actor actor = null;

        try{
            actor.getFirstName();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

    }
}
