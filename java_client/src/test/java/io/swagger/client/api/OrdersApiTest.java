/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Body;
import io.swagger.client.model.EarnSubmission;
import io.swagger.client.model.Error;
import io.swagger.client.model.ExternalOrderRequest;
import io.swagger.client.model.OpenOrder;
import io.swagger.client.model.Order;
import io.swagger.client.model.OrderList;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for OrdersApi
 */
@Ignore
public class OrdersApiTest {

    private final OrdersApi api = new OrdersApi();

    
    /**
     * cancel an order
     *
     * cancel an order - this can be called only before an order is submitted
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelOrderTest() throws ApiException {
        
        String orderId = null;
        
        String X_REQUEST_ID = null;
        
        api.cancelOrder(orderId, X_REQUEST_ID);

        // TODO: test validations
    }
    
    /**
     * change an order
     *
     * change an order, currently the error can be changed (set) this in turn will convert this submitted order to a failed order. this gives the client an endpoint to report an internal error. you can only change an order that is in pending state. a failed order can always turn completed in case the order_id successfully appears in the blockchain. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeOrderTest() throws ApiException {
        
        String orderId = null;
        
        String X_REQUEST_ID = null;
        
        Body body = null;
        
        Order response = api.changeOrder(orderId, X_REQUEST_ID, body);

        // TODO: test validations
    }
    
    /**
     * create an external order for a native offer
     *
     * create an external order for a native offer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExternalOrderTest() throws ApiException {
        
        ExternalOrderRequest externalorderrequest = null;
        
        String X_REQUEST_ID = null;
        
        OpenOrder response = api.createExternalOrder(externalorderrequest, X_REQUEST_ID);

        // TODO: test validations
    }
    
    /**
     * create an order for an offer
     *
     * create an order for an offer
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrderTest() throws ApiException {
        
        String offerId = null;
        
        String X_REQUEST_ID = null;
        
        OpenOrder response = api.createOrder(offerId, X_REQUEST_ID);

        // TODO: test validations
    }
    
    /**
     * get user order history
     *
     * get user order history
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoryTest() throws ApiException {
        
        String X_REQUEST_ID = null;
        
        Integer limit = null;
        
        String before = null;
        
        String after = null;
        
        OrderList response = api.getHistory(X_REQUEST_ID, limit, before, after);

        // TODO: test validations
    }
    
    /**
     * get an order
     *
     * get an order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrderTest() throws ApiException {
        
        String orderId = null;
        
        String X_REQUEST_ID = null;
        
        Order response = api.getOrder(orderId, X_REQUEST_ID);

        // TODO: test validations
    }
    
    /**
     * submit an order
     *
     * submit an order
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitOrderTest() throws ApiException {
        
        String orderId = null;
        
        String X_REQUEST_ID = null;
        
        EarnSubmission earnsubmission = null;
        
        Order response = api.submitOrder(orderId, X_REQUEST_ID, earnsubmission);

        // TODO: test validations
    }
    
}
