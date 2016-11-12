package com.strangerandglory.inventory;

/**
 * Created by m on 2016-10-31.
 */

public class Item {

    private String item_name;
    private double item_price;
    private String item_attribute_type;
    private double item_attribute_amount;
    private String item_photo;
    private String item_brand_name;
    private String item_category_name;
    private int item_quantity;
    private int item_optimum_quantity;
    private int item_safe_quantity;
    private String _id;
    private String _created;
    private String _changed;
    private String _createdby;
    private String _changedby;
    private String _version;

    public Item(String item_name, double item_price, double item_attribute_amount, String item_attribute_type, String item_photo,
                String item_category_name, String item_brand_name, int item_quantity, int item_optimum_quantity, int item_safe_quantity){
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_attribute_type = item_attribute_type;
        this.item_attribute_amount = item_attribute_amount;
        this.item_photo = item_photo;
        this.item_brand_name = item_brand_name;
        this.item_category_name = item_category_name;
        this.item_quantity = item_quantity;
        this.item_optimum_quantity = item_optimum_quantity;
        this.item_safe_quantity = item_safe_quantity;
    }


    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public String getItem_attribute_type() {
        return item_attribute_type;
    }

    public void setItem_attribute_type(String item_attribute_type) {
        this.item_attribute_type = item_attribute_type;
    }

    public double getItem_attribute_amount() {
        return item_attribute_amount;
    }

    public void setItem_attribute_amount(double item_attribute_amount) {
        this.item_attribute_amount = item_attribute_amount;
    }

    public String getItem_photo() {
        return item_photo;
    }

    public void setItem_photo(String item_photo) {
        this.item_photo = item_photo;
    }

    public String getItem_brand_name() {
        return item_brand_name;
    }

    public void setItem_brand_name(String item_brand_name) {
        this.item_brand_name = item_brand_name;
    }

    public String getItem_category_name() {
        return item_category_name;
    }

    public void setItem_category_name(String item_category_name) {
        this.item_category_name = item_category_name;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public int getItem_optimum_quantity() {
        return item_optimum_quantity;
    }

    public void setItem_optimum_quantity(int item_optimum_quantity) {
        this.item_optimum_quantity = item_optimum_quantity;
    }

    public int getItem_safe_quantity() {
        return item_safe_quantity;
    }

    public void setItem_safe_quantity(int item_safe_quantity) {
        this.item_safe_quantity = item_safe_quantity;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_created() {
        return _created;
    }

    public void set_created(String _created) {
        this._created = _created;
    }

    public String get_changed() {
        return _changed;
    }

    public void set_changed(String _changed) {
        this._changed = _changed;
    }

    public String get_createdby() {
        return _createdby;
    }

    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_changedby() {
        return _changedby;
    }

    public void set_changedby(String _changedby) {
        this._changedby = _changedby;
    }

    public String get_version() {
        return _version;
    }

    public void set_version(String _version) {
        this._version = _version;
    }
}
