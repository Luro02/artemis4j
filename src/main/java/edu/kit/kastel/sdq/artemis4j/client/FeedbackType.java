/* Licensed under EPL-2.0 2024. */
package edu.kit.kastel.sdq.artemis4j.client;

public enum FeedbackType {
    /**
     * Single-line manual annotation
     */
    MANUAL,

    /**
     * Manual annotation that is not associated with a specific line
     */
    MANUAL_UNREFERENCED,

    /**
     * E.g. unit test result
     */
    AUTOMATIC,
}
