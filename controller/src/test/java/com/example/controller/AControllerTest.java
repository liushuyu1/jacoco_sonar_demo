package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * @Author liushuyu
 * @Date 2021/6/28 16:28
 * @Version
 * @Desc
 */

@RunWith(PowerMockRunner.class)
public class AControllerTest {

    @InjectMocks
    private AController aController;

    @Test
    public void testA(){
        aController.execute();
    }
}
