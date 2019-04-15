package com.fitbit.authentication.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.fitbit.authentication.AuthenticationHandler;
import com.fitbit.authentication.AuthenticationResult;
import com.fitbit.authentication.AuthorizationController;
import com.fitbit.authentication.ClientCredentials;
import com.fitbit.authentication.Scope;
import com.fitbit.fitbitauth.R;
import com.fitbit.fitbitauth.databinding.ActivityLoginBinding;

import java.util.HashSet;
import java.util.Set;


public class LoginActivity extends AppCompatActivity implements AuthenticationHandler {

    public static final String CONFIGURATION_VERSION = "CONFIGURATION_VERSION";
    public static final String AUTHENTICATION_RESULT_KEY = "AUTHENTICATION_RESULT_KEY";
    private static final String CLIENT_CREDENTIALS_KEY = "CLIENT_CREDENTIALS_KEY";
    private static final String EXPIRES_IN_KEY = "EXPIRES_IN_KEY";
    private static final String SCOPES_KEY = "SCOPES_KEY";
    private ActivityLoginBinding binding;

    public static Intent createIntent(Context context, @NonNull ClientCredentials clientCredentials, @Nullable Long expiresIn, Set<Scope> scopes) {
        return createIntent(context, null, clientCredentials, expiresIn, scopes);
    }

    public static Intent createIntent(Context context, Integer configVersion, @NonNull ClientCredentials clientCredentials, @Nullable Long expiresIn, Set<Scope> scopes) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra(CLIENT_CREDENTIALS_KEY, clientCredentials);
        intent.putExtra(CONFIGURATION_VERSION, configVersion);
        intent.putExtra(EXPIRES_IN_KEY, expiresIn);
        intent.putExtra(SCOPES_KEY, scopes.toArray(new Scope[scopes.size()]));

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        setCustomActionBar();

        ClientCredentials clientCredentials = getIntent().getParcelableExtra(CLIENT_CREDENTIALS_KEY);
        Long expiresIn = getIntent().getLongExtra(EXPIRES_IN_KEY, 604800);
        Parcelable[] scopes = getIntent().getParcelableArrayExtra(SCOPES_KEY);
        Set<Scope> scopesSet = new HashSet<>();
        for (Parcelable scope : scopes) {
            scopesSet.add((Scope) scope);
        }

        binding.loginWebview.setWebChromeClient(new MyWebChromeClient());
        binding.loginWebview.setWebViewClient(new MyWebViewClient());

        AuthorizationController authorizationController = new AuthorizationController(
                binding.loginWebview,
                clientCredentials,
                this);

        binding.pbPageLoad.show();

        authorizationController.authenticate(expiresIn, scopesSet);

    }

    private void setCustomActionBar() {
        setSupportActionBar(binding.appToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        binding.appToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onAuthFinished(AuthenticationResult result) {
        binding.loginWebview.setVisibility(View.GONE);

        Intent resultIntent = new Intent();
        resultIntent.putExtra(AUTHENTICATION_RESULT_KEY, result);
        resultIntent.putExtra(CONFIGURATION_VERSION, getIntent().getIntExtra(CONFIGURATION_VERSION, 0));
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

    class MyWebChromeClient extends WebChromeClient {

        @Override
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            getSupportActionBar().setTitle(title);
            getSupportActionBar().setSubtitle(view.getUrl());
        }

        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            super.onProgressChanged(view, newProgress);
            binding.pbPageLoad.setProgress(newProgress);

            if (newProgress >= 100) {
                binding.pbPageLoad.hide();
            }
        }
    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            if (view != null && request != null) {
                binding.pbPageLoad.show();
                binding.loginWebview.loadUrl(request.getUrl().toString());
                getSupportActionBar().setSubtitle("");
                getSupportActionBar().setTitle(request.getUrl().toString());
            }
            return super.shouldOverrideUrlLoading(view, request);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
