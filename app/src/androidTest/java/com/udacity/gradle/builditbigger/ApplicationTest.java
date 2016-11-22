package com.udacity.gradle.builditbigger;


import android.app.Application;
import android.test.ApplicationTestCase;


public class ApplicationTest extends ApplicationTestCase<Application> {
    /*
        public void testVerifyEchoResponse() {
            assertEquals("hello", "hello");
        }
    */
    public ApplicationTest() {
        super(Application.class);
    }

    public void testAsyncNotBlankResponse() {
        String result = "";

        assertEquals("d", "a");
/*
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
*/
    }

}
