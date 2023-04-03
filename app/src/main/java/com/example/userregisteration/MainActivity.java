package com.example.userregisteration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Collections;


public class MainActivity extends AppCompatActivity {
    private Context context;
    private EditText giveFirstName, giveLastName, giveEmail;
    private RadioGroup radioGroup;
    private Button addKaiffar;


    private CheckBox kandiCheckBox, diCheckBox, docCheckBox, uimaMaisteriCheckBox ;


    private ArrayList<String> examinations = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;

        // Loading of users from file
        UserStorage.getInstance().loadUsers(this);

    }

    public void addKaiffar(View view){
        examinations.clear();

        giveFirstName = findViewById(R.id.giveFirstName);
        giveLastName = findViewById(R.id.giveFamilyName);
        giveEmail = findViewById(R.id.giveEmail);
        radioGroup = findViewById(R.id.radioGroup);
        addKaiffar = findViewById(R.id.addKaiffar);
        kandiCheckBox = findViewById(R.id.kandiCheckBox);
        diCheckBox = findViewById(R.id.diCheckBox);
        docCheckBox = findViewById(R.id.docCheckBox);
        uimaMaisteriCheckBox = findViewById(R.id.uimaMaisteriCheckBox);

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
                degreeProgram = "Sähkötekniikka";
        }

        if(kandiCheckBox.isChecked()){
            examinations.add("Kandidaatin tutkinto");
        }

        if(diCheckBox.isChecked()){
            examinations.add("Diplomi-insinöörin tutkinto");
        }

        if(docCheckBox.isChecked()){
            examinations.add("Tekniikan tohtorin tutkinto");
        }

        if(uimaMaisteriCheckBox.isChecked()){
            examinations.add("Uimamaisteri");
        }

        User thisUser = new User(firstName,lastName,email,degreeProgram, examinations);
        int check = userStorage.addUser(thisUser);
        //Saving of users to file
        userStorage.saveUsers(context);

        Toast.makeText(context,context.getFilesDir().toString(), Toast.LENGTH_LONG).show();

    }

    public void switchToListUsers(View view){

        Intent intent = new Intent(this, ListUsersAcitivity.class);
        startActivity(intent);
    }

}