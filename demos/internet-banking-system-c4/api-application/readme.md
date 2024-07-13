
```drawio
${representations/drawio/diagram}
```

The the above diagram is a [Component diagram](https://c4model.com/#ComponentDiagram), which is used to "decompose each container further to identify the major structural building blocks and their interactions".

## Mapping

### Surroundings -> selectors

Similar to the container diagram, diagram elements representing the surroundings of the "API Application" are mapped to semantic elements defined on the higher level diagrams using [``selector``](https://github.com/Nasdanika-Models/family#selector)s. 
The system context diagram defines the surrounding nodes and this diagram references them.

This is a selector of the "Single-Page Application":

```yaml
getDocument().getModelElementById('single-page-application')
```

The loading logic "carries over" tooltips from the System Context Diagram to this diagram.

### API Application

The "API Application" container maps to the same semantic element as on the Container diagram because:

* The "API Application" element on the Container diagram links to this diagram page.
* The "API Application" element on this diagram has ``page-element`` property set to ``true``.   

Semantic elements of the child elements of the "API Application" element are mapped to the ``elements`` reference and ordered with the [``right-down``](https://github.com/Nasdanika-Models/family#right-down) comparator:

```yaml
container:
  self:
    elements:
      path: 1
      comparator: right-down
```          

### Components

All components within the container except the "Mainframe Banking System Facade" are mapped to [Node](https://architecture.models.nasdanika.org/references/eClassifiers/Node/index.html)s.

The "Mainframe Banking System Facade" component is mapped to [CompositeNode](https://architecture.models.nasdanika.org/references/eClassifiers/CompositeNode/index.html) because it has sub-elements.
It is linked to the "Mainframe Banking System Facade Code" page. As such, its semantic element is mapped to the "Mainframe Banking System Facade Code" page element as well allowing further mapping on [that page](references/elements/mainframe-banking-system-facade/index.html).

This diagram element defines [``base-uri``](https://github.com/Nasdanika-Models/family#base-uri) property as ``%id%/``.
Because "Placeholders" is checked, ``%id%/`` expands to ``mainframe-banking-system-facade/`` during loading. 
``doc-ref`` is set to ``readme.md``, which in combination with ``base-uri`` of this element and its containing element resolves to [``api-appliction/mainframe-banking-system-facade/readme.md``](https://github.com/Nasdanika-Models/architecture/blob/main/demos/internet-banking-system/api-application/mainframe-banking-system-facade/readme.md).




