package com.sukhbirsingh.tests.sample;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSample {

    @Description("TC 1")
    @Test
    public void testSample01() {
        Assert.assertTrue(true);
    }

    @Description("TC2")
    @Test
    public void testSample02() {
        Assert.assertTrue(true);
    }
}
