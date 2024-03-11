package com.bhatia.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_player);
        EditText edtPlayerOne = findViewById(R.id.edt_playerOne);
        EditText edtPlayerTwo = findViewById(R.id.edt_playerTwo);
        Button btnStartGame = findViewById(R.id.btnStartGame);

        btnStartGame.setOnClickListener(v -> {
            String getPlayerOneName = edtPlayerOne.getText().toString();
            String getPlayerTwoName = edtPlayerTwo.getText().toString();

            if(getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                Toast.makeText(AddPlayer.this, "Please enter player name", Toast.LENGTH_SHORT).show();
            }else {
                Intent intent = new Intent(AddPlayer.this, MainActivity.class);
                intent.putExtra("playerOne", getPlayerOneName);
                intent.putExtra("playerTwo", getPlayerTwoName);
                startActivity(intent);
            }
        });
    }
}