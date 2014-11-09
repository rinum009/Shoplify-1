package views;

import controllers.ShoppingCartController;
import global.Global;

import javax.swing.*;

public class ShoppingCartView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JPanel iconPanel;
    private JPanel topRightPanel;
    private JButton loginBtn;
    private JPanel searchPanel;
    private JTextField searchField;
    private JButton searchBtn;
    private JLabel categoryLabel;
    private JList Deli;
    private JList Meat;
    private JList Seafood;
    private JList Vegetable;
    private JList Bakery;
    private JPanel adBannerPanel;
    private JList list1;
    private JList list2;
    private JList list3;
    private JList list4;
    private JList list5;
    private JEditorPane updateAmount1;
    private JEditorPane updateAmount2;
    private JEditorPane updateAmount3;
    private JEditorPane updateAmount4;
    private JLabel totalTxt;
    private JLabel totalNumAmount;
    private JButton couponBtn;
    private JButton checkOutBtn;
    private ShoppingCartController _shoppingCartController;

    public ShoppingCartView() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        _shoppingCartController = new ShoppingCartController();
    }

    public static void main(String[] args) {
        ShoppingCartView dialog = new ShoppingCartView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void addItemToCart()
    {
        int itemId = 1; //TODO needs to be a value somehow passed from the view
        _shoppingCartController.addItemToCart(Global.currentOrder._shoppingCart,itemId);
    }
}
