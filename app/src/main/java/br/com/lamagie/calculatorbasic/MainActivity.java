package br.com.lamagie.calculatorbasic;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    String op;
    double temporaryHolder, finalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Locale.setDefault(Locale.US);

        this.mViewHolder.textView = findViewById(R.id.textView3);

        this.mViewHolder.one = findViewById(R.id.one);
        this.mViewHolder.one.setOnClickListener(this);
        this.findViewById(R.id.two).setOnClickListener(this);
        this.findViewById(R.id.tree).setOnClickListener(this);
        this.findViewById(R.id.four).setOnClickListener(this);
        this.findViewById(R.id.five).setOnClickListener(this);
        this.findViewById(R.id.six).setOnClickListener(this);
        this.findViewById(R.id.seven).setOnClickListener(this);
        this.findViewById(R.id.eight).setOnClickListener(this);
        this.findViewById(R.id.nine).setOnClickListener(this);
        this.findViewById(R.id.zero).setOnClickListener(this);
        this.findViewById(R.id.div).setOnClickListener(this);
        this.findViewById(R.id.minus).setOnClickListener(this);
        this.findViewById(R.id.sum).setOnClickListener(this);
        this.findViewById(R.id.percent).setOnClickListener(this);
        this.findViewById(R.id.multiply).setOnClickListener(this);
        this.findViewById(R.id.result).setOnClickListener(this);

    }

    public void buttonDot(View v) {
        String temp = this.mViewHolder.textView.getText().toString();
        if (mViewHolder.textView.getText().equals(" ")) mViewHolder.textView.setText("0.");
        if (mViewHolder.textView.getText().equals("0."))
            Toast.makeText(this, "Already a Decimal Value", Toast.LENGTH_SHORT).show();
        if (temp.contains(".")) Toast.makeText(this, "You can't add any other . because you already have a decimal value", Toast.LENGTH_SHORT).show();
        else mViewHolder.textView.setText(mViewHolder.textView.getText() + ".");
    }

    public void clear(View v) {
        temporaryHolder = 0;
        finalResult = 0;
        mViewHolder.textView.setText("0");
    }

    public void ce(View v) {
        String value = this.mViewHolder.textView.getText().toString();
        if (mViewHolder.textView.getText().equals("0")) {
            Toast.makeText(this, "Enter a Value", Toast.LENGTH_SHORT).show();
        } else if (mViewHolder.textView.equals("0")) {
            mViewHolder.textView.setText("0");
        } else {
            String temp = value.substring(0, value.length() - 1);
            mViewHolder.textView.setText(temp);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.zero:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("0.");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "0");
                break;
            case R.id.one:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("1");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "1");
                break;
            case R.id.two:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("2");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "2");
                break;
            case R.id.tree:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("3");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "3");
                break;
            case R.id.four:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("4");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "4");
                break;
            case R.id.five:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("5");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "5");
                break;
            case R.id.six:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("6");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "6");
                break;
            case R.id.seven:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("7");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "7");
                break;
            case R.id.eight:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("8");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "8");
                break;
            case R.id.nine:
                if (mViewHolder.textView.getText().equals("0")) mViewHolder.textView.setText("9");
                else mViewHolder.textView.setText(mViewHolder.textView.getText() + "9");
                break;

            case R.id.percent:
                temporaryHolder = Double.parseDouble(mViewHolder.textView.getText().toString());
                mViewHolder.textView.setText("0");
                op = "percent";
                break;
            case R.id.div:
                temporaryHolder = Double.parseDouble(mViewHolder.textView.getText().toString());
                mViewHolder.textView.setText("0");
                op = "div";
                break;
            case R.id.multiply:
                temporaryHolder = Double.parseDouble(mViewHolder.textView.getText().toString());
                mViewHolder.textView.setText("0");
                op = "multiply";
                break;
            case R.id.minus:
                temporaryHolder = Double.parseDouble(mViewHolder.textView.getText().toString());
                mViewHolder.textView.setText("0");
                op = "minus";
                break;
            case R.id.sum:
                temporaryHolder = Double.parseDouble(mViewHolder.textView.getText().toString());
                mViewHolder.textView.setText("0");
                op = "sum";
                break;
            case R.id.result:
                if (op == "div") {
                    mViewHolder.textView.setText(String.valueOf(temporaryHolder / Double.parseDouble(mViewHolder.textView.getText().toString())));
                } else if (op == "multiply") {
                    mViewHolder.textView.setText(String.valueOf(temporaryHolder * Double.parseDouble(mViewHolder.textView.getText().toString())));
                } else if (op == "minus") {
                    mViewHolder.textView.setText(String.valueOf(temporaryHolder - Double.parseDouble(mViewHolder.textView.getText().toString())));
                } else if (op == "sum") {
                    mViewHolder.textView.setText(String.valueOf(temporaryHolder + Double.parseDouble(mViewHolder.textView.getText().toString())));
                } else if (op == "percent") {
                    mViewHolder.textView.setText(String.valueOf(temporaryHolder % Double.parseDouble(mViewHolder.textView.getText().toString())));
                }
        }
    }

    public static class ViewHolder {
        Button one;
        TextView textView;
    }

}
