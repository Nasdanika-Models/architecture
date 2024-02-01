var searchDocuments = {"demo/internet-banking-system/r0/internet-banking-system/rh/api-application/index.html":{"path":"Internet Banking System/API Application","action-uuid":"1937d21a-81af-47a8-96d8-06efc8bde055","title":"API Application","content":"The the above diagram is a Component diagram, which is used to &ldquo;decompose each container further to identify the major structural building blocks and their interactions&rdquo;. Mapping Surroundings -&gt; selectors Similar to the container diagram, diagram elements representing the surroundings of the &ldquo;API Application&rdquo; are mapped to semantic elements defined on the higher level diagrams using selectors. The system context diagram defines the surrounding nodes and this diagram references them. This is a selector of the &ldquo;Single-Page Application&rdquo;: getDocument().getModelElementById('single-page-application')\n The loading logic &ldquo;carries over&rdquo; tooltips from the System Context Diagram to this diagram. API Application The &ldquo;API Application&rdquo; container maps to the same semantic element as on the Container diagram because: The &ldquo;API Application&rdquo; element on the Container diagram links to this diagram page. The &ldquo;API Application&rdquo; element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;API Application&rdquo; element are mapped to the elements reference and ordered with the right-down comparator: container:\n  self:\n    elements:\n      path: 1\n      comparator: right-down\n Components All components within the container except the &ldquo;Mainframe Banking System Facade&rdquo; are mapped to Nodes. The &ldquo;Mainframe Banking System Facade&rdquo; component is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Mainframe Banking System Facade Code&rdquo; page. As such, its semantic element is mapped to the &ldquo;Mainframe Banking System Facade Code&rdquo; page element as well allowing further mapping on that page. This diagram element defines base-uri property as %id%/. Because &ldquo;Placeholders&rdquo; is checked, %id%/ expands to mainframe-banking-system-facade/ during loading. doc-ref is set to readme.md, which in combination with base-uri of this element and its containing element resolves to api-appliction/mainframe-banking-system-facade/readme.md. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS] Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS]"},"references/eClassifiers/CompositeRelationshipTarget/inheritance.html":{"path":"CompositeRelationshipTarget/Inheritance","action-uuid":"772bfa75-aa94-4a57-92b5-2016fe6061b5","title":"Inheritance","content":"Supertypes "},"demo/internet-banking-system/index.html":{"action-uuid":"ee31a5ae-1008-44a5-be39-b146a18c733b","title":"Internet Banking System Architecture","content":"This site was generated as explained below: A Drawio diagram of an Internet Banking System was created based on images and descriptions from The C4 model for visualising software architecture. Descriptions of elements and diagrams were copied verbatim. The diagram uses free icons from Icons8 to provide visual distinction between architecture elements. The diagram was mapped the Architecture model using properties of the diagram elements. Then the architecture model was transformed to the HTML Application model and a static web site was generated from that model. For the majority of elements icons were generated from the diagram images of the respective elements. The web site is deployed by GitHub Pages. Notes: Diagram elements have tooltips with descriptions from the C4 model site. A click on a diagram element navigates to the element page. The left navigation provides a filter to quickly find a model element by name. Search provides full-text search which also searches for text in diagrams. Glossary provides a list of &ldquo;terms&rdquo; - a dictionary of the language of the system. It needs improvements - currently it shows all actions. Uncheck &ldquo;Hide UUID&rdquo; to see the elements. Elements can be filtered using the filter text field. There is a link to the source code on GitHub in the footer. Connections (relationships) are not mapped in this demo. The the above diagram is a System Context diagram, which is a good starting point for diagramming and documenting a software system, allowing you to step back and see the big picture. Draw a diagram showing your system as a box in the centre, surrounded by its users and the other systems that it interacts with. Mapping Root -&gt; ArchitectureDescription Surroundings -&gt; Node Internet Banking System -&gt; CompositeNode Root -&gt; ArchitectureDescription The root of the diagram is mapped to Architecture Description with the type property set to ArchitectureDescription This documentation was generated from internet-banking-system-architecture.md markdown file with the image above embedded using png-resource fenced block and the diagram embedded using drawio fenced block with representations/drawio/diagram expansion token. Diagram semantic elements were mapped to the root semantic element (ArchitectureDescription) using the following feature-map: container:\n  self: \n    elements:\n      path: 2\n      comparator: label\n The above mapping means that use the semantic element of this diagram element (root) and add semantic elements of its descendants at path length 2 to the elements reference ordering by label. Path length is set to 2 because the diagram elements are contained by the background layer, which is in turn contained by the root. page-element set to true specifies that the root semantic element shall also be the page&rsquo;s semantic elements. Because this is the top-level page (not linked from diagram elements), it also becomes the document&rsquo;s semantic element and as such the contents element of the diagram&rsquo;s Ecore resource. spec sets archtiecture description name to &ldquo;Internet Banking System Architecture&rdquo; - this is what is displayed in the grey navigation bar above: name: Internet Banking System Architecture\n Surroundings -&gt; Node &ldquo;Personal Banking Customer&rdquo;, &ldquo;E-mail System&rdquo;, and &ldquo;Mainframe Banking System&rdquo; diagram elements are mapped to Node. They have semantic-id property to demonstrate its usage. Another way to provide meaningful ID&rsquo;s and URL&rsquo;s is to edit element ID&rsquo;s - this approach is used on lower-level diagrams. The &ldquo;Personal Banking Customer&rdquo; element does not have an image associated with it and therefore uses an explicit icon spec: icon: https://img.icons8.com/officel/16/user.png\n Tooltips are copied from descriptions on the C4 Model diagram. Internet Banking System -&gt; CompositeNode The &ldquo;Internet Banking System&rdquo; diagram element is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Container Diagram&rdquo; page. As such, its semantic element is mapped to the &ldquo;Container Diagram&rdquo; page element as well allowing further mapping on that page. Generation This site was generated with 85 lines of Java code in a JUnit test. Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to"},"references/eClassifiers/Actor/index.html":{"action-uuid":"4a4321f3-a3fe-475c-ad67-cd098432b1a8","title":"Actor","content":"Actors play roles/have responsibilies on model elements implementing Undergoer"},"demo/aws/glossary.html":{"action-uuid":"4d82a9de-de24-4915-9d01-7c47db542769","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/ArchitectureDescriptionElement/inheritance.html":{"path":"ArchitectureDescriptionElement/Inheritance","action-uuid":"4239a811-6651-4482-b81e-a501799dc825","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Tunnel/inheritance.html":{"path":"Tunnel/Inheritance","action-uuid":"523daab1-55f5-48af-9bd5-d1996b0a81f7","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/ArchitectureElement/references/eStructuralFeatures/icon/index.html":{"path":"ArchitectureElement/Attributes/icon","action-uuid":"a207da08-4db5-4631-b8f1-bd6eaac7bb17","title":"icon","content":"Architecture element icon. Treated as URL if contains / or as a CSS class otherwise. E.g. fas fa-wrench would be treated as a CSS class. If this attribute is blank then the type icon is used. For example, a generic server icon defined at the Server type can be overridden by an icon defined at a server instance (e.g. Web Server)."},"references/eClassifiers/Role/references/eStructuralFeatures/extensions/index.html":{"path":"Role/References/extensions","action-uuid":"4e73603b-629d-47af-b9d2-28a36e07b622","title":"extensions","content":"Roles extending this role"},"references/eClassifiers/CompositeNode/index.html":{"action-uuid":"25bc6960-083d-49ab-8200-441cea50ea07","title":"CompositeNode","content":"Node which is also a domain. I.e. it may contain other architecture description elements."},"demo/internet-banking-system/search.html":{"action-uuid":"f54c6ccc-7e94-4583-8b2a-11a2a1fde0a6","title":"Search","content":"Clear"},"references/eClassifiers/Undergoer/inheritance.html":{"path":"Undergoer/Inheritance","action-uuid":"94939d7c-3b64-4ad5-aa4b-83d923e30b35","title":"Inheritance","content":"Subtypes "},"references/eClassifiers/Role/references/eStructuralFeatures/extends/index.html":{"path":"Role/References/extends","action-uuid":"8c3844fa-a111-4ca2-8a47-f44bba7cccf1","title":"extends","content":"A role can be a specialization (extension) of one or more roles"},"index.html":{"action-uuid":"4753bc1d-40e4-4f39-81d3-98a3e0fe8447","title":"architecture","content":"Classes for documenting (software) architectures"},"references/eClassifiers/ArchitectureElement/index.html":{"action-uuid":"cd9e3b43-2c2f-4417-a252-c73750883ddb","title":"ArchitectureElement","content":"Base class for elements of architecture"},"references/eClassifiers/ArchitectureElement/inheritance.html":{"path":"ArchitectureElement/Inheritance","action-uuid":"9aacfd7e-3468-4130-9b97-ff2710e58f3c","title":"Inheritance","content":"Supertypes Subtypes  "},"demo/aws/references/elements/UEzPUAAOIrF-is8g5C7q-175/references/elements/UEzPUAAOIrF-is8g5C7q-177/index.html":{"path":"AWS Cloud/Amazon S3 Bucket","action-uuid":"c85bb622-29fb-4ba1-bfa6-3e75b54cb9eb","title":"Amazon S3 Bucket","content":"S3 Bucket full of digital water. Amazon S3 Bucket Actor Amazon S3 Bucket Actor"},"references/eClassifiers/ArchitectureDescription/index.html":{"action-uuid":"4d3184b8-1555-49d1-91cb-77c2740b453a","title":"ArchitectureDescription","content":"Architecture description contains architecture elements and reference elements such as stakeholders. Architecture description elements are keyed by string identifiers which allows to implement architecture inheritance similar to inheritance in object-oriented languages such as Java or layering in Docker images - a new architecture may be derived from an existing architecture by applying a layer of deltas. This is also similar to a commit tree in Git."},"demo/aws/search.html":{"action-uuid":"7c3685b0-10a6-46fb-9242-e1486129a73e","title":"Search","content":"Clear"},"references/eClassifiers/RelationshipSource/index.html":{"action-uuid":"618dce6c-617c-49b9-993e-d4bf75afbef8","title":"RelationshipSource","content":"Source of relationships uniquely identified by string ids. It provides support for architecture inheritance/layering - replacing (overriding), adding, or removing relationships"},"references/eClassifiers/Relationship/inheritance.html":{"path":"Relationship/Inheritance","action-uuid":"13ba8998-c98c-4229-82f8-630f2eb70066","title":"Inheritance","content":"Supertypes Subtypes  "},"demo/aws/references/elements/UEzPUAAOIrF-is8g5C7q-175/index.html":{"action-uuid":"0a6c7740-7039-4240-ac4e-2b9bb0334986","title":"AWS Cloud","content":"In-line Markdown documentation Alice -&gt; Bob One Two Three H1 H2 C1 C2"},"references/eClassifiers/Actor/references/eStructuralFeatures/roles/index.html":{"path":"Actor/References/roles","action-uuid":"48e795c4-ed94-4a48-bf1d-3dad35c5a1f6","title":"roles","content":"Roles played by this actor"},"references/eClassifiers/ArchitectureDescription/references/eStructuralFeatures/actors/index.html":{"path":"ArchitectureDescription/References/actors","action-uuid":"ef29946e-ad09-4639-a46a-a4732390581c","title":"actors","content":"Actors operating on the elements of this architecture description"},"references/eClassifiers/PersonActor/inheritance.html":{"path":"PersonActor/Inheritance","action-uuid":"b59ff180-8715-424b-8112-e3afd51879cf","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/CompositeRelationshipSource/inheritance.html":{"path":"CompositeRelationshipSource/Inheritance","action-uuid":"573e9c6b-06d3-4b1a-a5da-8064088508d5","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Node/index.html":{"action-uuid":"0bf054b1-19b1-42cc-a78b-8ff24195d005","title":"Node","content":"Node is both relationship source and target. I.e. it may have both incoming and outgoing relationships."},"references/eClassifiers/Tunnel/index.html":{"action-uuid":"b5143c7f-a700-4072-91a7-90f4d8e1739f","title":"Tunnel","content":"Tunnel is a relationship which logically groups other relationships. For example, two composite nodes may have a tunnel relationship which groups relationships between their child elements. A real life example is a VPN tunnel between two networks."},"references/eClassifiers/Node/inheritance.html":{"path":"Node/Inheritance","action-uuid":"6e8ba265-40d7-476a-89a9-84b4995bd3a6","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/RelationshipSource/inheritance.html":{"path":"RelationshipSource/Inheritance","action-uuid":"78aa03a9-0f13-4029-84b6-1879134bee06","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/Role/index.html":{"action-uuid":"88996ace-4b13-4e0e-b261-56638a8f4db7","title":"Role","content":"A role is played by an Actor performing activities on the containing Undergoer"},"demo/internet-banking-system/r0/internet-banking-system/index.html":{"action-uuid":"74ed3217-f584-43b3-a427-690163d5f580","title":"Internet Banking System","content":"The the above diagram is a Container diagram, which is &ldquo;zoom-in to the system boundary&rdquo;. Mapping Surroundings -&gt; selectors &ldquo;Personal Banking Customer&rdquo;, &ldquo;E-mail System&rdquo;, and &ldquo;Mainframe Banking System&rdquo; diagram elements are mapped to the same semantic elements as on the System Context Diagram using selectors. The system context diagram defines the surrounding nodes and this diagram references them. This is a selector of the &ldquo;E-mail System&rdquo;: getDocument().getModelElementByProperty('semantic-id', 'microsoft-exchange')\n The loading logic &ldquo;carries over&rdquo; tooltips from the System Context Diagram to this diagram. Internet Banking System The &ldquo;Internet Banking System&rdquo; container maps to the same semantic element as on the System Context diagram because: The &ldquo;Internet Banking System&rdquo; element on the System Context Diagram links to this diagram page. The &ldquo;Internet Banking System&rdquo; element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;Internet Banking System&rdquo; element are mapped to the elements reference and ordered with the flow comparator: container:\n  self: \n    elements:\n      path: 1\n      comparator: \n        flow: \n          fallback: label\n          condition: id != 'send-email'\n The condition prevents traversal of the &ldquo;API Application&rdquo; -&gt; &ldquo;E-mail System&rdquo; connection. It is not really necessary here - the order would not change without it. It is provided as an example because connection conditions may be necessary in some cases for proper ordering in diagrams with connection cycles. Containers All containers within the system except the &ldquo;API Application&rdquo; are mapped to Nodes, similar to the surroundings on the System Context diagram. API Application The &ldquo;API Application&rdquo; diagram element is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Container Diagram&rdquo; page. As such, its semantic element is mapped to the &ldquo;API Application Component Diagram&rdquo; page element as well allowing further mapping on that page. This diagram element defines base-uri property as %id%/. Because &ldquo;Placeholders&rdquo; is checked, %id%/ expands to api-application/ during loading. doc-ref is set to readme.md, which in combination with base-uri resolves to api-appliction/readme.md. Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using"},"demo/aws/index.html":{"action-uuid":"ba844307-a9f2-4396-a6ae-81d617e55524","title":"AWS","content":" Amazon VPC Account Baseline Shared Services Account Account Baseline Aggregate CloudTrail and Config Logs Log Archive Account Account Baseline Security Cross-Account Roles Amazon GuardDuty Amazon SNS Security Account Amazon S3 Bucket AWS CodePipeline AWS Organizations AWS Single Sign-on Account Baseline AWS Service Catalog AWS Parameter Store purum Core OU AWS Cloud Amazon VPC Account Baseline Shared Services Account Account Baseline Aggregate CloudTrail and Config Logs Log Archive Account Account Baseline Security Cross-Account Roles Amazon GuardDuty Amazon SNS Security Account Amazon S3 Bucket AWS CodePipeline AWS Organizations AWS Single Sign-on Account Baseline AWS Service Catalog AWS Parameter Store purum Core OU AWS Cloud"},"references/eClassifiers/Undergoer/references/eStructuralFeatures/roles/index.html":{"path":"Undergoer/References/roles","action-uuid":"68bc52c6-c7d3-4849-b7b6-c4d4f11f8243","title":"roles","content":"Actors in this role"},"references/eClassifiers/CompositeRelationshipTarget/index.html":{"action-uuid":"faa278b4-ec09-46df-930c-6b6593ce4b3c","title":"CompositeRelationshipTarget","content":"Relationship target which is also a domain, i.e. it may contain other architecture description elements"},"references/eClassifiers/PartyActor/inheritance.html":{"path":"PartyActor/Inheritance","action-uuid":"23f0e6d6-ed3d-45e3-b2c5-8b6742abc11e","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/CompositeNode/inheritance.html":{"path":"CompositeNode/Inheritance","action-uuid":"667ee0b7-4112-4f2e-aac4-3991c19d1914","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Domain/index.html":{"action-uuid":"81c384bc-7c1f-4bb6-95e7-0677e76dba74","title":"Domain","content":"Domains allow to organize architecture descriptions into a hierarchy"},"glossary.html":{"action-uuid":"d57ba834-25a5-4355-acfd-d7f6901eb44a","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/Relationship/index.html":{"action-uuid":"114e6753-fd88-4fd5-a507-b59cabb22b74","title":"Relationship","content":"Relationship between two architecture description elements. Relationships are contained by their source and uniquiely identified in the source by a string id. This allows to implement relationship inheritance behaviors such as overriding (replacing), adding, or removing."},"references/eClassifiers/CompositeRelationshipSource/index.html":{"action-uuid":"1b8a2f75-ee90-49d3-a8c0-2bdd028890ae","title":"CompositeRelationshipSource","content":"Relationship source which is also a domain. I.e. it may contain other architecture description elements."},"references/eClassifiers/Domain/inheritance.html":{"path":"Domain/Inheritance","action-uuid":"a2e4deb6-9806-4ebe-a2f0-48ff06833a6e","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ArchitectureDescription/inheritance.html":{"path":"ArchitectureDescription/Inheritance","action-uuid":"aa0d1f72-5f2e-4f09-9801-a3cad7fcfa8c","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/RelationshipTarget/inheritance.html":{"path":"RelationshipTarget/Inheritance","action-uuid":"93bace4d-1314-451d-b128-a6d3b2d67ce3","title":"Inheritance","content":"Supertypes Subtypes  "},"demo/internet-banking-system/r0/internet-banking-system/rh/api-application/rh/mainframe-banking-system-facade/index.html":{"path":"Internet Banking System/API Application/com.bigankplc.internetbanking.component.mainframe","action-uuid":"ec971953-e17e-4d53-9109-e429d30ca8a3","title":"com.bigankplc.internetbanking.component.mainframe","content":"The the above diagram is a Code diagram, which is used to show how a component is implemented as code. Diagram elements were taken from the Drawio UML shapes palette. Icons were added by manually adding image=https://cdn.jsdelivr.net/gh/Nasdanika-Models/ecore@master/graph/web-resources/icons/EClass.gif; to the style. Mapping The package container maps to the same semantic element as on the API Application Component diagram because: The &ldquo;Mainframe Banking System Facade&rdquo; element on the API Application Component diagram links to this diagram page. The package element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;API Application&rdquo; element are mapped to the elements reference with ordering by label comparator: container:\n  self:\n    elements:\n      path: 1\n      comparator: label\n All code elements within the package are mapped to Nodes. Representation element filtering Fill color of MainframeBankingSystemFacadeImpl is set during the generation with the following code: @Override\nprotected void filterRepresentationElement(\n\t\tElement representationElement, \n\t\tEObject semanticElement,\n\t\tMap&lt;EObject, EObject&gt; registry, \n\t\tProgressMonitor progressMonitor) {\n\n\tsuper.filterRepresentationElement(representationElement, semanticElement, registry, progressMonitor);\n\t\n\tif (representationElement instanceof Node) {\n\t\tNode node = (Node) representationElement;\n\t\tif (&quot;MainframeBankingSystemFacadeImpl&quot;.equals(node.getId())) {\n\t\t\tnode.getStyle().put(&quot;fillColor&quot;, &quot;#ffe6cc&quot;);\n\t\t\tnode.getStyle().put(&quot;strokeColor&quot;, &quot;#d79b00&quot;);\n\t\t}\n\t}\t\t\t\t\t\n}\n Representation filtering may be used to inject information which is not available during diagram creation or dynamic, but is available during generation. In this example the background color may represent code component &ldquo;health&rdquo; - code coverage, number and severity of SonarQube findings, etc. At higher level diagrams it may represent, say: During construction: development progress - pending, in progress, blocked, behind schedule, &hellip; After deployment: container runtime status - errors, CPU load, memory consumption, &hellip; +throws MainframeBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException +throws MainframeBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException"},"demo/internet-banking-system/glossary.html":{"action-uuid":"dca05eef-b7b5-48ed-a096-5f042f72d317","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/eClassifiers/RelationshipTarget/index.html":{"action-uuid":"ed2e6d2e-11e1-4840-8605-e9a4c01a4c39","title":"RelationshipTarget","content":"An architecture description which can have incoming relationships"},"demo/aws/references/elements/UEzPUAAOIrF-is8g5C7q-175/references/elements/UEzPUAAOIrF-is8g5C7q-184/index.html":{"path":"AWS Cloud/Core OU","action-uuid":"30ddadf9-cef0-4e7d-b64c-2cfaa68f2ddc","title":"Core OU","content":" Actor"},"references/eClassifiers/Undergoer/index.html":{"action-uuid":"eccd3403-a599-41a5-90bb-9f63793ee0bf","title":"Undergoer","content":"Something operated on by actors in roles. A container of roles referencing actors. For example, a Server is patched by the &ldquo;Unix Support&rdquo; role and Joe Doe plays this role."},"references/eClassifiers/Role/inheritance.html":{"path":"Role/Inheritance","action-uuid":"fb931ef1-c5eb-485e-a48e-d4051b6a0eb3","title":"Inheritance","content":"Supertypes "},"references/eClassifiers/Actor/inheritance.html":{"path":"Actor/Inheritance","action-uuid":"a445de6e-6cb1-4a65-978a-ba796d3bc2d3","title":"Inheritance","content":"Supertypes Subtypes  "},"references/eClassifiers/ArchitectureDescriptionElement/index.html":{"action-uuid":"0ba9dfc0-1114-4ec7-84bb-5762f5acfe51","title":"ArchitectureDescriptionElement","content":"Base class for elements of architecture descriptions"}}