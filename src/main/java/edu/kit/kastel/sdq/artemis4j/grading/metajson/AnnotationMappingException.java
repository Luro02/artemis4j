/* Licensed under EPL-2.0 2024. */
package edu.kit.kastel.sdq.artemis4j.grading.metajson;

import edu.kit.kastel.sdq.artemis4j.ArtemisClientException;

/**
 * Exception thrown when an error occurs during the mapping of annotations to
 * meta feedback and vice versa.
 */
public class AnnotationMappingException extends ArtemisClientException {
    public AnnotationMappingException(String message) {
        super(message);
    }

    public AnnotationMappingException(Throwable cause) {
        super(cause);
    }

    public AnnotationMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
