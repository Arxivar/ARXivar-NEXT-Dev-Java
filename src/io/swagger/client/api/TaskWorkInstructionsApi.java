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


import io.swagger.client.model.TaskWorkInstructionDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskWorkInstructionsApi {
    private ApiClient apiClient;

    public TaskWorkInstructionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskWorkInstructionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for taskWorkInstructionsGetInstructionsByTaskWorkId
     * @param taskWorkId Taskwork identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call taskWorkInstructionsGetInstructionsByTaskWorkIdCall(Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/TaskInstructions/byTaskWorkId/{taskWorkId}"
            .replaceAll("\\{" + "taskWorkId" + "\\}", apiClient.escapeString(taskWorkId.toString()));

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
    private com.squareup.okhttp.Call taskWorkInstructionsGetInstructionsByTaskWorkIdValidateBeforeCall(Integer taskWorkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'taskWorkId' is set
        if (taskWorkId == null) {
            throw new ApiException("Missing the required parameter 'taskWorkId' when calling taskWorkInstructionsGetInstructionsByTaskWorkId(Async)");
        }
        

        com.squareup.okhttp.Call call = taskWorkInstructionsGetInstructionsByTaskWorkIdCall(taskWorkId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * This call returns the instruction of taskwork
     * 
     * @param taskWorkId Taskwork identifier (required)
     * @return TaskWorkInstructionDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TaskWorkInstructionDTO taskWorkInstructionsGetInstructionsByTaskWorkId(Integer taskWorkId) throws ApiException {
        ApiResponse<TaskWorkInstructionDTO> resp = taskWorkInstructionsGetInstructionsByTaskWorkIdWithHttpInfo(taskWorkId);
        return resp.getData();
    }

    /**
     * This call returns the instruction of taskwork
     * 
     * @param taskWorkId Taskwork identifier (required)
     * @return ApiResponse&lt;TaskWorkInstructionDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TaskWorkInstructionDTO> taskWorkInstructionsGetInstructionsByTaskWorkIdWithHttpInfo(Integer taskWorkId) throws ApiException {
        com.squareup.okhttp.Call call = taskWorkInstructionsGetInstructionsByTaskWorkIdValidateBeforeCall(taskWorkId, null, null);
        Type localVarReturnType = new TypeToken<TaskWorkInstructionDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * This call returns the instruction of taskwork (asynchronously)
     * 
     * @param taskWorkId Taskwork identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call taskWorkInstructionsGetInstructionsByTaskWorkIdAsync(Integer taskWorkId, final ApiCallback<TaskWorkInstructionDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = taskWorkInstructionsGetInstructionsByTaskWorkIdValidateBeforeCall(taskWorkId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TaskWorkInstructionDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}