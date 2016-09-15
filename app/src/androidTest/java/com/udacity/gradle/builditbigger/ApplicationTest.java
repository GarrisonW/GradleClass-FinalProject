package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.util.Pair;
import android.test.AndroidTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */


import java.util.concurrent.ExecutionException;

public class ApplicationTest extends AndroidTestCase {

    //public static final String TAG = AsyncTest.class.getName();
    public void testAsynchNotBlankResponse() {
        String result = "";

        EndpointsAsyncTask endpointsAsyncTask = (EndpointsAsyncTask) new EndpointsAsyncTask().execute(new Pair<Context, String>(getContext(), null));

        try {
            result = endpointsAsyncTask.get();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ExecutionException e) {
            e.printStackTrace();
        }

        if (result != null && result.trim().length() > 0) {
            assert (true);
        } else {
            assert (false);
        }

    }
}
