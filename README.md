# Insurance Alerts Application

Overview:

This application is used to alert insurance policy holders of any upcoming catastrophic events based on the data from Weather company.

This application will periodically invoke Alerts API and in case of any severe/critical events, will send an SMS to the policy holders.

This application uses Java Cloudant Starter from Bluemix as the base. 

In the local environment, WLP can be used to test application. Cloudant DB on Bluemix will used as the datastore. 

SMS alerts will be sent using cloud communications platform such as Twilio.

## Build & Runtime Environments:

1. Maven
2. WLP
3. Bluemix
4. Cloudant DB


