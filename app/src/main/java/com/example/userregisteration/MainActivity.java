package com.example.userregisteration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText giveFirstName, giveLastName, giveEmail;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button addKaiffar, addPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void addKaiffar(View view){
        giveFirstName = findViewById(R.id.giveFirstName);
        giveLastName = findViewById(R.id.giveFamilyName);
        giveEmail = findViewById(R.id.giveEmail);
        radioGroup = findViewById(R.id.radioGroup);
        addKaiffar = findViewById(R.id.addKaiffar);

        UserStorage userStorage = UserStorage.getInstance();

        String firstName = String.valueOf(giveFirstName.getText());
        String lastName = String.valueOf(giveLastName.getText());
        String email = String.valueOf(giveEmail.getText());
        String degreeProgram = "";
        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.titeCheckBox:
                degreeProgram = "Tietotekniikka";
                break;
            case R.id.tutaCheckBox:
                degreeProgram = "Tuotantotalous";
                break;
            case R.id.lateCheckBox:
                degreeProgram = "Laskennallinen tekniikka";
                break;
            case R.id.sateCheckBox:
                degreeProgram = "Sähkötenkiikka";
        }

        User thisUser = new User(firstName,lastName,email,degreeProgram);
        int check = userStorage.addUser(thisUser);

    }
    public void switchToListUsers(View view){
        Intent intent = new Intent(this, ListUsersAcitivity.class);
        startActivity(intent);
    }

}