package ajaymehta.importingobjectreference;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ajay Mehta on 6/26/2017.
 */

public class Fighter {

// there is a reason for everything...there is also reason to create reference in its own class..for more info refer to ArrayOfObjects2 project..
    static Fighter fighter;       // we made it static so that it could be imported in that class where we want to create object of it.

    private String name;

    public Fighter(String name) {
        this.name = name;
    }

    public void printName(Context context){

        Toast.makeText(context, "my name is "+name, Toast.LENGTH_SHORT).show();
    }
}
