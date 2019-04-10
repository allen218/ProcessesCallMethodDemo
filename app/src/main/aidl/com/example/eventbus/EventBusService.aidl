// EventBusService.aidl
package com.example.eventbus;

// Declare any non-default types here with import statements
import com.example.eventbus.Request;
import com.example.eventbus.Responce;
interface EventBusService {
    Responce send(in Request request);
}
