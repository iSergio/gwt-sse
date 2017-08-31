# GWT Server-Send Event (SSE)(EventSource) Wrapper
Server-Send Event (EventSource) GWT wrapper based on JsInterop.

Features:
 - [x] Simple realization
 - [x] Simple usage
 - [x] Full functional
 
## Getting Started
```
mvn -U clean install
```

## Usage
```
EventSource sse = new EventSource("/services/sse");
sse.onOpen = new EventSource.Listener() {
    @Override
    public void function(org.cleanlogic.sse.Event event) {
        GWT.log("Open: " + event.target.readyState());
    }
};
sse.onError = new EventSource.Listener() {
    @Override
    public void function(org.cleanlogic.sse.Event event) {
        GWT.log("Error: " + event.target.readyState());
    }
};
sse.onMessage = new EventSource.Listener() {
    @Override
    public void function(org.cleanlogic.sse.Event event) {
        GWT.log("message: " + event.data);
    }
};
sse.addEventListener("status", new EventSource.Listener() {
    @Override
    public void function(org.cleanlogic.sse.Event event) {
        GWT.log("status: " + event.data);
    }
});
```