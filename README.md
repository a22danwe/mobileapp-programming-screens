
Börjar med att skapa en ny activity som jag döper till ShowActivity, dit skall informationen som skrivs in i första sidan visas.
Sedan skapar jag två Editext (name) samt (age) och en button i activity_main. Se kodexempel 1.

Jag lägger till två textView i activity_show där (name) och (age) visas. Se kodexempel 2.

för att kunna skicka informationen från en sida till en annan så skapas en onCreate med setOnClickListener som är till för att märka när knappen trycks på. 
När den trycks så startas en intent som säger till activity_show att startas. Se kodexempel 3.

I ShowActivity skapas en onCreate som sätter content view till activity_show. Här representeras datan som skickats i inten genom getExtra. Se kodexempel 4.

```
Kodexempel 1
------------------------------------------------------------------------------------------
<EditText
        android:id="@+id/editTextTextAge"
        android:layout_width="249dp"
        android:layout_height="65dp"
        android:ems="10"
        android:inputType="textPersonName"
        android:text="Age"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.456" />

    <Button
        android:id="@+id/pressButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="176dp"
        android:text="Send"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextTextName"
        app:layout_constraintVertical_bias="0.731" />
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
Kodexempel 2
------------------------------------------------------------------------------------------
<TextView
        android:id="@+id/textViewName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.373" />

    <TextView
        android:id="@+id/textViewAge"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textViewName"
        app:layout_constraintVertical_bias="0.295" />
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
Kodexempel 3
------------------------------------------------------------------------------------------
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pressButton = findViewById(R.id.pressButton);
        EditTextName=findViewById(R.id.editTextTextName);
        EditTextAge=findViewById(R.id.editTextTextAge);
        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShowActivity.class);
                intent.putExtra("Name", EditTextName.getText().toString()); // Optional
                intent.putExtra("Age", EditTextAge.getText().toString()); // Optional
                startActivity(intent);
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------
Kodexempel 4
------------------------------------------------------------------------------------------
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextViewName=findViewById(R.id.textViewName);
        TextViewAge=findViewById(R.id.textViewAge);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
             name = extras.getString("Name");
             age = extras.getString("Age");
            // Do something with the name and number
        }
        TextViewName.setText(name);
        TextViewAge.setText(String.valueOf(age));
------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------

```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

