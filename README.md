# veaas
Virtual Environment as a Service repository

This reposotory contains the implementation of the Virtual Environment as a Service Project. It will be implemented following the operator pattern offering an API that will provide the required operations to allow the management and operation required by the service.


- [api](api), contains the description of the services required to provide the service. It's done using OpenApi 3.0 specification.


## Domains

Four data domains have been identified. Each regarding 

- Infrastructure, the physical/virtual computing resources where the environments will be created and the service providers.

  - Phisical/Virtual infrastructure

s   - v1HostInfo
    - v1HostSystemInfo
    - v1HostResourceInfo
    - v1NetworkIngress
    - v1PortStatus

  - Providers
    - v1Provider
    - v1ProviderConfig
    - v1ProviderInfo
    - v1ProviderList
    - v1ProviderCacheInfo

 
- Environment, this includes the resources required to create the desired environment/workspace with the required resources (devices).

  - Workspace
    - v1WorkSpace
    - v1WorkSpaceSpec
    - v1WorkSpaceStatus
    - v1WorkSpaceCondition
    - v1WorkSpaceDestination
    - v1WorkSpaceSource
    - v1WorkSpaceSourceDirectory
    - v1WorkSpaceSourcePlugin
    - v1WorkSpaceSummary
    - v1WorkSpaceTree
    - v1WorkSpaceList

  - Resource (requires Spec?)
    - v1Resource
    - v1ResourceStatus
    - v1ResourceRef
    - v1ResourceDiff
    - v1ResourceIgnoreDifferences
    - v1ResourceNetworkingInfo
    - v1ResourceOverride
    - v1ResourceResult

  - Status
    - v1WorkSpaceWatchEvent (Git)
    - v1ConnectionState
    - v1HealthStatus


- Control, that should include operation & managment data structures.

  - v1Operation
  - v1OperationInitiator
  - v1OperationState

  - v1Command
  - v1ComparedTo

  - v1ResourceAction
  - v1ResourceActionParam

  - v1SyncOperation
  - v1SyncOperationResource
  - v1SyncOperationResult
  - v1SyncPolicy
  - v1SyncPolicyAutomated
  - v1SyncStatus
  - v1SyncStrategy
  - v1SyncStrategyApply
  - v1SyncStrategyHook
  - v1SyncWindow
  - v1Backoff
  - v1OverrideIgnoreDiff
  - v1RetryStrategy


  - v1RevisionHistory
  - v1RevisionMetadata
  - v1OrphanedResourcesMonitorSettings

  - v1Event
  - v1EventList
  - v1EventSeries
  - v1EventSource


- Git,  required to implement the flow associated with GitOps.

  - v1RepoCreds
  - v1RepoCredsList
  - v1Repository
  - v1RepositoryList


- Common
  - v1MicroTime
  - v1Time
  - v1ObjectMeta
  - v1ListMeta
  - v1ObjectReference
  - v1OwnerReference
  - v1Info
  - v1InfoItem

- Support
 - v1JWTToken
 - v1JWTTokens
 - v1TLSClientConfig


## References

[IoT Edge Challenges and Functions](https://datatracker.ietf.org/doc/draft-irtf-t2trg-iot-edge/)

[Simulating Fog and Edge Computing
Scenarios: An Overview and Research Challenges](https://doi.org/10.3390/fi11030055)

[Mobile Edge Emulation Platform](https://github.com/InterDigitalInc/AdvantEDGE)


[Resource Management Approaches in Fog Computing: a Comprehensive Review](https://doi.org/10.1007/s10723-019-09491-1)

- https://www.gitops.tech/
- https://www.redhat.com/en/topics/devops/what-is-gitops


# Tools
- [Open API Tools](https://openapi.tools/)

