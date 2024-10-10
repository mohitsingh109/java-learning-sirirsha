package com.javalearning.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Account {

    private final List<String> statements;

    private final Map<String, String> map = new HashMap<>();

    private final Set<String> set = new HashSet<>();

    public Account(List<String> statements) {
        this.statements = new ArrayList<>(statements);
    }

    public List<String> getStatements() { // O(N)
        return Collections.unmodifiableList(statements); // slow
    }


    public Map<String, String> getMap() {
        return Collections.unmodifiableMap(map);
    }

    public Set<String> getSet() {
        return Collections.unmodifiableSet(set);
    }
}
