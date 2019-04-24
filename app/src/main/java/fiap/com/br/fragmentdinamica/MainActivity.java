package fiap.com.br.fragmentdinamica;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //------------ Jeito sem OO---------------
   /* public void alterarBanner01(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer,new Banner1Fragment())
                .addToBackStack(null)
                .commit();
    }

    public void alterarBanner02(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new Banner2Fragment())
                .addToBackStack(null)
                .commit();
    }*/ //---------------------------------------------------------


    // -------------------- Jeito com OO----------------------------
        public void alterarBanner01(View view) {
            alterarFragment(new Banner1Fragment());
        }

        public void alterarBanner02(View view) {
            alterarFragment(new Banner2Fragment());
        }

        public void alterarFragment(Fragment fragment){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainer, fragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

    //-----------------------------------------------------------