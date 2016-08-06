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
public class JavaPrograms extends ListFragment {

    Intent intent;
    public JavaPrograms() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        String[] value = getResources().getStringArray(R.array.topicPrograms);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, value);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView temp = (TextView) v;
        switch (temp.getText().toString()) {

            case "Core Java Programs [PAGE 1]":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Core Java Programs [PAGE 1]");
                startActivity(intent);
                break;

            case "Core Java Programs [PAGE 2]":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Core Java Programs [PAGE 2]");
                startActivity(intent);
                break;


            case "Core Java Programs [PAGE 3]":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Core Java Programs [PAGE 3]");
                startActivity(intent);
                break;

            case "Date Utility Code Snippet":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "Date Utility Code Snippet");
                startActivity(intent);
                break;

            case "String Utility Code Snippet":
                intent = new Intent(getActivity(), HTMLDisplayActivity.class);
                intent.putExtra("chk", "String Utility Code Snippet");
                startActivity(intent);
                break;


            default:


        }

    }
}
