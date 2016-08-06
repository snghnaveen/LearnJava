package learnjavatut.learnjava;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HTMLDisplayActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part_one_html);

        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }


        webview = (WebView) findViewById(R.id.webview_partone);

        webview.setWebViewClient(new WebViewClient());


        String cehk=getIntent().getStringExtra("chk");


        switch (cehk) {


            case "Java Hello World Program" :
                webview.loadUrl("file:///android_asset/JavaHelloWorldProgram.html");
                break;

            case "Java Comments" :
                webview.loadUrl("file:///android_asset/JavaComments.html");
                break;


            case "Java Data and Variables" :
                webview.loadUrl("file:///android_asset/JavaDataandVariables.html");
                break;

            case "Java Command Line Arguments" :
                webview.loadUrl("file:///android_asset/JavaCommandLineArguments.html");
                break;


            case "Java Arithmetic Operators" :
                webview.loadUrl("file:///android_asset/JavaArithmeticOperators.html");
                break;

            case "Java Assignment Operators" :
                webview.loadUrl("file:///android_asset/JavaAssignmentOperators.html");
                break;

            case "Java Increment and Decrement Operators" :
                webview.loadUrl("file:///android_asset/JavaIncrementandDecrementOperators.html");
                break;

            case "Java Relational Operators" :
                webview.loadUrl("file:///android_asset/JavaRelationalOperators.html");
                break;


            case "Java Boolean Operators" :
                webview.loadUrl("file:///android_asset/JavaBooleanOperators.html");
                break;

            case "Java Conditional Operators" :
                webview.loadUrl("file:///android_asset/JavaConditionalOperators.html");
                break;

            case "Java If-Else Statement" :
                webview.loadUrl("file:///android_asset/JavaIfelseStatement.html");
                break;

            case "Java Loops" :
                webview.loadUrl("file:///android_asset/JavaLoops.html");
                break;

            case "Java Arithmetic expressions" :
                webview.loadUrl("file:///android_asset/JavaArithmeticexpressions.html");
                break;


            case "Methods" :
                webview.loadUrl("file:///android_asset/Methods.html");
                break;

            case "Arrays" :
                webview.loadUrl("file:///android_asset/Arrays.html");
                break;

            case "Classes and Objects" :
                webview.loadUrl("file:///android_asset/ClassesandObjects.html");
                break;


            case "Interfaces" :
                webview.loadUrl("file:///android_asset/Interfaces.html");
                break;

            case "Catching Exceptions" :
                webview.loadUrl("file:///android_asset/CatchingExceptions.html");
                break;

            case "File I/O and Streams" :
                webview.loadUrl("file:///android_asset/FileIO.html");
                break;

            case "Make executable jar files in JDK1.3.1" :
                webview.loadUrl("file:///android_asset/Makeexecutable.html");
                break;

            case "Java" :
                webview.loadUrl("file:///android_asset/JavaIntro.html");
                break;


            case "History" :
                webview.loadUrl("file:///android_asset/History.html");
                break;


            case "Object-oriented programming" :
                webview.loadUrl("file:///android_asset/OOPs.html");
                break;


            case "Philosophy" :
                webview.loadUrl("file:///android_asset/Philosophy.html");
                break;

            case "Interview Questions" :
                webview.loadUrl("file:///android_asset/Interview.html");
                break;

            case "Core Java Programs [PAGE 1]" :
                webview.loadUrl("file:///android_asset/Corepart1.html");
                break;

            case "Core Java Programs [PAGE 2]" :
                webview.loadUrl("file:///android_asset/Corepart2.html");
                break;

            case "Core Java Programs [PAGE 3]" :
                webview.loadUrl("file:///android_asset/Corepart3.html");
                break;

            case "Date Utility Code Snippet" :
                webview.loadUrl("file:///android_asset/DateSnippet.html");
                break;

            case "String Utility Code Snippet" :
                webview.loadUrl("file:///android_asset/StringSnippet.html");
                break;


            case "Java Swing" :
                webview.loadUrl("file:///android_asset/JavaSwing.html");
                break;


            case "Java applet" :
                webview.loadUrl("file:///android_asset/Javaapplet.html");
                break;


            case "Java Servlet" :
                webview.loadUrl("file:///android_asset/JavaServlet.html");
                break;


            case "JavaServer Pages" :
                webview.loadUrl("file:///android_asset/JavaServerPages.html");
                break;

            case "Criticism of Java" :
                webview.loadUrl("file:///android_asset/Criticism.html");
                break;



        }
        

    }
        private class WebViewClient extends android.webkit.WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return super.shouldOverrideUrlLoading(view, url);
            }


        }
    }

