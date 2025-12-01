package org.eStoreApplication.data.models;

import java.util.Map;

public class User {
    String id;
    String name;
    String email;
    String phoneNumber;
    String role;
    Map<Product,Integer> cart;
}
