package com.example.hellokitty.mobileapplication;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;


/**
 * Created by HelloKitty on 03-Feb-18.
 */

@Layout(R.layout.drawer_item)
public class DrawerMenuItem {

    //ใส่เนื้อหาข้างใน

    public static final int DRAWER_MENU_ITEM_First_Page = 1;
    public static final int DRAWER_MENU_ITEM_About_Us = 2;
    public static final int DRAWER_MENU_ITEM_Course = 3;
    public static final int DRAWER_MENU_ITEM_How_to = 4;
    public static final int DRAWER_MENU_ITEM_Question = 5;
    public static final int DRAWER_MENU_ITEM_Contact_Us = 6;
    public static final int DRAWER_MENU_ITEM_Search = 7;


    private int mMenuPosition;
    private Context mContext;
    private DrawerCallBack mCallBack;
    private String open;


    @View(R.id.itemNameTxt)
    private TextView itemNameTxt;

    @View(R.id.itemIcon)
    private ImageView itemIcon;

    public DrawerMenuItem(Context context, int menuPosition) {
        mContext = context;
        mMenuPosition = menuPosition;
    }

    //ใส text menu
    @Resolve
    private void onResolved() {
        switch (mMenuPosition) {
            case DRAWER_MENU_ITEM_First_Page:
                itemNameTxt.setText("หน้าแรก");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
            case DRAWER_MENU_ITEM_About_Us:
                itemNameTxt.setText("เกี่ยวกับเรา");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;
            case DRAWER_MENU_ITEM_Course:
                itemNameTxt.setText("หลักสูตร");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;
            case DRAWER_MENU_ITEM_How_to:
                itemNameTxt.setText("วิธีการใช้งาน");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;
            case DRAWER_MENU_ITEM_Question:
                itemNameTxt.setText("ถาม-ตอบ");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;
            case DRAWER_MENU_ITEM_Contact_Us:
                itemNameTxt.setText("ติดต่อเรา");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;
            case DRAWER_MENU_ITEM_Search:
                itemNameTxt.setText("ค้นหา");
                itemIcon.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_menu_24dp));
                break;

        }
    }

    //Click Action
    @Click(R.id.mainView)
    private void onMenuItemClick() {
        switch (mMenuPosition) {
            case DRAWER_MENU_ITEM_First_Page:
                Toast.makeText(mContext, "Profile", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onFirstPageMenuSelected();
                break;
            case DRAWER_MENU_ITEM_About_Us:
                Toast.makeText(mContext, "Requests", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onAboutMenuSelected();
                break;
            case DRAWER_MENU_ITEM_Course:

                Toast.makeText(mContext, "Groups", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onCourseMenuSelected();
                break;
            case DRAWER_MENU_ITEM_How_to:


                if (mCallBack != null) mCallBack.onHowToMenuSelected();
                break;
            case DRAWER_MENU_ITEM_Question:
                Toast.makeText(mContext, "Notifications", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onQuestionMenuSelected();
                break;
            case DRAWER_MENU_ITEM_Contact_Us:
                Toast.makeText(mContext, "Settings", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onContactUsMenuSelected();
                break;
            case DRAWER_MENU_ITEM_Search:
                Toast.makeText(mContext, "Terms", Toast.LENGTH_SHORT).show();
                if (mCallBack != null) mCallBack.onSearchMenuSelected();
                break;
        }
    }

    public void setDrawerCallBack(DrawerCallBack callBack) {
        mCallBack = callBack;
    }

    //set ตามlist
    public interface DrawerCallBack {
        void onFirstPageMenuSelected();

        void onAboutMenuSelected();

        void onCourseMenuSelected();

        void onHowToMenuSelected();

        void onQuestionMenuSelected();

        void onContactUsMenuSelected();

        void onSearchMenuSelected();
    }


}