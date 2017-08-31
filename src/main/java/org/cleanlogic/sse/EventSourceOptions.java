package org.cleanlogic.sse;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Options for {@link EventSource}
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class EventSourceOptions {
    /**
     * A Boolean indicating whether the EventSource object was instantiated with CORS credentials set (true),
     * or not (false, the default).
     */
    @JsProperty
    public boolean withCredentials;

    @JsConstructor
    public EventSourceOptions(boolean withCredentials) {}
}
