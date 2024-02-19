package com.tyss.designpattern.prototype;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Manger extends AbstractEmployee {

    private String fullName;

    private Role role;

    @Override
    public AbstractEmployee cloneObject() {
        return new Manger(fullName, role);
    }
}
