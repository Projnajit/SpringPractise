package org.removeXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Helper {

    public Name name;

    public Helper(Name name) {
        this.name = name;
    }

    public void func() {
        System.out.println("I am helping you...");
    }
}
