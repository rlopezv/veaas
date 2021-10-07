package com.github.rlopezv.veaas.api;

import java.util.Optional;

import javax.validation.Valid;

import com.github.rlopezv.veaas.api.model.Repository;
import com.github.rlopezv.veaas.api.model.RepositoryList;
import com.github.rlopezv.veaas.api.model.RepositoryRefs;
import com.github.rlopezv.veaas.api.model.RepositoryRepoWorkSpaceDetailsQuery;
import com.github.rlopezv.veaas.api.model.RepositoryRepoWorkSpaceDetailsResponse;
import com.github.rlopezv.veaas.api.model.RepositoryRepoWorkSpacesResponse;
import com.github.rlopezv.veaas.api.model.RuntimeError;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@Validated
@Tag(name = "Repository", description = "Repository Service API")
public interface RepositoryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }
    
    /**
     * POST /api//repositories/{source.repoURL}/appdetails : GetAppDetails returns workSpace details by given path
     *
     * @param sourceRepoURL RepoURL is the URL to the repository (Git or Helm) that contains the workSpace manifests (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "GetAppDetails returns workSpace details by given path", operationId = "repositoryServiceGetAppDetails",  tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryRepoWorkSpaceDetailsResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//repositories/{source.repoURL}/appdetails",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<RepositoryRepoWorkSpaceDetailsResponse> _repositoryServiceGetAppDetails(@Parameter(example = "RepoURL is the URL to the repository (Git or Helm) that contains the workSpace manifests",required=true) @PathVariable("source.repoURL") String sourceRepoURL,@Parameter(example = "" ,required=true )  @Valid @RequestBody RepositoryRepoWorkSpaceDetailsQuery body) {
        return repositoryServiceGetAppDetails(sourceRepoURL, body);
    }

    // Override this method
    default  ResponseEntity<RepositoryRepoWorkSpaceDetailsResponse> repositoryServiceGetAppDetails(String sourceRepoURL, RepositoryRepoWorkSpaceDetailsQuery body) {
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
     * GET /api//repositories/{repo}/workSpaces : ListApps returns list of workSpaces in the repo
     *
     * @param repo  (required)
     * @param revision  (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ListApps returns list of workSpaces in the repo", operationId = "repositoryServiceListApps",  tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryRepoWorkSpacesResponse.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//repositories/{repo}/workSpaces",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<RepositoryRepoWorkSpacesResponse> _repositoryServiceListApps(@Parameter(example = "",required=true) @PathVariable("repo") String repo,@Parameter(example = "") @Valid @RequestParam(value = "revision", required = false) String revision) {
        return repositoryServiceListApps(repo, revision);
    }

    // Override this method
    default  ResponseEntity<RepositoryRepoWorkSpacesResponse> repositoryServiceListApps(String repo, String revision) {
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
     * GET /api//repositories/{repo}/refs
     *
     * @param repo Repo URL for query (required)
     * @param forceRefresh Whether to force a cache refresh on repo&#39;s connection state. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "", operationId = "repositoryServiceListRefs",  tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryRefs.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//repositories/{repo}/refs",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<RepositoryRefs> _repositoryServiceListRefs(@Parameter(example = "Repo URL for query",required=true) @PathVariable("repo") String repo,@Parameter(example = "Whether to force a cache refresh on repo's connection state.") @Valid @RequestParam(value = "forceRefresh", required = false) Boolean forceRefresh) {
        return repositoryServiceListRefs(repo, forceRefresh);
    }

    // Override this method
    default  ResponseEntity<RepositoryRefs> repositoryServiceListRefs(String repo, Boolean forceRefresh) {
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
     * GET /api//repositories : ListRepositories gets a list of all configured repositories
     *
     * @param repo Repo URL for query. (optional)
     * @param forceRefresh Whether to force a cache refresh on repo&#39;s connection state. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ListRepositories gets a list of all configured repositories", operationId = "repositoryServiceListRepositories", tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RepositoryList.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @GetMapping(
        value = "/api//repositories",
        produces = { "workSpace/json" }
    )
    default ResponseEntity<RepositoryList> _repositoryServiceListRepositories(@Parameter(example = "Repo URL for query.") @Valid @RequestParam(value = "repo", required = false) String repo,@Parameter(example = "Whether to force a cache refresh on repo's connection state.") @Valid @RequestParam(value = "forceRefresh", required = false) Boolean forceRefresh) {
        return repositoryServiceListRepositories(repo, forceRefresh);
    }

    // Override this method
    default  ResponseEntity<RepositoryList> repositoryServiceListRepositories(String repo, Boolean forceRefresh) {
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
     * PUT /api//repositories/{repo.repo} : UpdateRepository updates a repository configuration
     *
     * @param repoRepo Repo contains the URL to the remote repository (required)
     * @param body  (required)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "UpdateRepository updates a repository configuration", operationId = "repositoryServiceUpdateRepository",  tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Repository.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PutMapping(
        value = "/api//repositories/{repo.repo}",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<Repository> _repositoryServiceUpdateRepository(@Parameter(example = "Repo contains the URL to the remote repository",required=true) @PathVariable("repo.repo") String repoRepo,@Parameter(example = "" ,required=true )  @Valid @RequestBody Repository body) {
        return repositoryServiceUpdateRepository(repoRepo, body);
    }

    // Override this method
    default  ResponseEntity<Repository> repositoryServiceUpdateRepository(String repoRepo, Repository body) {
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
     * POST /api//repositories/{repo}/validate : ValidateAccess validates access to a repository with given parameters
     *
     * @param repo The URL to the repo (required)
     * @param body The URL to the repo (required)
     * @param username Username for accessing repo. (optional)
     * @param password Password for accessing repo. (optional)
     * @param sshPrivateKey Private key data for accessing SSH repository. (optional)
     * @param insecure Whether to skip certificate or host key validation. (optional)
     * @param tlsClientCertData TLS client cert data for accessing HTTPS repository. (optional)
     * @param tlsClientCertKey TLS client cert key for accessing HTTPS repository. (optional)
     * @param type The type of the repo. (optional)
     * @param name The name of the repo. (optional)
     * @param proxy HTTP/HTTPS proxy to access the repository. (optional)
     * @return A successful response. (status code 200)
     *         or An unexpected error response. (status code 500)
     */
    @Operation(summary = "ValidateAccess validates access to a repository with given parameters", operationId = "repositoryServiceValidateAccess",  tags={ "RepositoryService", })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "A successful response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  Object.class))}),
        @ApiResponse(responseCode = "500", description = "An unexpected error response.", content = { @Content(mediaType = "application/json", schema = @Schema(implementation =  RuntimeError.class))})})
    @PostMapping(
        value = "/api//repositories/{repo}/validate",
        produces = { "workSpace/json" },
        consumes = { "workSpace/json" }
    )
    default ResponseEntity<Object> _repositoryServiceValidateAccess(@Parameter(example = "The URL to the repo",required=true) @PathVariable("repo") String repo,@Parameter(example = "The URL to the repo" ,required=true )  @Valid @RequestBody String body,@Parameter(example = "Username for accessing repo.") @Valid @RequestParam(value = "username", required = false) String username,@Parameter(example = "Password for accessing repo.") @Valid @RequestParam(value = "password", required = false) String password,@Parameter(example = "Private key data for accessing SSH repository.") @Valid @RequestParam(value = "sshPrivateKey", required = false) String sshPrivateKey,@Parameter(example = "Whether to skip certificate or host key validation.") @Valid @RequestParam(value = "insecure", required = false) Boolean insecure,@Parameter(example = "TLS client cert data for accessing HTTPS repository.") @Valid @RequestParam(value = "tlsClientCertData", required = false) String tlsClientCertData,@Parameter(example = "TLS client cert key for accessing HTTPS repository.") @Valid @RequestParam(value = "tlsClientCertKey", required = false) String tlsClientCertKey,@Parameter(example = "The type of the repo.") @Valid @RequestParam(value = "type", required = false) String type,@Parameter(example = "The name of the repo.") @Valid @RequestParam(value = "name", required = false) String name,@Parameter(example = "HTTP/HTTPS proxy to access the repository.") @Valid @RequestParam(value = "proxy", required = false) String proxy) {
        return repositoryServiceValidateAccess(repo, body, username, password, sshPrivateKey, insecure, tlsClientCertData, tlsClientCertKey, type, name, proxy);
    }

    // Override this method
    default  ResponseEntity<Object> repositoryServiceValidateAccess(String repo, String body, String username, String password, String sshPrivateKey, Boolean insecure, String tlsClientCertData, String tlsClientCertKey, String type, String name, String proxy) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
