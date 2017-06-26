package ajaymehta.importingobjectreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static ajaymehta.importingobjectreference.Fighter.fighter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fighter = new Fighter("ajay");      // see above imported statement. we can do static import..if fighter reference is static we can use it n import it..

        fighter.printName(this);
    }

}




  /*   There are conditions when we need to use Object Reference in its own class.. n we are not creating object here
    like  Fighter fighter  = new Fighter --> we are creating like   fighter = new Fighter();  ..we can do this if this object reference is static in its own class
    one reason of creating reference is define in ------>>>>  ArrayOfObjects2 project..see that...


    // if its an inner class object than we can access it with the help of outer class object..we create outer class object n then we can access inner class object..
    class A {

        B b;  // B class reference..
        class B {

        }
    }*/
 // here we can access B refernce like   A a = new A();    then a.b  ..but what about ..if we dont have outher class..then we have to import it..fuck..yes we have to..