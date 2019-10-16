package phamtanphat.ptp.khoaphamtraining.firebasedatabase;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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

        Iterator<String> stringIterator = arrayNames.iterator();

        while (stringIterator.hasNext()){
           while (stringIterator.hasNext()){
               if (stringIterator.next().equals("Thuy")){
                   stringIterator.remove();
               }
           }
        }

        Log.d("BBB",arrayNames.size() + "");
    //push hash map
        // Cach nhan lai gia tri

    }

}
