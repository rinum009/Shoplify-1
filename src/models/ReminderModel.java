package models;

import java.util.*;
/**
 * Created by KellyAnn on 11/30/14.
 */
public class ReminderModel {

    private int _reminderId;
    private int _userId;
    private int _itemId;

    private ArrayList<ItemModel> _items;

    public ReminderModel(int reminderId, int userId, int itemId) {
        this._reminderId = reminderId;
        this._userId = userId;
        this._itemId = itemId;
    }

    public ReminderModel() {
        _items = new ArrayList<ItemModel>();
    }

    public void deleteItem(ItemModel item){
        for(ItemModel itemToDelete : _items)
            if(itemToDelete.getReminderListItemId() == item.getReminderListItemId() && itemToDelete.getItemID() == item.getItemID())
            {
                _items.remove(itemToDelete);
                return;
            }
    }

    public ArrayList<ItemModel> getItems()
    {
        return _items;
    }

    public void addItem(ItemModel item){
        _items.add(item);
    }

    public int getReminderId(){
        return _reminderId;
    }

    public void setReminderId(int reminderId){
        this._reminderId = reminderId;
    }

    public int getUserId(){
        return _userId;
    }

    public void setUserId(int userId){
        this._userId = userId;
    }

    public int getItemId(){
        return _itemId;
    }

    public void seItemId(int itemId){
        this._itemId = itemId;
    }

    public void saveCurrentList(Collection<ItemModel> saveList){
        for(ItemModel i : saveList){

        }
    }
}
