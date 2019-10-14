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
import java.util.ArrayList;
import java.util.Arrays;
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
        // 3 : Arraylist
//        danhsachhocvien :
//            +Teo
//            +Ti
//            +Tuan
//            +Thuy
//            +An
//        ArrayList<String> arrayNames = new ArrayList<>(
//                Arrays.asList("Teo","Ti","Tuan","Thuy","An")
//        );
//        mMyRef.child("danhsachhocvien").setValue(arrayNames).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Log.d("BBB",task.getException().toString());
//                }
//            }
//        });
        // 4 : Object
//        Thongtin thongtin = new Thongtin("38 Nguyen Lam , p6 q10",01234567);
//        mMyRef.child("trungtam").setValue(thongtin).addOnCompleteListener(new OnCompleteListener<Void>() {
//            @Override
//            public void onComplete(@NonNull Task<Void> task) {
//                if (task.isSuccessful()){
//                    Toast.makeText(MainActivity.this, "Thanh cong", Toast.LENGTH_SHORT).show();
//                }else{
//                    Log.d("BBB",task.getException().toString());
//                }
//            }
//        });
        ArrayList<String> arrayNames = new ArrayList<>(
                Arrays.asList("Teo","Ti","Tuan","Thuy","An")
        );
        ArrayList<String> arrayNames1 = new ArrayList<>(
                Arrays.asList("Teo","Ti","Tuan","Thuy","An")
        );
        for (String name : arrayNames){
            if (name.equals("An")){
                arrayNames.remove(name);
                for (String name1 : arrayNames1){
                    arrayNames1.remove(name1);
                }
            }
        }
        Log.d("BBB",arrayNames.size() + "");
    //push hash map
        // Cach nhan lai gia tri

    }

}
