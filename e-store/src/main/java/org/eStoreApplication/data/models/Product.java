package org.eStoreApplication.data.models;

import java.util.List;
import java.util.Map;

public class Product {
    String id;
    String productName;
    String type;
    Categories category;
    String brand;
    String price;
    String createdOn;
    String lastUpdated;
    User comfirmPaymet;

    User owner;
    boolean isDelivered;
    Map<User, List<String>> descriptions;


}
