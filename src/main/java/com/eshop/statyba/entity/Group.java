package com.eshop.statyba.entity;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Table(name = "groups")
public record Group(
        @NotBlank
        String name) {

}
