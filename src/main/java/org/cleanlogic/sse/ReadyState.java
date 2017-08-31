package org.cleanlogic.sse;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum  ReadyState {
    /**
     * The connection is established
     */
    CONNECTING,
    /**
     * Connection is open, receiving events
     */
    OPEN,
    /**
     * The connection is not established, closed, or a fatal error occurred
     */
    CLOSE
}
