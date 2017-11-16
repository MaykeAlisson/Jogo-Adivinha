package estudo.com.br.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

// DESENVOLVIDO POR: MAYKE ALISSON
// EM : 14/11/17  APRENDENDO ANDROID COM OS CURSOS DA UDEMY
//
public class MainActivity extends AppCompatActivity {

    private Button botaoJogar; // BOTAO JOGAR DA TELA INICIAL
    private TextView textoResultado; // CAMPO DE TEXTO, ONDE APARECE O RESULTADO

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      botaoJogar = (Button) findViewById(R.id.botaoJogarId);// PEGA O ID DO BOTAO
      textoResultado = findViewById(R.id.resultadoId);// PEGA O ID DO COPO DE TEXTO

      //textoResultado.setText("Texto Alterado");

        botaoJogar.setOnClickListener(new View.OnClickListener() {// AÇAO A SER REALIZADA QUANDO O BOTAO FOR CLICADO
            @Override
            public void onClick(View view) {

                Random randomico = new Random(); // GERA NUMERO ALEATORIO
                int numeroAleatorio = randomico.nextInt(10);// DEFINE O TIPO DE NUMERO A SER GERADO E O VALOR MAXIMO

                textoResultado.setText("Número escolhido: " +numeroAleatorio);// DEVOLVE O NUMERO GERADO ALETORIAMENTE
            }
        });

    }
}
