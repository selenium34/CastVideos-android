package com.google.sample.cast.refplayer.expandedcontrols;

import android.app.Activity;
import android.os.Build;

import com.google.sample.cast.refplayer.BuildConfig;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class,
        sdk = Build.VERSION_CODES.LOLLIPOP,
        packageName = "com.google.sample.cast.refplayer")
public class ExpandedControlsActivityTest {


    Activity activity;

    @Before
    public void setUp() {
        activity = Robolectric.setupActivity(ExpandedControlsActivity.class);

    }

    @Test
    public void test() {
        Assert.assertEquals("ExpandedControlsActivity", activity.getClass().getName());
    }

}
