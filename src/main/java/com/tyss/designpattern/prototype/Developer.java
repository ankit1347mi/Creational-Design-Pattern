package com.tyss.designpattern.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Developer extends AbstractEmployee {

    private String fullName;
    private Role role;

    public Developer(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    @Override
    public AbstractEmployee cloneObject() {
        return new Developer(fullName, role);
    }
}
