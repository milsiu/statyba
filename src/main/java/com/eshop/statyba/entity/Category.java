package com.eshop.statyba.entity;

import javax.persistence.Table;
import java.util.UUID;

@Table(name = "categories")
public class Category {

    UUID id;
    String name;
    Group group;
}





