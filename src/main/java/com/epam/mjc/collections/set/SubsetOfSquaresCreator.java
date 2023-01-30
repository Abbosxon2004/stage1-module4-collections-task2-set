package com.epam.mjc.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> collect = sourceList.stream().map(x -> x * x).collect(Collectors.toCollection(TreeSet::new));
        return collect.subSet(lowerBound, true, upperBound, true);
    }
}
