package com.xhimat.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by chima on 1/13/17.
 *
 * This class implements a stack service,
 * it does so by delegating to an instance oof java.util.Stack
 */

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StackService {

    private Stack<Integer> stack = new Stack();

    /**
     * Pushes integer to stack
     * @param val
     */
    public void push(int val) {
      stack.push(val);
    }

    /**
     * Removes last element in stack
     */
    public void pop () throws StackEmptyException {
     if (stack.isEmpty()) {
         throw new StackEmptyException("Stack is empty");
     }
        stack.pop();
    }
    /**
     * @return list of numbers in the stack
     */
    public List<Integer> show ()  {
        return stack.stream()
                .map(p -> p.intValue())
                .collect(Collectors.toList());
    }
}
