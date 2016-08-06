package learnjavatut.learnjava;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PartThree extends ListFragment {

    Intent intent;
    public PartThree() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        String[] value = getResources().getStringArray(R.array.topicPartThree);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp = (TextView) v;
        switch (temp.getText().toString()) {

            case "Java If-Else Statement":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java If-Else Statement");
                startActivity(intent);
                break;

            case "Java Loops":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Loops");
                startActivity(intent);
                break;


            case "Java Arithmetic expressions":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Java Arithmetic expressions");
                startActivity(intent);
                break;


            default:


        }

    }
}
