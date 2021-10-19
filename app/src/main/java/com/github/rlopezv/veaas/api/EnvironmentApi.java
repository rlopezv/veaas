package com.github.rlopezv.veaas.api;


import java.util.Optional;

import javax.validation.Valid;

import com.github.rlopezv.veaas.api.model.EventList;
import com.github.rlopezv.veaas.api.model.InlineResponse200;
import com.github.rlopezv.veaas.api.model.InlineResponse2001;
import com.github.rlopezv.veaas.api.model.RepositoryManifestResponse;
import com.github.rlopezv.veaas.api.model.RevisionMetadata;
import com.github.rlopezv.veaas.api.model.RuntimeError;
import com.github.rlopezv.veaas.api.model.WorkSpace;
import com.github.rlopezv.veaas.api.model.WorkSpaceList;
import com.github.rlopezv.veaas.api.model.WorkSpaceManagedResourcesResponse;
import com.github.rlopezv.veaas.api.model.WorkSpaceResourceActionsListResponse;
import com.github.rlopezv.veaas.api.model.WorkSpaceSpec;
import com.github.rlopezv.veaas.api.model.WorkSpaceTree;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpacePatchRequest;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpaceResourceResponse;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpaceResponse;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpaceRollbackRequest;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpaceSyncRequest;
import com.github.rlopezv.veaas.api.model.WorkSpaceWorkSpaceSyncWindowsResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "environment", description = "Environment Service API")
public interface EnvironmentApi {
    

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST workspaces : Creates an workspace
     *
     * @param body  (required)
     * @param upsert update if already created (optional)
     * @param validate validates and execute a dry run (optional)
     * @return A successful response with the created workspace (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Creates an workspace", operationId = "workspaceServiceCreate",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response with the created workspace", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "workspaces",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServiceCreate(@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpace body,@Parameter(example = "update if already created") @Valid @RequestParam(value = "upsert", required = false) Boolean upsert,@Parameter(example = "validates and execute a dry run") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workspaceServiceCreate(body, upsert, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServiceCreate(WorkSpace body, Boolean upsert, Boolean validate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE workspaces/{name} : Delete deletes an workspace
     *
     * @param name  (required)
     * @param cascade  (optional)
     * @param propagationPolicy  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Deletes a workspace", operationId = "workspaceServiceDelete",  tags={ "WorkSpaceService" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "workspaces/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workspaceServiceDelete(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "cascade", required = false) Boolean cascade,@Parameter(example = "") @Valid @RequestParam(value = "propagationPolicy", required = false) String propagationPolicy) {
        return workspaceServiceDelete(name, cascade, propagationPolicy);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workspaceServiceDelete(String name, Boolean cascade, String propagationPolicy) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE workspaces/{name}/resource : DeleteResource deletes a single workspace resource
     *
     * @param name  (required)
     * @param namespace  (optional)
     * @param resourceName  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @param force  (optional)
     * @param orphan  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Deletes a single workspace resource", operationId = "workspaceServiceDeleteResource",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "workspaces/{name}/resources",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workspaceServiceDeleteResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "force", required = false) Boolean force,@Parameter(example = "") @Valid @RequestParam(value = "orphan", required = false) Boolean orphan) {
        return workspaceServiceDeleteResource(name, namespace, resourceName, version, group, kind, force, orphan);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workspaceServiceDeleteResource(String name, String namespace, String resourceName, String version, String group, String kind, Boolean force, Boolean orphan) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/resource/{resource}/logs : ResourceLogs returns stream of log entries for the specified resource.
     *
     * @param name  (required)
     * @param resource  (required)
     * @param namespace  (optional)
     * @param container  (optional)
     * @param sinceSeconds  (optional)
     * @param sinceTimeSeconds Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. (optional)
     * @param sinceTimeNanos Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context. (optional)
     * @param tailLines  (optional)
     * @param follow  (optional)
     * @param untilTime  (optional)
     * @param filter  (optional)
     * @param kind  (optional)
     * @param group  (optional)
     * @param resourceName  (optional)
     * @return A successful response.(streaming responses) (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns stream of log entries for the specified resource.", operationId = "workspaceServiceResourceLogs",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.(streaming responses)", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =   InlineResponse2001.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/resources/{resource}/logs",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse2001> _workspaceServiceResourceLogs(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "",required=true) @PathVariable("resource") String resource,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "container", required = false) String container,@Parameter(example = "") @Valid @RequestParam(value = "sinceSeconds", required = false) String sinceSeconds,@Parameter(example = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.") @Valid @RequestParam(value = "sinceTime.seconds", required = false) String sinceTimeSeconds,@Parameter(example = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.") @Valid @RequestParam(value = "sinceTime.nanos", required = false) Integer sinceTimeNanos,@Parameter(example = "") @Valid @RequestParam(value = "tailLines", required = false) String tailLines,@Parameter(example = "") @Valid @RequestParam(value = "follow", required = false) Boolean follow,@Parameter(example = "") @Valid @RequestParam(value = "untilTime", required = false) String untilTime,@Parameter(example = "") @Valid @RequestParam(value = "filter", required = false) String filter,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName) {
        return workspaceServiceResourceLogs(name, resource, namespace, container, sinceSeconds, sinceTimeSeconds, sinceTimeNanos, tailLines, follow, untilTime, filter, kind, group, resourceName);
    }

    // Override this method
    default  ResponseEntity<InlineResponse2001> workspaceServiceResourceLogs(String name, String resource, String namespace, String container, String sinceSeconds, String sinceTimeSeconds, Integer sinceTimeNanos, String tailLines, Boolean follow, String untilTime, String filter, String kind, String group, String resourceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name} : Get returns an workspace by name
     *
     * @param name the workspace&#39;s name (required)
     * @param refresh forces workspace reconciliation if set to true. (optional)
     * @param resourceVersion when specified with a watch call, shows changes that occur after that particular version of a resource. (optional)
     * @param selector the selector to to restrict returned list to workspaces only with matched labels. (optional)
     * @param repo the repoURL to restrict returned list workspaces. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns an workspace by name", operationId = "workspaceServiceGet",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServiceGet(@Parameter(example = "the workspace's name",required=true) @PathVariable("name") String name,@Parameter(example = "forces workspace reconciliation if set to true.") @Valid @RequestParam(value = "refresh", required = false) String refresh,@Parameter(example = "when specified with a watch call, shows changes that occur after that particular version of a resource.") @Valid @RequestParam(value = "resourceVersion", required = false) String resourceVersion,@Parameter(example = "the selector to to restrict returned list to workspaces only with matched labels.") @Valid @RequestParam(value = "selector", required = false) String selector,@Parameter(example = "the repoURL to restrict returned list workspaces.") @Valid @RequestParam(value = "repo", required = false) String repo) {
        return workspaceServiceGet(name, refresh, resourceVersion, selector, repo);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServiceGet(String name, String refresh, String resourceVersion, String selector, String repo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/manifests : GetManifests returns workspace manifests
     *
     * @param name  (required)
     * @param revision  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns workspace manifests", operationId = "workspaceServiceGetManifests",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryManifestResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/manifests",
        produces = { "application/json" }
    )
    default ResponseEntity<RepositoryManifestResponse> _workspaceServiceGetManifests(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "revision", required = false) String revision) {
        return workspaceServiceGetManifests(name, revision);
    }

    // Override this method
    default  ResponseEntity<RepositoryManifestResponse> workspaceServiceGetManifests(String name, String revision) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/resource : GetResource returns single workspace resource
     *
     * @param name  (required)
     * @param namespace  (optional)
     * @param resourceName  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns single workspace resource", operationId = "workspaceServiceGetResource",   tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResourceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/resources",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResourceResponse> _workspaceServiceGetResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workspaceServiceGetResource(name, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResourceResponse> workspaceServiceGetResource(String name, String namespace, String resourceName, String version, String group, String kind) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/syncwindows : Get returns sync windows of the workspace
     *
     * @param name  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get returns sync windows of the workspace", operationId = "workspaceServiceGetWorkSpaceSyncWindows",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceSyncWindowsResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/syncwindows",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceSyncWindowsResponse> _workspaceServiceGetWorkSpaceSyncWindows(@Parameter(example = "",required=true) @PathVariable("name") String name) {
        return workspaceServiceGetWorkSpaceSyncWindows(name);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceSyncWindowsResponse> workspaceServiceGetWorkSpaceSyncWindows(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces : Returns list of available workspaces. It supports parameters to limit the obtained results
     *
     * @param name the workspace&#39;s name. (optional)
     * @param refresh forces workspace reconciliation if set to true. (optional)
     * @param resourceVersion when specified with a watch call, shows changes that occur after that particular version of a resource. (optional)
     * @param selector the selector to restrict returned list to workspaces only with matched labels. (optional)
     * @param repo the repoURL to restrict returned list workspaces. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns list of available workspaces. It supports parameters to limit the obtained results", operationId = "workspaceServiceList",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceList> _workspaceServiceList(@Parameter(example = "the workspace's name.") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "forces workspace reconciliation if set to true.") @Valid @RequestParam(value = "refresh", required = false) String refresh,@Parameter(example = "when specified with a watch call, shows changes that occur after that particular version of a resource.") @Valid @RequestParam(value = "resourceVersion", required = false) String resourceVersion,@Parameter(example = "the selector to restrict returned list to workspaces only with matched labels.") @Valid @RequestParam(value = "selector", required = false) String selector,@Parameter(example = "the repoURL to restrict returned list workspaces.") @Valid @RequestParam(value = "repo", required = false) String repo) {
        return workspaceServiceList(name, refresh, resourceVersion, selector, repo);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceList> workspaceServiceList(String name, String refresh, String resourceVersion, String selector, String repo) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/resource/actions : Returns a list of resource actions
     *
     * @param name  (required)
     * @param namespace  (optional)
     * @param resourceName  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns a list of resource actions to complete on a resource", operationId = "workspaceServiceListResourceActions",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceResourceActionsListResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/resource/actions",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceResourceActionsListResponse> _workspaceServiceListResourceActions(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workspaceServiceListResourceActions(name, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceResourceActionsListResponse> workspaceServiceListResourceActions(String name, String namespace, String resourceName, String version, String group, String kind) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/events : ListResourceEvents returns a list of event resources
     *
     * @param name  (required)
     * @param resourceNamespace  (optional)
     * @param resourceName  (optional)
     * @param resourceUID  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns a list of recsource events", operationId = "workspaceServiceListResourceEvents",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  EventList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/events",
        produces = { "application/json" }
    )
    default ResponseEntity<EventList> _workspaceServiceListResourceEvents(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "resourceNamespace", required = false) String resourceNamespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "resourceUID", required = false) String resourceUID) {
        return workspaceServiceListResourceEvents(name, resourceNamespace, resourceName, resourceUID);
    }

    // Override this method
    default  ResponseEntity<EventList> workspaceServiceListResourceEvents(String name, String resourceNamespace, String resourceName, String resourceUID) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{workspaceName}/managed-resources : ManagedResources returns list of managed resources
     *
     * @param workspaceName  (required)
     * @param namespace  (optional)
     * @param name  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ManagedResources returns list of managed resources", operationId = "workspaceServiceManagedResources",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceManagedResourcesResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{workspaceName}/managed-resources",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceManagedResourcesResponse> _workspaceServiceManagedResources(@Parameter(example = "",required=true) @PathVariable("workspaceName") String workspaceName,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workspaceServiceManagedResources(workspaceName, namespace, name, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceManagedResourcesResponse> workspaceServiceManagedResources(String workspaceName, String namespace, String name, String version, String group, String kind) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH workspaces/{name} : Patch patch an workspace
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "patch an workspace", operationId = "workspaceServicePatch",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PatchMapping(
        value = "workspaces/{name}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServicePatch(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpacePatchRequest body) {
        return workspaceServicePatch(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServicePatch(String name, WorkSpaceWorkSpacePatchRequest body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST workspaces/{name}/resources : PatchResource patch single workspace resource
     *
     * @param name  (required)
     * @param body  (required)
     * @param namespace  (optional)
     * @param resourceName  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @param patchType  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "PatchResource patch single workspace resource", operationId = "workspaceServicePatchResource",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResourceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "workspaces/{name}/resources",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResourceResponse> _workspaceServicePatchResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody String body,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "patchType", required = false) String patchType) {
        return workspaceServicePatchResource(name, body, namespace, resourceName, version, group, kind, patchType);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResourceResponse> workspaceServicePatchResource(String name, String body, String namespace, String resourceName, String version, String group, String kind, String patchType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{workspaceName}/resource-tree : ResourceTree returns resource tree
     *
     * @param workspaceName  (required)
     * @param namespace  (optional)
     * @param name  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ResourceTree returns resource tree", operationId = "workspaceServiceResourceTree",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceTree.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{workspaceName}/resource-tree",
        produces = { "application/json" }
    )
    default ResponseEntity<WorkSpaceTree> _workspaceServiceResourceTree(@Parameter(example = "",required=true) @PathVariable("workspaceName") String workspaceName,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workspaceServiceResourceTree(workspaceName, namespace, name, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceTree> workspaceServiceResourceTree(String workspaceName, String namespace, String name, String version, String group, String kind) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/revisions/{revision}/metadata : Get the meta-data (author, date, tags, message) for a specific revision of the workspace
     *
     * @param name the workspace&#39;s name (required)
     * @param revision the revision of the app (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get the meta-data (author, date, tags, message) for a specific revision of the workspace", operationId = "workspaceServiceRevisionMetadata", tags={ "WorkSpaceService" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RevisionMetadata.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/revisions/{revision}/metadata",
        produces = { "application/json" }
    )
    default ResponseEntity<RevisionMetadata> _workspaceServiceRevisionMetadata(@Parameter(example = "the workspace's name",required=true) @PathVariable("name") String name,@Parameter(example = "the revision of the app",required=true) @PathVariable("revision") String revision) {
        return workspaceServiceRevisionMetadata(name, revision);
    }

    // Override this method
    default  ResponseEntity<RevisionMetadata> workspaceServiceRevisionMetadata(String name, String revision) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST workspaces/{name}/rollback : Rollback syncs an workspace to its target state
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Rollback syncs an workspace to its target state", operationId = "workspaceServiceRollback",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "workspaces/{name}/rollback",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServiceRollback(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpaceRollbackRequest body) {
        return workspaceServiceRollback(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServiceRollback(String name, WorkSpaceWorkSpaceRollbackRequest body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST workspaces/{name}/resource/actions : Run resource action
     *
     * @param name  (required)
     * @param body  (required)
     * @param namespace  (optional)
     * @param resourceName  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Run resource action", operationId = "workspaceServiceRunResourceAction",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "workspaces/{name}/resource/actions",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workspaceServiceRunResourceAction(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody String body,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workspaceServiceRunResourceAction(name, body, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workspaceServiceRunResourceAction(String name, String body, String namespace, String resourceName, String version, String group, String kind) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST workspaces/{name}/sync : syncs an workspace to its target state
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Syncs an workspace to its target state", operationId = "workspaceServiceSync", tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "workspaces/{name}/sync",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServiceSync(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpaceSyncRequest body) {
        return workspaceServiceSync(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServiceSync(String name, WorkSpaceWorkSpaceSyncRequest body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE workspaces/{name}/operation : Terminates the currently running operation
     *
     * @param name  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Terminates the currently running operation", operationId = "workspaceServiceTerminateOperation",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Object.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "workspaces/{name}/operation",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> _workspaceServiceTerminateOperation(@Parameter(example = "",required=true) @PathVariable("name") String name) {
        return workspaceServiceTerminateOperation(name);
    }

    // Override this method
    default  ResponseEntity<Object> workspaceServiceTerminateOperation(String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT workspaces/{name} : Update updates an workspace
     *
     * @param workspaceMetadataName Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. 
     * @param body  (required)
     * @param validate  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Updates an workspace", operationId = "workspaceServiceUpdate",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "workspaces/{name}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpace> _workspaceServiceUpdate(@Parameter(example = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated",required=true) @PathVariable("name") String workspaceMetadataName,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpace body,@Parameter(example = "") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workspaceServiceUpdate(workspaceMetadataName, body, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workspaceServiceUpdate(String workspaceMetadataName, WorkSpace body, Boolean validate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT workspaces/{name}/spec : UpdateSpec updates an workspace spec
     *
     * @param name  (required)
     * @param body  (required)
     * @param validate  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Updates an workspace spec", operationId = "workspaceServiceUpdateSpec",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceSpec.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "workspaces/{name}/spec",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<WorkSpaceSpec> _workspaceServiceUpdateSpec(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceSpec body,@Parameter(example = "") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workspaceServiceUpdateSpec(name, body, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceSpec> workspaceServiceUpdateSpec(String name, WorkSpaceSpec body, Boolean validate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET workspaces/{name}/logs : Returns stream of log entries for the specified workspace
     *
     * @param name  (required)
     * @param namespace  (optional)
     * @param podName  (optional)
     * @param container  (optional)
     * @param sinceSeconds  (optional)
     * @param sinceTimeSeconds Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. (optional)
     * @param sinceTimeNanos Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context. (optional)
     * @param tailLines  (optional)
     * @param follow  (optional)
     * @param untilTime  (optional)
     * @param filter  (optional)
     * @param kind  (optional)
     * @param group  (optional)
     * @param resourceName  (optional)
     * @return A successful response.(streaming responses) (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns stream of log entries for the specified workspace", operationId = "workspaceServiceWorkSpaceLogs",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.(streaming responses)", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  InlineResponse200.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "workspaces/{name}/logs",
        produces = { "application/json" }
    )
    default ResponseEntity<InlineResponse200> _workspaceServiceWorkSpaceLogs(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "podName", required = false) String podName,@Parameter(example = "") @Valid @RequestParam(value = "container", required = false) String container,@Parameter(example = "") @Valid @RequestParam(value = "sinceSeconds", required = false) String sinceSeconds,@Parameter(example = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.") @Valid @RequestParam(value = "sinceTime.seconds", required = false) String sinceTimeSeconds,@Parameter(example = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.") @Valid @RequestParam(value = "sinceTime.nanos", required = false) Integer sinceTimeNanos,@Parameter(example = "") @Valid @RequestParam(value = "tailLines", required = false) String tailLines,@Parameter(example = "") @Valid @RequestParam(value = "follow", required = false) Boolean follow,@Parameter(example = "") @Valid @RequestParam(value = "untilTime", required = false) String untilTime,@Parameter(example = "") @Valid @RequestParam(value = "filter", required = false) String filter,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName) {
        return workspaceServiceWorkSpaceLogs(name, namespace, podName, container, sinceSeconds, sinceTimeSeconds, sinceTimeNanos, tailLines, follow, untilTime, filter, kind, group, resourceName);
    }

    // Override this method
    default  ResponseEntity<InlineResponse200> workspaceServiceWorkSpaceLogs(String name, String namespace, String podName, String container, String sinceSeconds, String sinceTimeSeconds, Integer sinceTimeNanos, String tailLines, Boolean follow, String untilTime, String filter, String kind, String group, String resourceName) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf(""))) {
                    String exampleString = "";
                    ApiUtil.setExampleResponse(request, "", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
