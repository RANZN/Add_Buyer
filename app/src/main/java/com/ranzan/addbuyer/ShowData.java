package com.ranzan.addbuyer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowData extends AppCompatActivity {
    private TextView Name;
    private TextView organizationName;
    private TextView number;
    private TextView email;
    private TextView address;
    private TextView manufacture;
    private TextView taxID;
    private TextView companyID;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        initValues();
        Intent intent=getIntent();
        String username=intent.getStringExtra("name");
        Name.setText(username);
        String num=intent.getStringExtra("number");
        number.setText(num);
        String orgName=intent.getStringExtra("organizationName");
        organizationName.setText(orgName);
        String em=intent.getStringExtra("email");
        email.setText(em);
        String add=intent.getStringExtra("address");
        address.setText(add);
        String mu=intent.getStringExtra("manufacture");
        manufacture.setText(mu);
        String tID=intent.getStringExtra("taxID");
        taxID.setText(tID);
        String cID=intent.getStringExtra("companyID");
        companyID.setText(cID);
        String manu=intent.getStringExtra("manufacture");
        manufacture.setText(manu);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(ShowData.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }

    private void initValues() {
        Name = findViewById(R.id.showCusName);
        organizationName = findViewById(R.id.showOrgName);
        number = findViewById(R.id.showContactNum);
        email = findViewById(R.id.showEmail);
        address = findViewById(R.id.showAddress);
        manufacture = findViewById(R.id.showManufacture);
        taxID = findViewById(R.id.showTAXid);
        companyID = findViewById(R.id.showCompanyID);
        back=findViewById(R.id.loginBack);
    }
}