package com.springswagger.swagger_learning;

import io.swagger.v3.oas.annotations.media.Schema;

public class Contact {
    @Schema(description = "Unique Id for Contact")
    String id;
    @Schema(description = "The Person's Name")
    String name;
    @Schema(description = "The Person's Phone Number")
    String phone;

    public Contact(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + "]";
    }
}
