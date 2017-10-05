package cheesycake.robolectrictest.fragment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cheesycake.robolectrictest.ext.SomeImportantLibraryA;
import cheesycake.robolectrictest.ext.SomeImportantLibraryB;

import static org.junit.Assert.*;

/**
 * Copyright (C) Cheesy Coders - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jin, 2017-10-04
 */
public class FragmentPresenterTest {
    @Mock
    FragmentContract.View view;

    @Mock
    SomeImportantLibraryA someImportantLibraryA;

    @Mock
    SomeImportantLibraryB someImportantLibraryB;

    private FragmentContract.Presenter presenterSpy;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenterSpy = Mockito.spy(new FragmentPresenter(view, someImportantLibraryA, someImportantLibraryB));
    }

    @Test
    public void start() throws Exception {
        presenterSpy.start();
        Mockito.verify(view, Mockito.times(1)).talk();
        Mockito.verify(someImportantLibraryA, Mockito.times(1)).talk();
        Mockito.verify(someImportantLibraryB, Mockito.times(1)).talk();
    }
}