package com.example.blooddonor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class dondetails extends AppCompatActivity {
    private static final String TAG = dondetails.class.getSimpleName();
    private ImageView contactIcon;
    private EditText nameDonor,dateofbirth,donoraddress,cityName,bloodGroup,donorphone,donorgender;
    private Button updateBtn;
    private TextView personalDetails;
    private FirebaseAuth firebaseAuth;
    private FirebaseFirestore fStore;
    private String userID;
    private String email;
    private DatabaseReference databaseReference;
    private FirebaseDatabase database;
    private String dname,bgroup,gender,phoneNum,donDOB,donaddress,doncity;
    private Userinformation userinformation;
    private FirebaseStorage firebaseStorage;
    private StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dondetails);
        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() == null){
            finish();
            startActivity(new Intent(getApplicationContext(),register.class));
        }

        contactIcon    =findViewById(R.id.contact_Icon);
        nameDonor      =findViewById(R.id.name_donor);
        dateofbirth    =findViewById(R.id.date_of_birth);
        donoraddress   =findViewById(R.id.donor_address);
        cityName       =findViewById(R.id.city_name);
        bloodGroup     =findViewById(R.id.blood_Group);
        donorphone     =findViewById(R.id.donor_phone);
        updateBtn      =findViewById(R.id.update_Btn);
        donorgender    =findViewById(R.id.donor_gender);
        FirebaseUser user=firebaseAuth.getCurrentUser();
        firebaseStorage = FirebaseStorage.getInstance();
        storageReference = firebaseStorage.getReference();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        personalDetails=findViewById(R.id.personal_details);
        firebaseAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();

        updateBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                database=FirebaseDatabase.getInstance();
                databaseReference=database.getReference("users");
                databaseReference.setValue("DONORS");

                //insert data into firebase database
                String dname = nameDonor.getText().toString();
                String bgroup = bloodGroup.getText().toString();
                String gender = donorgender.getText().toString();
                String phoneNum= donorphone.getText().toString();
                String donDOB= dateofbirth.getText().toString();
                String donaddress = donoraddress.getText().toString();
                String doncity = cityName.getText().toString();
                Userinformation userinformation = new Userinformation(dname,bgroup,gender,phoneNum,donDOB,donaddress,doncity);
                databaseReference.child(phoneNum).setValue(userinformation);

                Toast.makeText(dondetails.this, "Profile Updated.", Toast.LENGTH_SHORT).show();




                    



            }
        });
        



    }

}







