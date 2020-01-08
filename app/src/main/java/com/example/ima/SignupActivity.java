package com.example.ima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
  private EditText fullname;
  private EditText email;
  private EditText phone;
  private EditText pass;
  private EditText confirmpass;
  private Button verify;
  private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fullname=findViewById(R.id.idfullname);
        email=findViewById(R.id.idemail);
        phone=findViewById(R.id.idphonenumber);
        pass=findViewById(R.id.idpassword);
        confirmpass=findViewById(R.id.idconfirmpass);
        verify=findViewById(R.id.idverify_button);
        signup=findViewById(R.id.idsign_up);
     signup.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            // FirebaseAuth.getInstance().signOut();

             Toast.makeText(SignupActivity.this,"CLICKED",Toast.LENGTH_LONG).show();
         }
     });
    }
}
