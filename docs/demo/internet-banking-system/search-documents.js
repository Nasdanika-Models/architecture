var searchDocuments = {"glossary.html":{"action-uuid":"cc463435-cd18-428e-ba19-eee207fd9622","title":"Glossary","content":"Clear Identifier(s) Hide UUID {{data.value.name}} {{data.value[0].value}} {{item.value}}"},"references/elements/internet-banking-system/references/elements/api-application/index.html":{"path":"Internet Banking System/API Application","action-uuid":"df78783a-0bb6-4f1c-a8ee-dac023f271c6","title":"API Application","content":" Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS] Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Uses Sign In Controller Allows users to sign in to the Internet Banking System. Mainframe Banking System Facade A facade onto the mainframe banking system. Security Component Provides functionality related to signing in, changing passwords, etc. Uses Uses Reset Password Controller Allows users to reset their passwords with a single use URL. Uses Accounts Summary Controller Provides customers wiht a summary of their bank accounts. E-mail Component Sends e-mails to users. API Application Provides Internet banking functionality via a JSP/HTTPS API. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] Sends e-mail using Makes API calls to [XML/HTTPS]"},"references/elements/internet-banking-system/references/elements/api-application/references/elements/mainframe-banking-system-facade/index.html":{"path":"Internet Banking System/API Application/Mainframe Banking System Facade","action-uuid":"845cbf66-e5be-43be-8518-594647c6c133","title":"Mainframe Banking System Facade","content":" +throws MainframBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException +throws MainframBankingSystemFacadeImpl AbstractResponse AbstractRequest GetBalanceRequest GetBalanceResponse BankingSystemConnection MainframeBankingSystemFacade MainframeBankingSystemException +sends +receives +parses +uses +creates com.bigankplc.internetbanking.component.mainframe A facade onto the mainframe banking system. InternetBankingSystemException"},"index.html":{"action-uuid":"2ac53186-8557-42ac-b7cc-075a4d3d1b3c","title":"Internet Banking System Architecture","content":" Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Gets account information from, and makes payments using Sends e-mail using Internet Banking System Allows customers to view information about their bank accounts, and make payments. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Sends e-mails to"},"references/elements/internet-banking-system/index.html":{"action-uuid":"1090415b-5865-498b-b164-c85f8f0206bb","title":"Internet Banking System","content":" Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using Personal Banking Customer A customer of the bank, with personal bank accounts. Mainframe Banking System Stores all of the core banking information about customers, accounts, transactions, etc. E-mail System The internal Microsoft Exchange e-mail system. Database Stores user registration information, hashed authentication credentials, access logs, etc. Delivers to the customer's web browser Web Application Delivers the static content and the Internet banking single page application. Makes API calls to [JSON/HTTPS] Single-Page Application Provides all of the Internet banking functionality to customers via their web browser. Makes API calls to [JSON/HTTPS] Mobile App Provides a limited subset of the Internet banking functionality to customers via their mobile device. Reads from and writes to [SQL/TCP] API Application Provides Internet banking functionality via a JSP/HTTPS API. Internet Banking System Allows customers to view information about their bank accounts, and make payments. Sends e-mails to Sends e-mail using Makes API calls to [XML/HTTPS] Visits bigbank.com/ib using [HTTPS] Views account balances, and makes payments using Views account balances, and makes payments using"}}