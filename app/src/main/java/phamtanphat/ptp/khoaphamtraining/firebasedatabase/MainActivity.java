package phamtanphat.ptp.khoaphamtraining.firebasedatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    DatabaseReference mMyRef = mDatabase.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        node : Cha => phai co 1 dua con
//        child : con => phai co key va value
        // Gui du lieu lieu
        // 1 : String
//        giangvien : Pham tan phat
//        mMyRef.child("giangvien").setValue("pham tan phat").addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Log.d("BBB",task.getException().toString());
//                }
//            }
//        });
        // 2 : Long
//       khaigiang : thoidiemhientai
//        mMyRef.child("khaigiang").setValue(Calendar.getInstance().getTimeInMillis()).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Log.d("BBB",task.getException().toString());
//                }
//            }
//        });
        long currentTime = Calendar.getInstance().getTimeInMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY");
        Log.d("BBB",simpleDateFormat.format(currentTime));
    }

}
