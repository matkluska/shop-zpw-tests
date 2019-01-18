<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get orders</name>
   <tag></tag>
   <elementGuidId>8ca3be78-05f1-4503-9e40-2aae15c08adc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://hidden-meadow-13855.herokuapp.com/api/orders?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>[]</defaultValue>
      <description></description>
      <id>40c6fd79-3c06-4593-86a6-251e9a833d0a</id>
      <masked>false</masked>
      <name>ordersIds</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

def jsonSlurper = new JsonSlurper()
def orders = jsonSlurper.parseText(response.getResponseText())

def variables = request.getVariables()
def ordersIds = variables.get('ordersIds')

for(def id: ordersIds) {
	assert orders.find {o -> o.id == id}!=null
}</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
