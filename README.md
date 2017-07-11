# elasticsearch-plugin-user-defined


## Plugin Types
1. ActionPlugin                An additional extension point for {@link Plugin}s that extends Elasticsearch's scripting functionality.
2. AnalySisPlugin            An additional extension point for {@link Plugin}s that extends Elasticsearch's analysis functionality
3. ClusterPlugin               An extension point for {@link Plugin} implementations to customer behavior of cluster management.
4. DiscoveryPlugin         An additional extension point for {@link Plugin}s that extends Elasticsearch's discovery functionality
5. IngestPlugin                An extension point for {@link Plugin} implementations to add custom ingest processors
6. MapperPlugin             An extension point for {@link Plugin} implementations to add custom mappers
7. NetWorkPlugin           Plugin for extending network and transport related classes
8. RespoistroyPlugin     An extension point for {@link Plugin} implementations to add custom snapshot repositories.
9. ScriptPlugin                 An additional extension point for {@link Plugin}s that extends Elasticsearch's scripting functionality
10. SearchPlugin             Plugin for extending search time behavior

## 自定义插件开发流程
1. 根据你想开发的插件类型,实现相应的接口,这里我实现最简单的ActionPlugin,即扩展/_cat下的一个子action,如/_cat/hello,实现类为HelloCatPlugin
2. 实现/_cat/hello的具体操作,实现类为HelloCatAction

