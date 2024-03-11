package com.bhatia.tictactoe;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class Result extends Dialog {
    private final String message;
    private final MainActivity mainActivity;

    // Default constructor
    public Result(@NonNull Context context) {
        super(context);
        this.message = null;
        this.mainActivity = null;
    }

    public Result(@NonNull Context context, String message, MainActivity mainActivity) {
        super(context);
        this.message = message;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView messageText = findViewById(R.id.messageText);
        Button startAgainButton = findViewById(R.id.btn_startAgain);

        if (message != null) {
            messageText.setText(message);

            startAgainButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mainActivity != null) {
                        mainActivity.restartMatch();
                    }
                    dismiss();
                }
            });
        }
    }
}
