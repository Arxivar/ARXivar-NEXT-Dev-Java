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


import io.swagger.client.model.RowSearchResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWorkAttachmentsApi {
    private ApiClient apiClient;

    public TaskWorkAttachmentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskWorkAttachmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for taskWorkAttachmentsAddNewExternalAttachments
     * @param bufferId Identifier of the buffer file (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsAddNewExternalAttachmentsCall(String bufferId, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskAttachments/bytaskwork/{taskWorkId}/external/{bufferId}"
            .replaceAll("\\{" + "bufferId" + "\\}", apiClient.escapeString(bufferId.toString()))
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call taskWorkAttachmentsAddNewExternalAttachmentsValidateBeforeCall(String bufferId, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'bufferId' is set
        if (bufferId == null) {
            throw new ApiException("Missing the required parameter 'bufferId' when calling taskWorkAttachmentsAddNewExternalAttachments(Async)");
        }
        
        // verify the required parameter 'taskWorkId' is set
        if (taskWorkId == null) {
            throw new ApiException("Missing the required parameter 'taskWorkId' when calling taskWorkAttachmentsAddNewExternalAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewExternalAttachmentsCall(bufferId, taskWorkId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call adds a new external attachment to a process
     * 
     * @param bufferId Identifier of the buffer file (required)
     * @param taskWorkId Taskwork identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void taskWorkAttachmentsAddNewExternalAttachments(String bufferId, Integer taskWorkId) throws ApiException {
        taskWorkAttachmentsAddNewExternalAttachmentsWithHttpInfo(bufferId, taskWorkId);
    }

    /**
     * This call adds a new external attachment to a process
     * 
     * @param bufferId Identifier of the buffer file (required)
     * @param taskWorkId Taskwork identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> taskWorkAttachmentsAddNewExternalAttachmentsWithHttpInfo(String bufferId, Integer taskWorkId) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewExternalAttachmentsValidateBeforeCall(bufferId, taskWorkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call adds a new external attachment to a process (asynchronously)
     * 
     * @param bufferId Identifier of the buffer file (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsAddNewExternalAttachmentsAsync(String bufferId, Integer taskWorkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewExternalAttachmentsValidateBeforeCall(bufferId, taskWorkId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for taskWorkAttachmentsAddNewInternalAttachments
     * @param docnumber Document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsAddNewInternalAttachmentsCall(Integer docnumber, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskAttachments/bytaskwork/{taskWorkId}/internal/{docnumber}"
            .replaceAll("\\{" + "docnumber" + "\\}", apiClient.escapeString(docnumber.toString()))
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call taskWorkAttachmentsAddNewInternalAttachmentsValidateBeforeCall(Integer docnumber, Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'docnumber' is set
        if (docnumber == null) {
            throw new ApiException("Missing the required parameter 'docnumber' when calling taskWorkAttachmentsAddNewInternalAttachments(Async)");
        }
        
        // verify the required parameter 'taskWorkId' is set
        if (taskWorkId == null) {
            throw new ApiException("Missing the required parameter 'taskWorkId' when calling taskWorkAttachmentsAddNewInternalAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewInternalAttachmentsCall(docnumber, taskWorkId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call adds a new internal attachments to a process
     * 
     * @param docnumber Document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void taskWorkAttachmentsAddNewInternalAttachments(Integer docnumber, Integer taskWorkId) throws ApiException {
        taskWorkAttachmentsAddNewInternalAttachmentsWithHttpInfo(docnumber, taskWorkId);
    }

    /**
     * This call adds a new internal attachments to a process
     * 
     * @param docnumber Document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> taskWorkAttachmentsAddNewInternalAttachmentsWithHttpInfo(Integer docnumber, Integer taskWorkId) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewInternalAttachmentsValidateBeforeCall(docnumber, taskWorkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call adds a new internal attachments to a process (asynchronously)
     * 
     * @param docnumber Document identifier (required)
     * @param taskWorkId Taskwork identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsAddNewInternalAttachmentsAsync(Integer docnumber, Integer taskWorkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkAttachmentsAddNewInternalAttachmentsValidateBeforeCall(docnumber, taskWorkId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for taskWorkAttachmentsChangeToSendForTaskAttachments
     * @param attachmentId Attachment identifier (required)
     * @param tosend Value of &#39;to send&#39; flag (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsChangeToSendForTaskAttachmentsCall(Integer attachmentId, Boolean tosend, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskAttachments/{attachmentId}/tosend/{tosend}"
            .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()))
            .replaceAll("\\{" + "tosend" + "\\}", apiClient.escapeString(tosend.toString()));

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
    private com.squareup.okhttp.Call taskWorkAttachmentsChangeToSendForTaskAttachmentsValidateBeforeCall(Integer attachmentId, Boolean tosend, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new ApiException("Missing the required parameter 'attachmentId' when calling taskWorkAttachmentsChangeToSendForTaskAttachments(Async)");
        }
        
        // verify the required parameter 'tosend' is set
        if (tosend == null) {
            throw new ApiException("Missing the required parameter 'tosend' when calling taskWorkAttachmentsChangeToSendForTaskAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkAttachmentsChangeToSendForTaskAttachmentsCall(attachmentId, tosend, progressListener, progressRequestListener);
        return call;

    }

    /**
     * this call changes the value of the &#39;to send&#39; flag for an attachment
     * 
     * @param attachmentId Attachment identifier (required)
     * @param tosend Value of &#39;to send&#39; flag (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void taskWorkAttachmentsChangeToSendForTaskAttachments(Integer attachmentId, Boolean tosend) throws ApiException {
        taskWorkAttachmentsChangeToSendForTaskAttachmentsWithHttpInfo(attachmentId, tosend);
    }

    /**
     * this call changes the value of the &#39;to send&#39; flag for an attachment
     * 
     * @param attachmentId Attachment identifier (required)
     * @param tosend Value of &#39;to send&#39; flag (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> taskWorkAttachmentsChangeToSendForTaskAttachmentsWithHttpInfo(Integer attachmentId, Boolean tosend) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkAttachmentsChangeToSendForTaskAttachmentsValidateBeforeCall(attachmentId, tosend, null, null);
        return apiClient.execute(call);
    }

    /**
     * this call changes the value of the &#39;to send&#39; flag for an attachment (asynchronously)
     * 
     * @param attachmentId Attachment identifier (required)
     * @param tosend Value of &#39;to send&#39; flag (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsChangeToSendForTaskAttachmentsAsync(Integer attachmentId, Boolean tosend, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkAttachmentsChangeToSendForTaskAttachmentsValidateBeforeCall(attachmentId, tosend, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for taskWorkAttachmentsDeleteTaskAttachementById
     * @param attachmentId Attachment identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsDeleteTaskAttachementByIdCall(Integer attachmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskAttachments/{attachmentId}"
            .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call taskWorkAttachmentsDeleteTaskAttachementByIdValidateBeforeCall(Integer attachmentId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'attachmentId' is set
        if (attachmentId == null) {
            throw new ApiException("Missing the required parameter 'attachmentId' when calling taskWorkAttachmentsDeleteTaskAttachementById(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkAttachmentsDeleteTaskAttachementByIdCall(attachmentId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call deletes a process attachment
     * 
     * @param attachmentId Attachment identifier (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void taskWorkAttachmentsDeleteTaskAttachementById(Integer attachmentId) throws ApiException {
        taskWorkAttachmentsDeleteTaskAttachementByIdWithHttpInfo(attachmentId);
    }

    /**
     * This call deletes a process attachment
     * 
     * @param attachmentId Attachment identifier (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> taskWorkAttachmentsDeleteTaskAttachementByIdWithHttpInfo(Integer attachmentId) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkAttachmentsDeleteTaskAttachementByIdValidateBeforeCall(attachmentId, null, null);
        return apiClient.execute(call);
    }

    /**
     * This call deletes a process attachment (asynchronously)
     * 
     * @param attachmentId Attachment identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsDeleteTaskAttachementByIdAsync(Integer attachmentId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkAttachmentsDeleteTaskAttachementByIdValidateBeforeCall(attachmentId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for taskWorkAttachmentsGetAttachmentsByProcessId
     * @param processId Process identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsGetAttachmentsByProcessIdCall(Integer processId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskAttachments/byprocessid/{processId}"
            .replaceAll("\\{" + "processId" + "\\}", apiClient.escapeString(processId.toString()));

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
    private com.squareup.okhttp.Call taskWorkAttachmentsGetAttachmentsByProcessIdValidateBeforeCall(Integer processId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'processId' is set
        if (processId == null) {
            throw new ApiException("Missing the required parameter 'processId' when calling taskWorkAttachmentsGetAttachmentsByProcessId(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkAttachmentsGetAttachmentsByProcessIdCall(processId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call returns all attachments of a process
     * 
     * @param processId Process identifier (required)
     * @return List&lt;RowSearchResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<RowSearchResult> taskWorkAttachmentsGetAttachmentsByProcessId(Integer processId) throws ApiException {
        ApiResponse<List<RowSearchResult>> resp = taskWorkAttachmentsGetAttachmentsByProcessIdWithHttpInfo(processId);
        return resp.getData();
    }

    /**
     * This call returns all attachments of a process
     * 
     * @param processId Process identifier (required)
     * @return ApiResponse&lt;List&lt;RowSearchResult&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<RowSearchResult>> taskWorkAttachmentsGetAttachmentsByProcessIdWithHttpInfo(Integer processId) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkAttachmentsGetAttachmentsByProcessIdValidateBeforeCall(processId, null, null);
        Type localVarReturnType = new TypeToken<List<RowSearchResult>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This call returns all attachments of a process (asynchronously)
     * 
     * @param processId Process identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkAttachmentsGetAttachmentsByProcessIdAsync(Integer processId, final ApiCallback<List<RowSearchResult>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkAttachmentsGetAttachmentsByProcessIdValidateBeforeCall(processId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<RowSearchResult>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
