var searchDocuments = {"glossary.html":{"action-uuid":"9923791c-7d69-43eb-84b4-a69e7dbe44df","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/elements/internet-banking-system/references/elements/api-application/index.html":{"path":"Internet Banking System/API Application","action-uuid":"ea811a27-4884-422e-99f9-4981a5c25185","title":"API Application","content":"The the above diagram is a Component diagram, which is used to &ldquo;decompose each container further to identify the major structural building blocks and their interactions&rdquo;. Mapping Surroundings -&gt; selectors Similar to the container diagram, diagram elements representing the surroundings of the &ldquo;API Application&rdquo; are mapped to semantic elements defined on the higher level diagrams using selectors. The system context diagram defines the surrounding nodes and this diagram references them. This is a selector of the &ldquo;Single-Page Application&rdquo;: getDocument().getModelElementById('single-page-application')\n The loading logic &ldquo;carries over&rdquo; tooltips from the System Context Diagram to this diagram. API Application The &ldquo;API Application&rdquo; container maps to the same semantic element as on the Container diagram because: The &ldquo;API Application&rdquo; element on the Container diagram links to this diagram page. The &ldquo;API Application&rdquo; element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;API Application&rdquo; element are mapped to the elements reference and ordered with the right-down comparator: container:\n  self:\n    elements:\n      path: 1\n      comparator: right-down\n Components All components within the container except the &ldquo;Mainframe Banking System Facade&rdquo; are mapped to Nodes. The &ldquo;Mainframe Banking System Facade&rdquo; component is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Mainframe Banking System Facade Code&rdquo; page. As such, its semantic element is mapped to the &ldquo;Mainframe Banking System Facade Code&rdquo; page element as well allowing further mapping on that page. This diagram element defines base-uri property as %id%/. Because &ldquo;Placeholders&rdquo; is checked, %id%/ expands to mainframe-banking-system-facade/ during loading. doc-ref is set to readme.md, which in combination with base-uri of this element and its containing element resolves to api-appliction/mainframe-banking-system-facade/readme.md. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS] Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS]"},"references/elements/internet-banking-system/references/elements/api-application/references/elements/mainframe-banking-system-facade/index.html":{"path":"Internet Banking System/API Application/com.bigankplc.internetbanking.component.mainframe","action-uuid":"8500c767-9bb2-4cee-bf74-91ab1219823d","title":"com.bigankplc.internetbanking.component.mainframe","content":"The the above diagram is a Code diagram, which is used to show how a component is implemented as code. Diagram elements were taken from the Drawio UML shapes palette. Icons were added by manually adding image=https://cdn.jsdelivr.net/gh/Nasdanika-Models/ecore@master/graph/web-resources/icons/EClass.gif; to the style. Mapping The package container maps to the same semantic element as on the API Application Component diagram because: The &ldquo;Mainframe Banking System Facade&rdquo; element on the API Application Component diagram links to this diagram page. The package element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;API Application&rdquo; element are mapped to the elements reference with ordering by label comparator: container:\n  self:\n    elements:\n      path: 1\n      comparator: label\n All code elements within the package are mapped to Nodes. Representation element filtering Fill color of MainframeBankingSystemFacadeImpl is set during the generation with the following code: @Override\nprotected void filterRepresentationElement(\n\t\tElement representationElement, \n\t\tEObject semanticElement,\n\t\tMap&lt;EObject, EObject&gt; registry, \n\t\tProgressMonitor progressMonitor) {\n\n\tsuper.filterRepresentationElement(representationElement, semanticElement, registry, progressMonitor);\n\t\n\tif (representationElement instanceof Node) {\n\t\tNode node = (Node) representationElement;\n\t\tif (&quot;MainframeBankingSystemFacadeImpl&quot;.equals(node.getId())) {\n\t\t\tnode.getStyle().put(&quot;fillColor&quot;, &quot;#ffe6cc&quot;);\n\t\t\tnode.getStyle().put(&quot;strokeColor&quot;, &quot;#d79b00&quot;);\n\t\t}\n\t}\t\t\t\t\t\n}\n Representation filtering may be used to inject information which is not available during diagram creation or dynamic, but is available during generation. In this example the background color may represent code component &ldquo;health&rdquo; - code coverage, number and severity of SonarQube findings, etc. At higher level diagrams it may represent, say: During construction: development progress - pending, in progress, blocked, behind schedule, &hellip; After deployment: container runtime status - errors, CPU load, memory consumption, &hellip; +throws MainframeBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException +throws MainframeBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException"},"index.html":{"action-uuid":"45e46b02-b55f-4537-9d00-54a4c4bac66e","title":"Internet Banking System Architecture","content":"This site was generated as explained below: A Drawio diagram of an Internet Banking System was created based on images and descriptions from The C4 model for visualising software architecture. Descriptions of elements and diagrams were copied verbatim under the terms of Creative Commons Attribution 4.0 International License. The diagram uses free icons from Icons8 to provide visual distinction between architecture elements. The diagram was mapped to the Architecture model using properties of the diagram elements as explained in the Beyond Diagrams book. Then the architecture model was transformed to the HTML Application model and a static web site was generated from that model. For the majority of elements icons were generated from the diagram images of the respective elements. The web site is deployed by GitHub Pages. Notes: Diagram elements have tooltips with descriptions from the C4 model site. A click on a diagram element navigates to the element page. The left navigation provides a filter to quickly find a model element by name. Search provides full-text search which also searches for text in diagrams. Glossary provides a list of &ldquo;terms&rdquo; - a dictionary of the language of the system. It needs improvements - currently it shows all actions. Uncheck &ldquo;Hide UUID&rdquo; to see the elements. Elements can be filtered using the filter text field. There is a link to the source code on GitHub in the footer. Connections (relationships) are not mapped in this demo. The the above diagram is a System Context diagram, which is a good starting point for diagramming and documenting a software system, allowing you to step back and see the big picture. Draw a diagram showing your system as a box in the centre, surrounded by its users and the other systems that it interacts with. Mapping Root -&gt; ArchitectureDescription Surroundings -&gt; Node Internet Banking System -&gt; CompositeNode Root -&gt; ArchitectureDescription The root of the diagram is mapped to Architecture Description with the type property set to ArchitectureDescription This documentation was generated from internet-banking-system-architecture.md markdown file with the image above embedded using png-resource fenced block and the diagram embedded using drawio fenced block with representations/drawio/diagram expansion token. Diagram semantic elements were mapped to the root semantic element (ArchitectureDescription) using the following feature-map: container:\n  self: \n    elements:\n      path: 2\n      comparator: label\n The above mapping means that use the semantic element of this diagram element (root) and add semantic elements of its descendants at path length 2 to the elements reference ordering by label. Path length is set to 2 because the diagram elements are contained by the background layer, which is in turn contained by the root. page-element set to true specifies that the root semantic element shall also be the page&rsquo;s semantic elements. Because this is the top-level page (not linked from diagram elements), it also becomes the document&rsquo;s semantic element and as such the contents element of the diagram&rsquo;s Ecore resource. spec sets archtiecture description name to &ldquo;Internet Banking System Architecture&rdquo; - this is what is displayed in the grey navigation bar above: name: Internet Banking System Architecture\n Surroundings -&gt; Node &ldquo;Personal Banking Customer&rdquo;, &ldquo;E-mail System&rdquo;, and &ldquo;Mainframe Banking System&rdquo; diagram elements are mapped to Node. They have semantic-id property to demonstrate its usage. Another way to provide meaningful ID&rsquo;s and URL&rsquo;s is to edit element ID&rsquo;s - this approach is used on lower-level diagrams. The &ldquo;Personal Banking Customer&rdquo; element does not have an image associated with it and therefore uses an explicit icon spec: icon: https://img.icons8.com/officel/16/user.png\n Tooltips are copied from descriptions on the C4 Model diagram. Internet Banking System -&gt; CompositeNode The &ldquo;Internet Banking System&rdquo; diagram element is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Container Diagram&rdquo; page. As such, its semantic element is mapped to the &ldquo;Container Diagram&rdquo; page element as well allowing further mapping on that page. Generation This site was generated with a JUnit test. Another way to generate documentation site is to use Nasdanika CLI app/model/site command or app/model/action command and then app/site command. Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to"},"references/elements/internet-banking-system/index.html":{"action-uuid":"7a53a7d3-aa18-4392-9d31-728838b8ee45","title":"Internet Banking System","content":"The the above diagram is a Container diagram, which is &ldquo;zoom-in to the system boundary&rdquo;. Mapping Surroundings -&gt; selectors &ldquo;Personal Banking Customer&rdquo;, &ldquo;E-mail System&rdquo;, and &ldquo;Mainframe Banking System&rdquo; diagram elements are mapped to the same semantic elements as on the System Context Diagram using selectors. The system context diagram defines the surrounding nodes and this diagram references them. This is a selector of the &ldquo;E-mail System&rdquo;: getDocument().getModelElementByProperty('semantic-id', 'microsoft-exchange')\n The loading logic &ldquo;carries over&rdquo; tooltips from the System Context Diagram to this diagram. Internet Banking System The &ldquo;Internet Banking System&rdquo; container maps to the same semantic element as on the System Context diagram because: The &ldquo;Internet Banking System&rdquo; element on the System Context Diagram links to this diagram page. The &ldquo;Internet Banking System&rdquo; element on this diagram has page-element property set to true. Semantic elements of the child elements of the &ldquo;Internet Banking System&rdquo; element are mapped to the elements reference and ordered with the flow comparator: container:\n  self: \n    elements:\n      path: 1\n      comparator: \n        flow: \n          fallback: label\n          condition: id != 'send-email'\n The condition prevents traversal of the &ldquo;API Application&rdquo; -&gt; &ldquo;E-mail System&rdquo; connection. It is not really necessary here - the order would not change without it. It is provided as an example because connection conditions may be necessary in some cases for proper ordering in diagrams with connection cycles. Containers All containers within the system except the &ldquo;API Application&rdquo; are mapped to Nodes, similar to the surroundings on the System Context diagram. API Application The &ldquo;API Application&rdquo; diagram element is mapped to CompositeNode because it has sub-elements. It is linked to the &ldquo;Container Diagram&rdquo; page. As such, its semantic element is mapped to the &ldquo;API Application Component Diagram&rdquo; page element as well allowing further mapping on that page. This diagram element defines base-uri property as %id%/. Because &ldquo;Placeholders&rdquo; is checked, %id%/ expands to api-application/ during loading. doc-ref is set to readme.md, which in combination with base-uri resolves to api-appliction/readme.md. Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using"}}