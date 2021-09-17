# veaas
Virtual Environment as a Service repository

This reposotory contains the implementation of the Virtual Environment as a Service Project:


- api, contains the description of the services required to provide the service. It's done using OpenApi 3.0 specification.


## Dominios

Four domains for data:

- Infrastructure, the physical/virtual computing resources where the environments will be created and the service providers.

Phisical/Virtual infrastructure

v1alphaHostInfo
v1HostSystemInfo
v1alphaHostResourceInfo
v1NetworkIngress
v1PortStatus

Providers

v1alphaProvider
v1alphaProviderConfig
v1alphaProviderInfo
v1alphaProviderList
v1alphaProviderCacheInfo

 
- Environments, this includes the resources required to create the desired environment workspace (devices).

v1alphaWorkSpace
v1alphaWorkSpaceSpec
v1alphaWorkSpaceStatus
v1alphaWorkSpaceCondition
v1alphaWorkSpaceDestination
v1alphaWorkSpaceSource
v1alphaWorkSpaceSourceDirectory
v1alphaWorkSpaceSourcePlugin
v1alphaWorkSpaceSummary
v1alphaWorkSpaceTree
v1alphaWorkSpaceList


v1alphaWorkSpaceWatchEvent (Git)

Resource (requires Spec?)
v1alphaResource
v1alphaResourceStatus
v1alphaResourceRef
v1alphaResourceDiff
v1alphaResourceIgnoreDifferences
v1alphaResourceNetworkingInfo
v1alphaResourceOverride
v1alphaResourceResult


v1alphaConnectionState
v1alphaHealthStatus


- Control, that should include operation & managment data structures.


v1alphaOperation
v1alphaOperationInitiator
v1alphaOperationState

v1alphaCommand
v1alphaComparedTo

v1alphaResourceAction
v1alphaResourceActionParam

v1alphaSyncOperation
v1alphaSyncOperationResource
v1alphaSyncOperationResult
v1alphaSyncPolicy
v1alphaSyncPolicyAutomated

v1alphaSyncStatus
v1alphaSyncStrategy
v1alphaSyncStrategyApply
v1alphaSyncStrategyHook
v1alphaSyncWindow
v1alphaBackoff

v1alphaRevisionHistory
v1alphaRevisionMetadata
v1alphaOrphanedResourcesMonitorSettings


- GitOps, data model required to implement the flow.

v1alphaRepoCreds
v1alphaRepoCredsList
v1alphaRepository
v1alphaRepositoryList


- Common
v1MicroTime
v1Time
v1ObjectMeta
v1ListMeta
v1ObjectReference
v1OwnerReference
v1alphaInfo
v1alphaInfoItem

v1alphaJWTToken
v1alphaJWTTokens

v1alphaTLSClientConfig

v1Event
v1EventList
v1EventSeries
v1EventSource


v1alphaKnownTypeField

v1alphaOrphanedResourceKey

v1alphaOverrideIgnoreDiff

v1alphaRetryStrategy




