package com.xhimat.service;


import com.xhimat.service.StackEmptyException;
import com.xhimat.service.StackService;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by chima on 1/13/17.
 */


public class StackServiceTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    private StackService service;

    @Before
    public void setup() {
        this.service = new StackService();
    }

    @Test
    public void stackshouldBeInitiallyEmpty() {
        assertTrue(this.service.show().size() == 0);
    }

    @Test
    public void shouldThrowStackEmptyExceptionWhenStackIsEmptyIfPoped() throws Exception {
        this.thrown.expect(StackEmptyException.class);
        this.service.pop();
    }


    @Test
    public void shouldPushIntegersToStack() throws Exception {
        this.service.push(1);
        this.service.push(2);
        assertTrue(this.service.show().size() == 2);
    }

    @Test
    public void shouldPopLastIntegerFromStack() throws Exception {
        this.service.push(1);
        this.service.push(2);
        this.service.push(3);
        this.service.pop();
        List<Integer> list = this.service.show();
        assertTrue(list.size() == 2);
        assertTrue(list.get(1) == 2);
        assertTrue(list.get(0) == 1);
    }

}
