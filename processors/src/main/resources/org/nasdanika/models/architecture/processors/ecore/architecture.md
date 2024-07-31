This model provides classes for documenting (software) architectures.
It is built on top of the [Graph model](https://graph.models.nasdanika.org/)
The model can be used AS-IS or as a base for specialized models.
[C4 sub-package](references/eSubpackages/c4/index.html) is an example of such a specialized model.

[Internet Banking System Architecture](demo/internet-banking-system/index.html) ([sources](https://github.com/Nasdanika-Models/architecture/tree/main/demos/internet-banking-system)) is an example of AS-IS use and mapping of a [Drawio](https://www.drawio.com/) diagram to this model to generate HTML documentation.
The mapping process is explained in the [Beyond Diagrams](https://leanpub.com/beyond-diagrams) book. 

The below diagram shows model elements and their relationships.
Inherited relationships are not shown.

```drawio-resource
architecture.drawio
```

[Architecture element](references/eClassifiers/ArchitectureElement/index.html) is the base class for other model elements.
It may have an icon, a name, documentation, and start/end. Start and end may be absolute or relative.

[Undergoer](references/eClassifiers/Undergoer/index.html) interface is implemented by classes which can be acted/operated upon by [actors](references/eClassifiers/Actor/index.html) in [roles](references/eClassifiers/Role/index.html). 
Roles are defined at the undergoer level.

[Architecture Description](references/eClassifiers/ArchitectureDescription/index.html) extends Architecture Element, Undergoer, and [Documented Named Graph](https://graph.models.nasdanika.org/references/eClassifiers/DocumentedNamedGraph/index.html). 
It means that it may contain graph elements, including [Architecture Description Elements](references/eClassifiers/ArchitectureDescriptionElement/index.html). 
It may define actors.

Architecture Description Element extends Architecture Element, Undergoer, and [Documented Named Graph Element](https://graph.models.nasdanika.org/references/eClassifiers/DocumentedNamedGraphElement/index.html), 
i.e. it can be an element of Architecture Description (as the name suggests) and other graphs.

[Relationship](references/eClassifiers/Relationship/index.html) extends Architecture Element, Undergoer, and [Documented Named Connection](https://graph.models.nasdanika.org/references/eClassifiers/DocumentedNamedConnection/index.html). 
I.e. it may connect sources and targets, including [relationship source](references/eClassifiers/RelationshipSource/index.html) and [relationship target](references/eClassifiers/RelationshipTarget/index.html). 
[Tunnel](references/eClassifiers/Tunnel/index.html) is a specialization of Relationship which can aggregate (group) other relationships.

[Domain](references/eClassifiers/Domain/index.html) is both Architecture Description and Architecture Description Element.
Domains can be used create a hierarchy of architecture descriptions, similar to file system directories. 

Relationship source is an Architecture Description Element which can be a source of relationships.
Relationship target is an Architecture Description Element which can be a target of relationships.
[Node](references/eClassifiers/Node/index.html) is both relationship source and target.

Relationship source, target and Node have ``Composite`` flavors which are also domains, i.e. may contain Architecture Description Elements.

## See Also

* [Architecture As Code](https://medium.com/nasdanika/architecture-as-code-7c0eadfc0b2b)
* [Graph Model](https://graph.models.nasdanika.org/)
* [Graph](https://docs.nasdanika.org/core/graph/index.html)
* [Drawio](https://docs.nasdanika.org/core/drawio/index.html)
* [Connecting the dots](https://medium.com/nasdanika/connecting-the-dots-94a733c61059)
* [Executable (computational) graphs & diagrams](https://medium.com/nasdanika/executable-computational-graphs-diagrams-1eeffc80976d)
* [Beyond Diagrams](https://leanpub.com/beyond-diagrams)