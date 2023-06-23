package unal.todosalau.ecotrashmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumber;
    private Button buttonExecute;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        buttonExecute = findViewById(R.id.buttonExecute);
        textViewResult = findViewById(R.id.textViewResult);

        buttonExecute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int repetitions = Integer.parseInt(editTextNumber.getText().toString());

                // Ciclo for
                String forResult = "";
                for (int i = 0; i < repetitions; i++) {
                    forResult += "¡Recogida de basura " + (i + 1) + " completada!\n";
                }

                // Ciclo while
                String whileResult = "";
                int count = 0;
                while (count < repetitions) {
                    whileResult += "¡Desperdicio " + (count + 1) + " reciclado correctamente!\n";
                    count++;
                }

                // Mostrar los resultados
                textViewResult.setText("Resultado ciclo for:\n" + forResult + "\nResultado ciclo while:\n" + whileResult);
            }
        });
    }
}