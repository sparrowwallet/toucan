package com.sparrowwallet.toucan.impl;

import com.sparrowwallet.toucan.LifeHashVersion;

public enum Pattern {
    SNOWFLAKE, // Mirror around central axes.
    PINWHEEL, // Rotate around center.
    FIDUCIAL; // Identity.

    public static Pattern selectPattern(BitEnumerator entropy, LifeHashVersion version) {
        if (version == LifeHashVersion.FIDUCIAL || version == LifeHashVersion.GRAYSCALE_FIDUCIAL) {
            return FIDUCIAL;
        } else {
            if (entropy.next()) {
                return SNOWFLAKE;
            } else {
                return PINWHEEL;
            }
        }
    }
}
