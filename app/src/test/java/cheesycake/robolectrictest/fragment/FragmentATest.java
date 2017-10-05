package cheesycake.robolectrictest.fragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import cheesycake.robolectrictest.BuildConfig;
import cheesycake.robolectrictest.MockRoboApp;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.robolectric.shadows.support.v4.SupportFragmentTestUtil.startFragment;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants= BuildConfig.class, application = MockRoboApp.class)
public class FragmentATest {

    @Mock
    FragmentContract.Presenter mockPresenter;

    @Mock
    FragmentComponent MockComponent;

    FragmentA fragmentA;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        fragmentA = new FragmentA();
        fragmentA.fragmentComponent = MockComponent;
        Mockito.doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                fragmentA.presenter = mockPresenter;
                return null;
            }
        }).when(MockComponent).inject(any(FragmentA.class));
    }

    @Test
    public void onStartTest() {
        startFragment(fragmentA);
        assertNotNull(fragmentA);
        Mockito.verify(mockPresenter, Mockito.times(1)).start();
    }

    @Test
    public void onCreateTest() {
        fragmentA = new FragmentA();
        startFragment(fragmentA);
        assertNotNull(fragmentA.fragmentComponent);
    }

}