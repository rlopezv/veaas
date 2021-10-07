# veaas
Virtual Environment as a Service repository

This reposotory contains the implementation of the Virtual Environment as a Service Project. It will be implemented following the operator pattern offering an API that will provide the required operations to allow the management and operation required by the service.


- [api](api), contains the description of the services required to provide the service. It's done using OpenApi 3.0 specification.


## Domains

Four data domains have been identified. Each regarding 

- Infrastructure, the physical/virtual computing resources where the environments will be created and the service providers.

  - Phisical/Virtual infrastructure
    - HostInfo
    - HostSystemInfo
    - HostResourceInfo
    - NetworkIngress
    - PortStatus

  - Providers
    - Provider
    - ProviderConfig
    - ProviderInfo
    - ProviderList
    - ProviderCacheInfo

 
- Environment, this includes the resources required to create the desired environment/workspace with the required resources (devices).

  - Workspace
    - WorkSpace
    - WorkSpaceSpec
    - WorkSpaceStatus
    - WorkSpaceCondition
    - WorkSpaceDestination
    - WorkSpaceSource
    - WorkSpaceSourceDirectory
    - WorkSpaceSourcePlugin
    - WorkSpaceSummary
    - WorkSpaceTree
    - WorkSpaceList

  - Resource (requires Spec?)
    - Resource
    - ResourceStatus
    - ResourceRef
    - ResourceDiff
    - ResourceIgnoreDifferences
    - ResourceNetworkingInfo
    - ResourceOverride
    - ResourceResult

  - Status
    - WorkSpaceWatchEvent (Git)
    - ConnectionState
    - HealthStatus


- Control, that should include operation & managment data structures.

  - Operation
  - OperationInitiator
  - OperationState

  - Command
  - ComparedTo

  - ResourceAction
  - ResourceActionParam

  - SyncOperation
  - SyncOperationResource
  - SyncOperationResult
  - SyncPolicy
  - SyncPolicyAutomated
  - SyncStatus
  - SyncStrategy
  - SyncStrategyApply
  - SyncStrategyHook
  - SyncWindow
  - Backoff
  - OverrideIgnoreDiff
  - RetryStrategy


  - RevisionHistory
  - RevisionMetadata
  - OrphanedResourcesMonitorSettings

  - Event
  - EventList
  - EventSeries
  - EventSource


- Git,  required to implement the flow associated with GitOps.

  - RepoCreds
  - RepoCredsList
  - Repository
  - RepositoryList


- Common
  - MicroTime
  - Time
  - ObjectMeta
  - ListMeta
  - ObjectReference
  - OwnerReference
  - Info
  - InfoItem

- Support
 - JWTToken
 - JWTTokens
 - TLSClientConfig


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

