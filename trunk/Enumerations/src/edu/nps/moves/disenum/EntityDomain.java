package edu.nps.moves.disenum;

/** Enumeration values for EntityDomain
 * The enumeration values are generated from the SISO DIS XML EBV document, which was
 * obtained from http://discussions.sisostds.org/default.asp?action=10&fd=31
 *
 * Copyright 2008. This work is licensed under the BSD license, available at
 * http://www.movesinstitute.org/licenses
 *
 * @author DMcG
 */

public enum EntityDomain 
{

    OTHER(0, "Other"),
    LAND(1, "Land"),
    AIR(2, "Air"),
    SURFACE(3, "Surface"),
    SUBSURFACE(4, "Subsurface"),
    SPACE(5, "Space");

    /** The enumerated value */
    public final int value;

    /** Text/english description of the enumerated value */
    public final String description;

/** This is an array, with each slot corresponding to an enumerated value
 * and that slot containing the enumerated object. Use to look up enumerated object when you have the value
 */
static public EntityDomain lookup[] = new EntityDomain[6];

/* initialize the array at class load time */
static 
{
    for(EntityDomain anEnum:EntityDomain.values())
    {
        lookup[anEnum.value] = anEnum;
    }
}

/** Constructor */
EntityDomain(int value, String description)
{
    this.value = value;
    this.description = description;
}

public int getValue()
{
  return value;
}


public String getDescription()
{
  return description;
}

}