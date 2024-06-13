package com.example.wow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.wow.fragment.InboxFragment;
import com.example.wow.fragment.ProfileFragment;
import com.example.wow.fragment.SearchFragment;
import com.example.wow.fragment.VideoFragment;


public class HomeScreenActivity extends AppCompatActivity{

    FragmentTransaction ft ;
    VideoFragment videoFragment;
    SearchFragment searchFragment;
    ProfileFragment profileFragment;
    InboxFragment inboxFragment;
    private long pressedTime;
    private  String message  = "";
    private Button btnHome, btnAddVideo, btnInbox, btnProfile, btnSearch;

    Intent fragmentIntent = null;
    Boolean openAppFromLink = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

    //  fragmentIntent = getIntent();
     // ft = getSupportFragmentManager().beginTransaction();
      /*

      if (fragmentIntent.getExtras() !=null) {
          if (fragmentIntent.hasExtra("id")) {
              openAppFromLink = true;
          }
          if (fragmentIntent.hasExtra("fragment_inbox")) {
              inboxFragment = InboxFragment.newInstance("inbox");
             ft.add(R.id.main_fragment,inboxFragment);
          } else if (fragmentIntent.hasExtra("fragment_profile")) {
              profileFragment = new ProfileFragment("profile", "");
              ft.add(R.id.main_fragment, profileFragment);
              
          } else if (fragmentIntent.hasExtra("fragment_search")) {
              searchFragment = SearchFragment.newInstance("search");
              ft.add(R.id.main_fragment, searchFragment);
          } else  {
              videoFragment = VideoFragment.newInstance("fragment_video");
              ft.add(R.id.main_fragment, videoFragment);
          }

      } else  {
          videoFragment = VideoFragment.newInstance("fragment_video");
          ft.add(R.id.main_fragment, videoFragment);
      }

        ft.commit();
      btnHome = (Button) findViewById(R.id.btnHome);
        btnInbox = (Button)findViewById(R.id.btnInbox);
        btnProfile = (Button) findViewById(R.id.btnProfile);

        btnSearch=(Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(this);
    }

    @Override public void onStart() {
        super.onStart();
//        loadVideos();
    }


    public  void onBackPressed(){
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopVideoFragment();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void onClick(View view) {
//        if (view.getId() == btnProfile.getId()) {
//            ft = getSupportFragmentManager().beginTransaction();
//            profileFragment = ProfileFragment.newInstance("profile", "");
//            ft.replace(R.id.main_fragment, profileFragment);
//            ft.commit();
//            return;
//        }

        if (view.getId() == btnSearch.getId())
        {
            ft = getSupportFragmentManager().beginTransaction();
            if (searchFragment == null)  {
                searchFragment = SearchFragment.newInstance("search");
                ft.add(R.id.main_fragment, searchFragment);
            }
            showFragments(1);
            ft.commit();
        }
        if(view.getId() == btnProfile.getId()) {
            handleProfileClick();
        }
        if(view.getId() == btnAddVideo.getId()) {
            handleAddClick();
        }
        if(view.getId() == btnHome.getId()) {
            handleHomeClick();
        }
        if(view.getId() == btnInbox.getId()) {
            handleInboxClick();
        }

    }//on click


    private  void handleProfileClick(){
        if (user == null) {

        }


       */

    }

}
