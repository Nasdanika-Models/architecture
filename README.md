# Architecture

Ecore model, graph nodes, and processors for architecture - architecture elements/building blocks, ...
This model is intended to be a "physical" "reference implementation" of the [TOGAF](https://github.com/Nasdanika-Models/togaf) model. 

The model shall be usable to define architectures and generate documentation. 
It also can be used as a starting point to create organization-specific architecture repositories, which contain structures reflecting existing organizaion ways of working. E.g. how people are organized, how information systems are tracked.

Use case: Load and publish the baseline model for analysis and to build new architectures on top:

* Use [GitLab](https://github.com/Nasdanika-Models/gitlab) to scan org's source repositories
* Use [Maven](https://github.com/Nasdanika-Models/maven) model to load ``pom.xml`` in the repositories
* Use [Java](https://github.com/Nasdanika-Models/java) model to load ``module-info.java`` in the repositories
* Use [Azure](https://github.com/Nasdanika-Models/azure) model to load information about the cloud runtime
* Use [Excel](https://github.com/Nasdanika-Models/excel) model to load information from Excel spreadsheets
* Use org-specific models to load information from internal systems
* Resolve cross-references. E.g. Maven developer to a person in the organization directory
* Use the resulting model for analysis, solution generation, and generation of reports and web sites.

