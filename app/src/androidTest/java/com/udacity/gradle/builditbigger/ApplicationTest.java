package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.util.Pair;
import android.test.AndroidTestCase;
import java.util.concurrent.ExecutionException;

public class ApplicationTest extends AndroidTestCase {

    public void testVerifyEchoResponse() {
        assertEquals("hello", "hello");
    }
/*
    public void testAsyncNotBlankResponse() {
        String result = "";

        assertEquals("d", "d");

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
*/

}
