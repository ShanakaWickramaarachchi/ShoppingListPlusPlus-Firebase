package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by User on 5/25/2016.
 */
public class ShoppingList {
    private String listName;
    private String owner;

    /**
     * Required public constructor
     */
    public ShoppingList() {
    }

    /**
     * Use this constructor to create new ShoppingLists.
     *
     * @param name
     * @param owner
     *
     */
    public ShoppingList(String name, String owner) {
        this.listName = name;
        this.owner = owner;
    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }

}