package com.xhimat.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * Created by chima on 1/13/17.
 */

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class StackService {

    private Stack<Integer> stack = new Stack();

    public void push(int val) {
      stack.push(val);
    }

    public void pop () throws StackEmptyException {
     if (stack.isEmpty()) {
         throw new StackEmptyException("Stack is empty");
     }
        stack.pop();
    }

    public List<Integer> show ()  {
        return stack.stream()
                .map(p -> p.intValue())
                .collect(Collectors.toList());
    }
}
