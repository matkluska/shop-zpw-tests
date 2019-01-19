<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Add order</name>
   <tag></tag>
   <elementGuidId>bb752b3a-aa2d-401c-9dc8-e4ed833f2414</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;email\&quot;:\&quot;admin@shop.com\&quot;,\&quot;firstName\&quot;:\&quot;Jan\&quot;,\&quot;lastName\&quot;:\&quot;Kowalski\&quot;,\&quot;city\&quot;:\&quot;Kraków\&quot;,\&quot;street\&quot;:\&quot;Czarnowiejska, 12\&quot;,\&quot;postalCode\&quot;:\&quot;32-054\&quot;,\&quot;products\&quot;:[{\&quot;name\&quot;:\&quot;sdfsd\&quot;,\&quot;products_quantity\&quot;:4,\&quot;price\&quot;:21,\&quot;description\&quot;:\&quot;\&quot;,\&quot;photo_url\&quot;:\&quot;\&quot;,\&quot;category\&quot;:\&quot;other\&quot;,\&quot;is_ready\&quot;:false,\&quot;id\&quot;:\&quot;5c158c057c94efc8d77c05aa\&quot;}],\&quot;totalValue\&quot;:84,\&quot;state\&quot;:\&quot;Waiting\&quot;,\&quot;shippingTime\&quot;:null}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://hidden-meadow-13855.herokuapp.com/api/orders?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
