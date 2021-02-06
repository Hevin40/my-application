package hego.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<model> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        arrayList = new ArrayList<>();
        arrayList.add(new model("hevin","golakiya",R.mipmap.ic_launcher));
        arrayList.add(new model("hevin","golakiya",R.mipmap.ic_launcher));
        arrayList.add(new model("hevin","golakiya",R.mipmap.ic_launcher));

        RecyclerAdapater recyclerAdapater = new RecyclerAdapater(arrayList);
        recyclerView.setAdapter(recyclerAdapater);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}