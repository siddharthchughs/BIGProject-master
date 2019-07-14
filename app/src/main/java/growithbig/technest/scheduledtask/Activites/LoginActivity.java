package growithbig.technest.scheduledtask.Activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import growithbig.technest.scheduledtask.R;

public class LoginActivity extends Activity implements View.OnClickListener{


    Button bt_login;
    TextView tv_signUp;
    TextView tv_forgotPassowrd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bt_login = (Button)findViewById(R.id.bt_login);
        tv_signUp = (TextView) findViewById(R.id.tv_signUp);
        tv_forgotPassowrd = (TextView) findViewById(R.id.tv_forgotPassowrd);
        initializeUI();

    }



    public void initializeUI()
    {
        tv_signUp.setOnClickListener(this);
        tv_forgotPassowrd.setOnClickListener(this);
        bt_login.setOnClickListener(this);


    }






    /*
    * The click event using butterknife library for navigating to the
    * Registration page.
    * */
        public void ClickSignUp(){
        Intent inSignUp = new Intent(getApplicationContext(),RegistrationActivity.class);
            inSignUp.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(inSignUp);
        }
    /*
    * The click event using butterknife library for navigating to the
    * Forgot page.
    * */
        public void ClickForgot(){
        Intent inSignUp = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
            inSignUp.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(inSignUp);
        }
        public void ClickLogin(){
        Intent inSignUp = new Intent(getApplicationContext(), DashboardActivity.class);
            inSignUp.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

            startActivity(inSignUp);
        }

    @Override
    public void onClick(View v) {

            int id = v.getId();
            switch (id){
                case R.id.tv_signUp:
                    ClickSignUp();
                    break;
                case R.id.tv_forgotPassowrd:
                    ClickForgot();
                    break;
                case R.id.bt_login:
                    ClickLogin();
                    break;
            }

    }
}
