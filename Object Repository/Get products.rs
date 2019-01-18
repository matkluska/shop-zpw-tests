<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Get products</name>
   <tag></tag>
   <elementGuidId>7021f296-8eb6-40b6-ab3b-65adb3df9ed4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>https://hidden-meadow-13855.herokuapp.com/api/products?</restUrl>
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
      <name>productsNames</name>
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
def products = jsonSlurper.parseText(response.getResponseText())

def variables = request.getVariables()
def productNames = variables.get('productsNames')
def productsExists = new ArrayList(productNames.size())

for(def name: productNames) {
	assert products.find {p -> p.name == name}!=null
}</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
