package growithbig.technest.scheduledtask.Activites;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import growithbig.technest.scheduledtask.Constants.Constant_data;
import growithbig.technest.scheduledtask.R;
import growithbig.technest.scheduledtask.UserSession.AppSession;

public class SplashActivity extends Activity {

    AppSession appSession;
    String token;
    private SharedPreferences preferences;
    private SharedPreferences preferences_notify;
    String data_firebase;
  //  private Notification_firebase_data_items notification_firebase_data_items;
    private SharedPreferences sharedPreferencesLoginDetail;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        appSession = new AppSession(this);

        sharedPreferencesLoginDetail = getSharedPreferences("Choose", Context.MODE_PRIVATE);
        data = sharedPreferencesLoginDetail.getString("token", "No Values");

        initialUi();
    }



    private void initialUi() {
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                navigateLogin();
//              close this activity
                finish();
            }
        }, Constant_data.SPLASH_TIME);
    }


//    private void Display_TodaysFitrebaseToken(){
//        try {
//            if (isConnected()) {
//                new HttpAsyncTask().execute("http://13.127.186.216:90/v1.0/devices/add");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }


    private void navigateLogin(){

        SharedPreferences shareAccountInformation = getSharedPreferences("Choose", Context.MODE_PRIVATE);
        token = shareAccountInformation.getString("token", "No value found").toString();



        if(appSession.getSkipped()||appSession.getMainToken().equals(token)) {


            Intent nextLogin = new Intent(this, DashboardActivity.class);
            startActivity(nextLogin);
        }
        else
        {
            Intent nextLogin = new Intent(this, LoginActivity.class);
            startActivity(nextLogin);

        }
    }


}
