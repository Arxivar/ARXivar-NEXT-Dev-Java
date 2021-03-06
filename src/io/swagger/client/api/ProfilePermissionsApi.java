/*
 * Abletech.Arxivar.Server.WebApi.Services
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.SingleProfilePermissionsDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfilePermissionsApi {
    private ApiClient apiClient;

    public ProfilePermissionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProfilePermissionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for profilePermissionsGetPermissionByDocNumber
     * @param docnumber Document Identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call profilePermissionsGetPermissionByDocNumberCall(Integer docnumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/ProfilePermissions/{docnumber}"
            .replaceAll("\\{" + "docnumber" + "\\}", apiClient.escapeString(docnumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call profilePermissionsGetPermissionByDocNumberValidateBeforeCall(Integer docnumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'docnumber' is set
        if (docnumber == null) {
            throw new ApiException("Missing the required parameter 'docnumber' when calling profilePermissionsGetPermissionByDocNumber(Async)");
        }
        

        com.squareup.okhttp.Call call = profilePermissionsGetPermissionByDocNumberCall(docnumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call returns all additional or exclusive permissions by document identifier
     * 
     * @param docnumber Document Identifier (required)
     * @return SingleProfilePermissionsDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleProfilePermissionsDTO profilePermissionsGetPermissionByDocNumber(Integer docnumber) throws ApiException {
        ApiResponse<SingleProfilePermissionsDTO> resp = profilePermissionsGetPermissionByDocNumberWithHttpInfo(docnumber);
        return resp.getData();
    }

    /**
     * This call returns all additional or exclusive permissions by document identifier
     * 
     * @param docnumber Document Identifier (required)
     * @return ApiResponse&lt;SingleProfilePermissionsDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleProfilePermissionsDTO> profilePermissionsGetPermissionByDocNumberWithHttpInfo(Integer docnumber) throws ApiException {
        com.squareup.okhttp.Call call = profilePermissionsGetPermissionByDocNumberValidateBeforeCall(docnumber, null, null);
        Type localVarReturnType = new TypeToken<SingleProfilePermissionsDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This call returns all additional or exclusive permissions by document identifier (asynchronously)
     * 
     * @param docnumber Document Identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call profilePermissionsGetPermissionByDocNumberAsync(Integer docnumber, final ApiCallback<SingleProfilePermissionsDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = profilePermissionsGetPermissionByDocNumberValidateBeforeCall(docnumber, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleProfilePermissionsDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for profilePermissionsSetPermission
     * @param docnumber Document Identifier (required)
     * @param permissions Permissions to save (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call profilePermissionsSetPermissionCall(Integer docnumber, SingleProfilePermissionsDTO permissions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = permissions;

        // create path and map variables
        String localVarPath = "/api/ProfilePermissions/{docnumber}/Permissions"
            .replaceAll("\\{" + "docnumber" + "\\}", apiClient.escapeString(docnumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call profilePermissionsSetPermissionValidateBeforeCall(Integer docnumber, SingleProfilePermissionsDTO permissions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'docnumber' is set
        if (docnumber == null) {
            throw new ApiException("Missing the required parameter 'docnumber' when calling profilePermissionsSetPermission(Async)");
        }
        
        // verify the required parameter 'permissions' is set
        if (permissions == null) {
            throw new ApiException("Missing the required parameter 'permissions' when calling profilePermissionsSetPermission(Async)");
        }
        

        com.squareup.okhttp.Call call = profilePermissionsSetPermissionCall(docnumber, permissions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call save all additional or exclusive permissions
     * 
     * @param docnumber Document Identifier (required)
     * @param permissions Permissions to save (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void profilePermissionsSetPermission(Integer docnumber, SingleProfilePermissionsDTO permissions) throws ApiException {
        profilePermissionsSetPermissionWithHttpInfo(docnumber, permissions);
    }

    /**
     * This call save all additional or exclusive permissions
     * 
     * @param docnumber Document Identifier (required)
     * @param permissions Permissions to save (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> profilePermissionsSetPermissionWithHttpInfo(Integer docnumber, SingleProfilePermissionsDTO permissions) throws ApiException {
        com.squareup.okhttp.Call call = profilePermissionsSetPermissionValidateBeforeCall(docnumber, permissions, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call save all additional or exclusive permissions (asynchronously)
     * 
     * @param docnumber Document Identifier (required)
     * @param permissions Permissions to save (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call profilePermissionsSetPermissionAsync(Integer docnumber, SingleProfilePermissionsDTO permissions, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = profilePermissionsSetPermissionValidateBeforeCall(docnumber, permissions, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
