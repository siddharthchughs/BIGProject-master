package growithbig.technest.scheduledtask.Activites;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import growithbig.technest.scheduledtask.R;

public class ForgotPasswordActivity extends Activity implements View.OnClickListener {

    private ImageView img_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        img_back = (ImageView) findViewById(R.id.img_back);
        initializeUI();
    }


    public void initializeUI() {
        img_back.setOnClickListener(this);


    }

    /*
     * The click event using butterknife library for navigating to the
     * Registration page.
     * */
    public void ClickBack() {
        Intent inSignUp = new Intent(getApplicationContext(), LoginActivity.class);
        inSignUp.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(inSignUp);
    }


    @Override
    public void onClick(View v) {

        int id = v.getId();
        switch (id) {
            case R.id.img_back:
                ClickBack();
                break;
        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
