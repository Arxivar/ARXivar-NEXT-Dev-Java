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


import io.swagger.client.model.ScanResultDto;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssistantApi {
    private ApiClient apiClient;

    public AssistantApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AssistantApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for assistantBufferInsertForMonitoredFolder
     * @param bufferId Result information to scan (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assistantBufferInsertForMonitoredFolderCall(String bufferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Assistant/BufferInsertForMonitoredFolder/{bufferId}"
            .replaceAll("\\{" + "bufferId" + "\\}", apiClient.escapeString(bufferId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call assistantBufferInsertForMonitoredFolderValidateBeforeCall(String bufferId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'bufferId' is set
        if (bufferId == null) {
            throw new ApiException("Missing the required parameter 'bufferId' when calling assistantBufferInsertForMonitoredFolder(Async)");
        }
        

        com.squareup.okhttp.Call call = assistantBufferInsertForMonitoredFolderCall(bufferId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call notifies the specified user that a document has been added to buffer from monitored folder
     * 
     * @param bufferId Result information to scan (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void assistantBufferInsertForMonitoredFolder(String bufferId) throws ApiException {
        assistantBufferInsertForMonitoredFolderWithHttpInfo(bufferId);
    }

    /**
     * This call notifies the specified user that a document has been added to buffer from monitored folder
     * 
     * @param bufferId Result information to scan (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> assistantBufferInsertForMonitoredFolderWithHttpInfo(String bufferId) throws ApiException {
        com.squareup.okhttp.Call call = assistantBufferInsertForMonitoredFolderValidateBeforeCall(bufferId, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call notifies the specified user that a document has been added to buffer from monitored folder (asynchronously)
     * 
     * @param bufferId Result information to scan (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assistantBufferInsertForMonitoredFolderAsync(String bufferId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assistantBufferInsertForMonitoredFolderValidateBeforeCall(bufferId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for assistantDetected
     * @param connectionId Connection identifier (required)
     * @param version Version (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assistantDetectedCall(String connectionId, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Assistant";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (connectionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("connectionId", connectionId));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("version", version));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
    private com.squareup.okhttp.Call assistantDetectedValidateBeforeCall(String connectionId, String version, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new ApiException("Missing the required parameter 'connectionId' when calling assistantDetected(Async)");
        }
        

        com.squareup.okhttp.Call call = assistantDetectedCall(connectionId, version, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call notifies the specified user that the assistant is active
     * 
     * @param connectionId Connection identifier (required)
     * @param version Version (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void assistantDetected(String connectionId, String version) throws ApiException {
        assistantDetectedWithHttpInfo(connectionId, version);
    }

    /**
     * This call notifies the specified user that the assistant is active
     * 
     * @param connectionId Connection identifier (required)
     * @param version Version (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> assistantDetectedWithHttpInfo(String connectionId, String version) throws ApiException {
        com.squareup.okhttp.Call call = assistantDetectedValidateBeforeCall(connectionId, version, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call notifies the specified user that the assistant is active (asynchronously)
     * 
     * @param connectionId Connection identifier (required)
     * @param version Version (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assistantDetectedAsync(String connectionId, String version, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assistantDetectedValidateBeforeCall(connectionId, version, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for assistantNotifyProcessDocChange
     * @param processDocId Process document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assistantNotifyProcessDocChangeCall(Integer processDocId, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Assistant/UpdateProcessDoc/{processDocId}/TaskWork/{taskWorkId}"
            .replaceAll("\\{" + "processDocId" + "\\}", apiClient.escapeString(processDocId.toString()))
            .replaceAll("\\{" + "taskWorkId" + "\\}", apiClient.escapeString(taskWorkId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call assistantNotifyProcessDocChangeValidateBeforeCall(Integer processDocId, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processDocId' is set
        if (processDocId == null) {
            throw new ApiException("Missing the required parameter 'processDocId' when calling assistantNotifyProcessDocChange(Async)");
        }
        
        // verify the required parameter 'taskWorkId' is set
        if (taskWorkId == null) {
            throw new ApiException("Missing the required parameter 'taskWorkId' when calling assistantNotifyProcessDocChange(Async)");
        }
        

        com.squareup.okhttp.Call call = assistantNotifyProcessDocChangeCall(processDocId, taskWorkId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call notifies the specified user that a document has changed
     * 
     * @param processDocId Process document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void assistantNotifyProcessDocChange(Integer processDocId, Integer taskWorkId) throws ApiException {
        assistantNotifyProcessDocChangeWithHttpInfo(processDocId, taskWorkId);
    }

    /**
     * This call notifies the specified user that a document has changed
     * 
     * @param processDocId Process document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> assistantNotifyProcessDocChangeWithHttpInfo(Integer processDocId, Integer taskWorkId) throws ApiException {
        com.squareup.okhttp.Call call = assistantNotifyProcessDocChangeValidateBeforeCall(processDocId, taskWorkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call notifies the specified user that a document has changed (asynchronously)
     * 
     * @param processDocId Process document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assistantNotifyProcessDocChangeAsync(Integer processDocId, Integer taskWorkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assistantNotifyProcessDocChangeValidateBeforeCall(processDocId, taskWorkId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for assistantNotifyProfileChange
     * @param docNumber Document identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assistantNotifyProfileChangeCall(Integer docNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Assistant/UpdateProfile/{docNumber}"
            .replaceAll("\\{" + "docNumber" + "\\}", apiClient.escapeString(docNumber.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call assistantNotifyProfileChangeValidateBeforeCall(Integer docNumber, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'docNumber' is set
        if (docNumber == null) {
            throw new ApiException("Missing the required parameter 'docNumber' when calling assistantNotifyProfileChange(Async)");
        }
        

        com.squareup.okhttp.Call call = assistantNotifyProfileChangeCall(docNumber, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call notifies the specified user that a document has changed
     * 
     * @param docNumber Document identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void assistantNotifyProfileChange(Integer docNumber) throws ApiException {
        assistantNotifyProfileChangeWithHttpInfo(docNumber);
    }

    /**
     * This call notifies the specified user that a document has changed
     * 
     * @param docNumber Document identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> assistantNotifyProfileChangeWithHttpInfo(Integer docNumber) throws ApiException {
        com.squareup.okhttp.Call call = assistantNotifyProfileChangeValidateBeforeCall(docNumber, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call notifies the specified user that a document has changed (asynchronously)
     * 
     * @param docNumber Document identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assistantNotifyProfileChangeAsync(Integer docNumber, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assistantNotifyProfileChangeValidateBeforeCall(docNumber, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for assistantScanComplete
     * @param connectionId Connection identifier (required)
     * @param scanResultDto Result information to scan (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call assistantScanCompleteCall(String connectionId, ScanResultDto scanResultDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = scanResultDto;

        // create path and map variables
        String localVarPath = "/api/Assistant/ScanResult/{connectionId}"
            .replaceAll("\\{" + "connectionId" + "\\}", apiClient.escapeString(connectionId.toString()));

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
    private com.squareup.okhttp.Call assistantScanCompleteValidateBeforeCall(String connectionId, ScanResultDto scanResultDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new ApiException("Missing the required parameter 'connectionId' when calling assistantScanComplete(Async)");
        }
        
        // verify the required parameter 'scanResultDto' is set
        if (scanResultDto == null) {
            throw new ApiException("Missing the required parameter 'scanResultDto' when calling assistantScanComplete(Async)");
        }
        

        com.squareup.okhttp.Call call = assistantScanCompleteCall(connectionId, scanResultDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call notifies the specified user that a document has scanned
     * 
     * @param connectionId Connection identifier (required)
     * @param scanResultDto Result information to scan (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void assistantScanComplete(String connectionId, ScanResultDto scanResultDto) throws ApiException {
        assistantScanCompleteWithHttpInfo(connectionId, scanResultDto);
    }

    /**
     * This call notifies the specified user that a document has scanned
     * 
     * @param connectionId Connection identifier (required)
     * @param scanResultDto Result information to scan (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> assistantScanCompleteWithHttpInfo(String connectionId, ScanResultDto scanResultDto) throws ApiException {
        com.squareup.okhttp.Call call = assistantScanCompleteValidateBeforeCall(connectionId, scanResultDto, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call notifies the specified user that a document has scanned (asynchronously)
     * 
     * @param connectionId Connection identifier (required)
     * @param scanResultDto Result information to scan (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call assistantScanCompleteAsync(String connectionId, ScanResultDto scanResultDto, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = assistantScanCompleteValidateBeforeCall(connectionId, scanResultDto, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
