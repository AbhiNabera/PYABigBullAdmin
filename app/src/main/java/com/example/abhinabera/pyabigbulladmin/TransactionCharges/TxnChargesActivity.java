package com.example.abhinabera.pyabigbulladmin.TransactionCharges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.abhinabera.pyabigbulladmin.R;

public class TxnChargesActivity extends AppCompatActivity {

    EditText niftyTxnCharges, commodityTxnCharges, currencyTxnCharges, fixedDepositTxnCharges;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_txn_charges);
        getSupportActionBar().hide();

        niftyTxnCharges = (EditText) findViewById(R.id.niftyTxnCharges);
        commodityTxnCharges = (EditText) findViewById(R.id.commodityTxnCharges);
        currencyTxnCharges = (EditText)findViewById(R.id.currencyTxnCharges);
        fixedDepositTxnCharges = (EditText) findViewById(R.id.fixedDepositTxnCharges);
        save = (Button) findViewById(R.id.saveButton);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.enter1, R.anim.exit1);
    }
}
