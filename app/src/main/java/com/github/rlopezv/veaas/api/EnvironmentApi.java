package com.github.rlopezv.veaas.api;


import java.util.Optional;

import javax.validation.Valid;

import com.github.rlopezv.veaas.api.model.InlineResponse200;
import com.github.rlopezv.veaas.api.model.InlineResponse2001;
import com.github.rlopezv.veaas.api.model.RepositoryManifestResponse;
import com.github.rlopezv.veaas.api.model.RuntimeError;
import com.github.rlopezv.veaas.api.model.EventList;
import com.github.rlopezv.veaas.api.model.RevisionMetadata;
import com.github.rlopezv.veaas.api.model.WorkSpace;
import com.github.rlopezv.veaas.api.model.WorkSpaceList;
import com.github.rlopezv.veaas.api.model.WorkSpaceSpec;
import com.github.rlopezv.veaas.api.model.WorkSpaceTree;
import com.github.rlopezv.veaas.api.model.WorkSpaceManagedResourcesResponse;
import com.github.rlopezv.veaas.api.model.WorkSpaceResourceActionsListResponse;
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

@Tag(name = "Environment", description = "Environment Service API")
public interface EnvironmentApi {
    

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api//workSpaces : Creates an workSpace
     *
     * @param body  (required)
     * @param upsert update if already created (optional)
     * @param validate validates and execute a dry run (optional)
     * @return A successful response with the created workSpace (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Creates an workSpace", operationId = "workSpaceServiceCreate",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response with the created workSpace", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//workSpaces",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServiceCreate(@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpace body,@Parameter(example = "update if already created") @Valid @RequestParam(value = "upsert", required = false) Boolean upsert,@Parameter(example = "validates and execute a dry run") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workSpaceServiceCreate(body, upsert, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServiceCreate(WorkSpace body, Boolean upsert, Boolean validate) {
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
     * DELETE /api//workSpaces/{name} : Delete deletes an workSpace
     *
     * @param name  (required)
     * @param cascade  (optional)
     * @param propagationPolicy  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Delete deletes an workSpace", operationId = "workSpaceServiceDelete",  tags={ "WorkSpaceService" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "/api//workSpaces/{name}",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workSpaceServiceDelete(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "cascade", required = false) Boolean cascade,@Parameter(example = "") @Valid @RequestParam(value = "propagationPolicy", required = false) String propagationPolicy) {
        return workSpaceServiceDelete(name, cascade, propagationPolicy);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workSpaceServiceDelete(String name, Boolean cascade, String propagationPolicy) {
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
     * DELETE /api//workSpaces/{name}/resource : DeleteResource deletes a single workSpace resource
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
    @Operation(summary = "Deletes a single workSpace resource", operationId = "workSpaceServiceDeleteResource",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "/api//workSpaces/{name}/resource",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workSpaceServiceDeleteResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "force", required = false) Boolean force,@Parameter(example = "") @Valid @RequestParam(value = "orphan", required = false) Boolean orphan) {
        return workSpaceServiceDeleteResource(name, namespace, resourceName, version, group, kind, force, orphan);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workSpaceServiceDeleteResource(String name, String namespace, String resourceName, String version, String group, String kind, Boolean force, Boolean orphan) {
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
     * GET /api//workSpaces/{name}/device/{resource}/logs : DeviceLogs returns stream of log entries for the specified device.
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
    @Operation(summary = "DeviceLogs returns stream of log entries for the specified device.", operationId = "workSpaceServiceDeviceLogs",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.(streaming responses)", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =   InlineResponse2001.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/device/{resource}/logs",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<InlineResponse2001> _workSpaceServiceDeviceLogs(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "",required=true) @PathVariable("resource") String resource,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "container", required = false) String container,@Parameter(example = "") @Valid @RequestParam(value = "sinceSeconds", required = false) String sinceSeconds,@Parameter(example = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.") @Valid @RequestParam(value = "sinceTime.seconds", required = false) String sinceTimeSeconds,@Parameter(example = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.") @Valid @RequestParam(value = "sinceTime.nanos", required = false) Integer sinceTimeNanos,@Parameter(example = "") @Valid @RequestParam(value = "tailLines", required = false) String tailLines,@Parameter(example = "") @Valid @RequestParam(value = "follow", required = false) Boolean follow,@Parameter(example = "") @Valid @RequestParam(value = "untilTime", required = false) String untilTime,@Parameter(example = "") @Valid @RequestParam(value = "filter", required = false) String filter,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName) {
        return workSpaceServiceDeviceLogs(name, resource, namespace, container, sinceSeconds, sinceTimeSeconds, sinceTimeNanos, tailLines, follow, untilTime, filter, kind, group, resourceName);
    }

    // Override this method
    default  ResponseEntity<InlineResponse2001> workSpaceServiceDeviceLogs(String name, String resource, String namespace, String container, String sinceSeconds, String sinceTimeSeconds, Integer sinceTimeNanos, String tailLines, Boolean follow, String untilTime, String filter, String kind, String group, String resourceName) {
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
     * GET /api//workSpaces/{name} : Get returns an workSpace by name
     *
     * @param name the workSpace&#39;s name (required)
     * @param refresh forces workSpace reconciliation if set to true. (optional)
     * @param resourceVersion when specified with a watch call, shows changes that occur after that particular version of a resource. (optional)
     * @param selector the selector to to restrict returned list to workSpaces only with matched labels. (optional)
     * @param repo the repoURL to restrict returned list workSpaces. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get returns an workSpace by name", operationId = "workSpaceServiceGet",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServiceGet(@Parameter(example = "the workSpace's name",required=true) @PathVariable("name") String name,@Parameter(example = "forces workSpace reconciliation if set to true.") @Valid @RequestParam(value = "refresh", required = false) String refresh,@Parameter(example = "when specified with a watch call, shows changes that occur after that particular version of a resource.") @Valid @RequestParam(value = "resourceVersion", required = false) String resourceVersion,@Parameter(example = "the selector to to restrict returned list to workSpaces only with matched labels.") @Valid @RequestParam(value = "selector", required = false) String selector,@Parameter(example = "the repoURL to restrict returned list workSpaces.") @Valid @RequestParam(value = "repo", required = false) String repo) {
        return workSpaceServiceGet(name, refresh, resourceVersion, selector, repo);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServiceGet(String name, String refresh, String resourceVersion, String selector, String repo) {
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
     * GET /api//workSpaces/{name}/manifests : GetManifests returns workSpace manifests
     *
     * @param name  (required)
     * @param revision  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "GetManifests returns workSpace manifests", operationId = "workSpaceServiceGetManifests",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryManifestResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/manifests",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<RepositoryManifestResponse> _workSpaceServiceGetManifests(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "revision", required = false) String revision) {
        return workSpaceServiceGetManifests(name, revision);
    }

    // Override this method
    default  ResponseEntity<RepositoryManifestResponse> workSpaceServiceGetManifests(String name, String revision) {
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
     * GET /api//workSpaces/{name}/resource : GetResource returns single workSpace resource
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
    @Operation(summary = "GetResource returns single workSpace resource", operationId = "workSpaceServiceGetResource",   tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResourceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/resource",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResourceResponse> _workSpaceServiceGetResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workSpaceServiceGetResource(name, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResourceResponse> workSpaceServiceGetResource(String name, String namespace, String resourceName, String version, String group, String kind) {
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
     * GET /api//workSpaces/{name}/syncwindows : Get returns sync windows of the workSpace
     *
     * @param name  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get returns sync windows of the workSpace", operationId = "workSpaceServiceGetWorkSpaceSyncWindows",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceSyncWindowsResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/syncwindows",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceSyncWindowsResponse> _workSpaceServiceGetWorkSpaceSyncWindows(@Parameter(example = "",required=true) @PathVariable("name") String name) {
        return workSpaceServiceGetWorkSpaceSyncWindows(name);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceSyncWindowsResponse> workSpaceServiceGetWorkSpaceSyncWindows(String name) {
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
     * GET /api//workSpaces : Returns list of available workSpaces. It supports parameters to limit the obtained results
     *
     * @param name the workSpace&#39;s name. (optional)
     * @param refresh forces workSpace reconciliation if set to true. (optional)
     * @param resourceVersion when specified with a watch call, shows changes that occur after that particular version of a resource. (optional)
     * @param selector the selector to restrict returned list to workSpaces only with matched labels. (optional)
     * @param repo the repoURL to restrict returned list workSpaces. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Returns list of available workSpaces. It supports parameters to limit the obtained results", operationId = "workSpaceServiceList",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceList> _workSpaceServiceList(@Parameter(example = "the workSpace's name.") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "forces workSpace reconciliation if set to true.") @Valid @RequestParam(value = "refresh", required = false) String refresh,@Parameter(example = "when specified with a watch call, shows changes that occur after that particular version of a resource.") @Valid @RequestParam(value = "resourceVersion", required = false) String resourceVersion,@Parameter(example = "the selector to restrict returned list to workSpaces only with matched labels.") @Valid @RequestParam(value = "selector", required = false) String selector,@Parameter(example = "the repoURL to restrict returned list workSpaces.") @Valid @RequestParam(value = "repo", required = false) String repo) {
        return workSpaceServiceList(name, refresh, resourceVersion, selector, repo);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceList> workSpaceServiceList(String name, String refresh, String resourceVersion, String selector, String repo) {
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
     * GET /api//workSpaces/{name}/resource/actions : Returns a list of resource actions
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
    @Operation(summary = "Returns a list of resource actions", operationId = "workSpaceServiceListResourceActions",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceResourceActionsListResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/resource/actions",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceResourceActionsListResponse> _workSpaceServiceListResourceActions(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workSpaceServiceListResourceActions(name, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceResourceActionsListResponse> workSpaceServiceListResourceActions(String name, String namespace, String resourceName, String version, String group, String kind) {
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
     * GET /api//workSpaces/{name}/events : ListResourceEvents returns a list of event resources
     *
     * @param name  (required)
     * @param resourceNamespace  (optional)
     * @param resourceName  (optional)
     * @param resourceUID  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ListResourceEvents returns a list of event resources", operationId = "workSpaceServiceListResourceEvents",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  EventList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/events",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<EventList> _workSpaceServiceListResourceEvents(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "resourceNamespace", required = false) String resourceNamespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "resourceUID", required = false) String resourceUID) {
        return workSpaceServiceListResourceEvents(name, resourceNamespace, resourceName, resourceUID);
    }

    // Override this method
    default  ResponseEntity<EventList> workSpaceServiceListResourceEvents(String name, String resourceNamespace, String resourceName, String resourceUID) {
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
     * GET /api//workSpaces/{workSpaceName}/managed-resources : ManagedResources returns list of managed resources
     *
     * @param workSpaceName  (required)
     * @param namespace  (optional)
     * @param name  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ManagedResources returns list of managed resources", operationId = "workSpaceServiceManagedResources",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceManagedResourcesResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{workSpaceName}/managed-resources",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceManagedResourcesResponse> _workSpaceServiceManagedResources(@Parameter(example = "",required=true) @PathVariable("workSpaceName") String workSpaceName,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workSpaceServiceManagedResources(workSpaceName, namespace, name, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceManagedResourcesResponse> workSpaceServiceManagedResources(String workSpaceName, String namespace, String name, String version, String group, String kind) {
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
     * PATCH /api//workSpaces/{name} : Patch patch an workSpace
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Patch patch an workSpace", operationId = "workSpaceServicePatch",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PatchMapping(
        value = "/api//workSpaces/{name}",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServicePatch(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpacePatchRequest body) {
        return workSpaceServicePatch(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServicePatch(String name, WorkSpaceWorkSpacePatchRequest body) {
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
     * POST /api//workSpaces/{name}/resource : PatchResource patch single workSpace resource
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
    @Operation(summary = "PatchResource patch single workSpace resource", operationId = "workSpaceServicePatchResource",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResourceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//workSpaces/{name}/resource",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResourceResponse> _workSpaceServicePatchResource(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody String body,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "patchType", required = false) String patchType) {
        return workSpaceServicePatchResource(name, body, namespace, resourceName, version, group, kind, patchType);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResourceResponse> workSpaceServicePatchResource(String name, String body, String namespace, String resourceName, String version, String group, String kind, String patchType) {
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
     * GET /api//workSpaces/{workSpaceName}/resource-tree : ResourceTree returns resource tree
     *
     * @param workSpaceName  (required)
     * @param namespace  (optional)
     * @param name  (optional)
     * @param version  (optional)
     * @param group  (optional)
     * @param kind  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ResourceTree returns resource tree", operationId = "workSpaceServiceResourceTree",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceTree.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{workSpaceName}/resource-tree",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceTree> _workSpaceServiceResourceTree(@Parameter(example = "",required=true) @PathVariable("workSpaceName") String workSpaceName,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workSpaceServiceResourceTree(workSpaceName, namespace, name, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceTree> workSpaceServiceResourceTree(String workSpaceName, String namespace, String name, String version, String group, String kind) {
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
     * GET /api//workSpaces/{name}/revisions/{revision}/metadata : Get the meta-data (author, date, tags, message) for a specific revision of the workSpace
     *
     * @param name the workSpace&#39;s name (required)
     * @param revision the revision of the app (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Get the meta-data (author, date, tags, message) for a specific revision of the workSpace", operationId = "workSpaceServiceRevisionMetadata", tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RevisionMetadata.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/revisions/{revision}/metadata",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<RevisionMetadata> _workSpaceServiceRevisionMetadata(@Parameter(example = "the workSpace's name",required=true) @PathVariable("name") String name,@Parameter(example = "the revision of the app",required=true) @PathVariable("revision") String revision) {
        return workSpaceServiceRevisionMetadata(name, revision);
    }

    // Override this method
    default  ResponseEntity<RevisionMetadata> workSpaceServiceRevisionMetadata(String name, String revision) {
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
     * POST /api//workSpaces/{name}/rollback : Rollback syncs an workSpace to its target state
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Rollback syncs an workSpace to its target state", operationId = "workSpaceServiceRollback",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//workSpaces/{name}/rollback",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServiceRollback(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpaceRollbackRequest body) {
        return workSpaceServiceRollback(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServiceRollback(String name, WorkSpaceWorkSpaceRollbackRequest body) {
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
     * POST /api//workSpaces/{name}/resource/actions : Run resource action
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
    @Operation(summary = "Run resource action", operationId = "workSpaceServiceRunResourceAction",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceWorkSpaceResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//workSpaces/{name}/resource/actions",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceWorkSpaceResponse> _workSpaceServiceRunResourceAction(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody String body,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName,@Parameter(example = "") @Valid @RequestParam(value = "version", required = false) String version,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind) {
        return workSpaceServiceRunResourceAction(name, body, namespace, resourceName, version, group, kind);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceWorkSpaceResponse> workSpaceServiceRunResourceAction(String name, String body, String namespace, String resourceName, String version, String group, String kind) {
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
     * POST /api//workSpaces/{name}/sync : Sync syncs an workSpace to its target state
     *
     * @param name  (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Sync syncs an workSpace to its target state", operationId = "workSpaceServiceSync", tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//workSpaces/{name}/sync",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServiceSync(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceWorkSpaceSyncRequest body) {
        return workSpaceServiceSync(name, body);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServiceSync(String name, WorkSpaceWorkSpaceSyncRequest body) {
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
     * DELETE /api//workSpaces/{name}/operation : Terminates the currently running operation
     *
     * @param name  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Terminates the currently running operation", operationId = "workSpaceServiceTerminateOperation",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Object.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @DeleteMapping(
        value = "/api//workSpaces/{name}/operation",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<Object> _workSpaceServiceTerminateOperation(@Parameter(example = "",required=true) @PathVariable("name") String name) {
        return workSpaceServiceTerminateOperation(name);
    }

    // Override this method
    default  ResponseEntity<Object> workSpaceServiceTerminateOperation(String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api//workSpaces/{workSpace.metadata.name} : Update updates an workSpace
     *
     * @param workSpaceMetadataName Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional (required)
     * @param body  (required)
     * @param validate  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "Update updates an workSpace", operationId = "workSpaceServiceUpdate",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpace.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "/api//workSpaces/{workSpace.metadata.name}",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpace> _workSpaceServiceUpdate(@Parameter(example = "Name must be unique within a namespace. Is required when creating resources, although some resources may allow a client to request the generation of an appropriate name automatically. Name is primarily intended for creation idempotence and configuration definition. Cannot be updated. More info: http://kubernetes.io/docs/user-guide/identifiers#names +optional",required=true) @PathVariable("workSpace.metadata.name") String workSpaceMetadataName,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpace body,@Parameter(example = "") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workSpaceServiceUpdate(workSpaceMetadataName, body, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpace> workSpaceServiceUpdate(String workSpaceMetadataName, WorkSpace body, Boolean validate) {
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
     * PUT /api//workSpaces/{name}/spec : UpdateSpec updates an workSpace spec
     *
     * @param name  (required)
     * @param body  (required)
     * @param validate  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "UpdateSpec updates an workSpace spec", operationId = "workSpaceServiceUpdateSpec",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  WorkSpaceSpec.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "/api//workSpaces/{name}/spec",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<WorkSpaceSpec> _workSpaceServiceUpdateSpec(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "" ,required=true )  @Valid @RequestBody WorkSpaceSpec body,@Parameter(example = "") @Valid @RequestParam(value = "validate", required = false) Boolean validate) {
        return workSpaceServiceUpdateSpec(name, body, validate);
    }

    // Override this method
    default  ResponseEntity<WorkSpaceSpec> workSpaceServiceUpdateSpec(String name, WorkSpaceSpec body, Boolean validate) {
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
     * GET /api//workSpaces/{name}/logs : Returns stream of log entries for the specified workSpace
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
    @Operation(summary = "Returns stream of log entries for the specified workSpace", operationId = "workSpaceServiceWorkSpaceLogs",  tags={ "WorkSpaceService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.(streaming responses)", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  InlineResponse200.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//workSpaces/{name}/logs",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<InlineResponse200> _workSpaceServiceWorkSpaceLogs(@Parameter(example = "",required=true) @PathVariable("name") String name,@Parameter(example = "") @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(example = "") @Valid @RequestParam(value = "podName", required = false) String podName,@Parameter(example = "") @Valid @RequestParam(value = "container", required = false) String container,@Parameter(example = "") @Valid @RequestParam(value = "sinceSeconds", required = false) String sinceSeconds,@Parameter(example = "Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive.") @Valid @RequestParam(value = "sinceTime.seconds", required = false) String sinceTimeSeconds,@Parameter(example = "Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from 0 to 999,999,999 inclusive. This field may be limited in precision depending on context.") @Valid @RequestParam(value = "sinceTime.nanos", required = false) Integer sinceTimeNanos,@Parameter(example = "") @Valid @RequestParam(value = "tailLines", required = false) String tailLines,@Parameter(example = "") @Valid @RequestParam(value = "follow", required = false) Boolean follow,@Parameter(example = "") @Valid @RequestParam(value = "untilTime", required = false) String untilTime,@Parameter(example = "") @Valid @RequestParam(value = "filter", required = false) String filter,@Parameter(example = "") @Valid @RequestParam(value = "kind", required = false) String kind,@Parameter(example = "") @Valid @RequestParam(value = "group", required = false) String group,@Parameter(example = "") @Valid @RequestParam(value = "resourceName", required = false) String resourceName) {
        return workSpaceServiceWorkSpaceLogs(name, namespace, podName, container, sinceSeconds, sinceTimeSeconds, sinceTimeNanos, tailLines, follow, untilTime, filter, kind, group, resourceName);
    }

    // Override this method
    default  ResponseEntity<InlineResponse200> workSpaceServiceWorkSpaceLogs(String name, String namespace, String podName, String container, String sinceSeconds, String sinceTimeSeconds, Integer sinceTimeNanos, String tailLines, Boolean follow, String untilTime, String filter, String kind, String group, String resourceName) {
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
