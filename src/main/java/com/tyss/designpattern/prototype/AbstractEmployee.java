package com.tyss.designpattern.prototype;

public abstract class AbstractEmployee {

    private String fullName;
    private Role role;

    public abstract AbstractEmployee cloneObject();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
