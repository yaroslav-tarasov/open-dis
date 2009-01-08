
package edu.nps.moves.examples;

import java.util.*;

/**
 * A comparator that is used by the java util classes for sorting. This
 * sorts members of a collection by class name.
 * 
 * Used like so:
 * 
 * Collections.sort(aList, new ClassNameComparator());
 *
 * @author DMcG
 */
public class ClassNameComparator implements Comparator
{
    /**
     * Returns a number less than, equal to, or greater than zero,
     * depending on whether the object is lexically less than, equal to,
     * or greater than the other object.
     */
    public int compare(Object object1, Object object2)
    {
        return object1.getClass().getName().compareTo(object2.getClass().getName());
    }

    /**
     * Returns true if this comparator is the same class as the comparator passed in.
     * 
     * @param obj
     * @return
     */
 @Override
 public boolean equals(Object obj)
 {
     return obj.getClass().equals(this.getClass());
 }



}
