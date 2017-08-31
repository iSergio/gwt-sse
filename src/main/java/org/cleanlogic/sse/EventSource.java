package org.cleanlogic.sse;

import jsinterop.annotations.*;

/**
 * The EventSource interface is used to receive server-sent events. It connects to a server over HTTP and receives
 * events in text/event-stream format without closing the connection.
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "EventSource")
public class EventSource {
    /**
     * A number representing the state of the connection.
     */
    @JsProperty(name = "readyState")
    public final native ReadyState readyState();
    /**
     * URL of the source.
     */
    @JsProperty(name = "url")
    public final native String url();
    /**
     * A Boolean indicating whether the EventSource object was instantiated with CORS credentials set (true),
     * or not (false, the default).
     */
    @JsProperty(name = "withCredentials")
    public final native boolean withCredentials();
    /**
     * Is an EventHandler called when an error occurs and the error event is dispatched on an EventSource object.
     */
    @JsProperty(name = "onerror")
    public Listener onError;
    /**
     * Is an EventHandler called when a message event is received, that is when a message is coming from the source.
     */
    @JsProperty(name = "onmessage")
    public Listener onMessage;
    /**
     * Is an EventHandler called when an open event is received, that is when the connection was just opened.
     */
    @JsProperty(name = "onopen")
    public Listener onOpen;

    /**
     * The EventSource interface is used to receive server-sent events.
     * @param url url of the source
     */
    @JsConstructor
    public EventSource(String url) {}

    /**
     * The EventSource interface is used to receive server-sent events.
     * @param url url of the source
     * @param options {@link EventSourceOptions}
     */
    @JsConstructor
    public EventSource(String url, EventSourceOptions options) {}

    /**
     * Closes the connection, if any, and sets the readyState attribute to {@link ReadyState#CLOSE}.
     * If the connection is already closed, the method does nothing.
     */
    @JsMethod
    public native void close();

    /**
     * The EventTarget.addEventListener() method adds the specified EventListener-compatible object to the list of event
     * listeners for the specified event type on the EventTarget on which it is called. The event target may be an
     * Element in a document, the Document itself, a Window, or any other object that supports events (such as XMLHttpRequest).
     * @param type A string representing the event type to listen for.
     * @param listener The object which receives a notification (an object that implements the Event interface)
     *                 when an event of the specified type occurs.
     */
    @JsMethod
    public native void addEventListener(String type, Listener listener);

    /**
     * The EventTarget.addEventListener() method adds the specified EventListener-compatible object to the list of event
     * listeners for the specified event type on the EventTarget on which it is called. The event target may be an
     * Element in a document, the Document itself, a Window, or any other object that supports events (such as XMLHttpRequest).
     * @param type A string representing the event type to listen for.
     * @param listener The object which receives a notification (an object that implements the Event interface)
     *                 when an event of the specified type occurs.
     * @param useCapture A Boolean indicating that events of this type will be dispatched to the registered listener before
     *                   being dispatched to any EventTarget beneath it in the DOM tree.
     */
    @JsMethod
    public native void addEventListener(String type, Listener listener, boolean useCapture);

    /**
     * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously
     * registered with EventTarget.addEventListener().
     * @param type A string which specifies the type of event for which to remove an event.
     * @param listener The EventListener function of the event handler to remove from the event target.
     */
    @JsMethod
    public native void removeEventListener(String type, Listener listener);

    /**
     * The EventTarget.removeEventListener() method removes from the EventTarget an event listener previously
     * registered with EventTarget.addEventListener().
     * @param type A string which specifies the type of event for which to remove an event.
     * @param listener The EventListener function of the event handler to remove from the event target.
     * @param useCapture Specifies whether the EventListener to be removed is registered as a capturing listener or not.
     *                   If this parameter is absent, a default value of false is assumed.
     */
    @JsMethod
    public native void removeEventListener(String type, Listener listener, boolean useCapture);

    @JsFunction
    public interface Listener {
        void function(Event event);
    }
}
