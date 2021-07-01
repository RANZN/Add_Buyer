package com.ranzan.addbuyer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText organizationName;
    private EditText number;
    private EditText email;
    private EditText address;
    private EditText manufacture;
    private EditText taxID;
    private EditText companyID;
    private ImageView tick;
    private ImageView back;
    String emailVerify = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initValues();
        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowData.class);
                intent.putExtra("name", Name.getText().toString());
                intent.putExtra("organizationName", organizationName.getText().toString());
                intent.putExtra("number", number.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("taxID", taxID.getText().toString());
                intent.putExtra("manufacture", manufacture.getText().toString());
                intent.putExtra("companyID", companyID.getText().toString());
                if (validEmail() && validOrgName() && validName() && validNumber() && validAddress() && validCompanyID() && validManufacture() && validTaxID())
                    startActivity(intent);

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void initValues() {
        Name = findViewById(R.id.etCusName);
        organizationName = findViewById(R.id.etOrganizationName);
        number = findViewById(R.id.etCustomerContactNumber);
        email = findViewById(R.id.etCustomerEmail);
        address = findViewById(R.id.etCustomerAddress);
        manufacture = findViewById(R.id.etCustomerAddress);
        taxID = findViewById(R.id.etCustomerTaxID);
        companyID = findViewById(R.id.etCompanyID);
        tick = findViewById(R.id.btnNext);
        back = findViewById(R.id.exitbtn);
    }

    private boolean validEmail() {
        if (email.getText().toString().matches(emailVerify))
            return true;
        else {
            email.setError("Enter Valid Email");
            return false;
        }
    }

    private boolean validName() {
        if (Name.getText().toString().trim().length() > 4) return true;
        else {
            Name.setError("Invalid Name");
            return false;
        }
    }

    private boolean validOrgName() {
        if (organizationName.getText().toString().trim().length() > 4) return true;
        else {
            organizationName.setError("Invalid");
            return false;
        }
    }

    private boolean validAddress() {
        if (address.getText().toString().trim().length() > 4) return true;
        else {
            address.setError("Invalid");
            return false;
        }
    }

    private boolean validNumber() {
        if (number.getText().toString().trim().length() == 10) return true;
        else {
            number.setError("Invalid");
            return false;
        }
    }

    private boolean validManufacture() {
        if (manufacture.getText().toString().trim().length() > 4) return true;
        else {
            manufacture.setError("Invalid");
            return false;
        }
    }

    private boolean validTaxID() {
        if (taxID.getText().toString().trim().length() > 4) return true;
        else {
            taxID.setError("Invalid");
            return false;
        }
    }

    private boolean validCompanyID() {
        if (companyID.getText().toString().trim().length() > 4) return true;
        else {
            companyID.setError("Invalid");
            return false;
        }
    }
}