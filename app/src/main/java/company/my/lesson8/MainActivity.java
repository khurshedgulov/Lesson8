package company.my.lesson8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Переменная test объявленная внутри класса видима для
    // всех блоков кода и функций (методов) внутри данного класса
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // В строке ниже переменной текст присвоена ссылка на виджет с id text в файле макета
        test = findViewById(R.id.text);
        // Виджету TextView присвоено новое значение для атрибута text
        test.setText("Hello");

        // Переменная sum и diff объявлены внтури функции onCreate и она видима
        // только для этой функции и всех блоков внутри данной функции
        int sum = 10 + 20;
        float diff = 0;

        if (sum > 10) {
            diff = 20 - 10;
        }

        for (int i = 0; i < 10; i++) {
            // Объявление переменной внутри цикла for
            // означает что переменную невозможно использовать
            // после окончания тела цикла
            int abc = 10;

            if (i % 2 == 0) {
                abc = 20;
            }
        }

        int a = 2;
        // Switch case используется для сравнения переданной переменной
        // и в зависимости от значения переменной выполнить определенный код
        // в соответствующем блоке case
        switch (a) {
            case 10:
                Toast.makeText(MainActivity.this, "A = " + a, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Log.i("TAG", "A = 2");
                break;
            // default выполняется если нет никаких совпадений в блоке,
            // его использовать необязательно
            default:
                Log.i("TAG", "Нет совпадений");
        }
        // Блок if else if ниже по функциональности похож на блок switch case выше
        if (a == 10) {
            // То же самое что и case 10
            Toast.makeText(MainActivity.this, "From if A = " + a, Toast.LENGTH_SHORT).show();
        } else if (a == 2) {
            // То же что и case 2
            Log.i("TAG", "A = 2");
        }
        else {
            // То же что и default
            Log.i("TAG", "Нет совпадений");
        }
        Log.i("TAG", diff + "");
    }

    @Override
    public void onStop() {
        super.onStop();
        test.setText("Minimized");
        // Переменная объявленная здесь доступна только для функции onStop
        String message = "Some message";
        Log.i("TAG", message);
    }

    @Override
    public void onStart() {
        super.onStart();
        test.setText("Maximized");
    }
}
