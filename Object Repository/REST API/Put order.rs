<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Put order</name>
   <tag></tag>
   <elementGuidId>a047abe0-7080-489b-a8d0-ee1a0690e371</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;email\&quot;:\&quot;admin@shop.com\&quot;,\&quot;firstName\&quot;:\&quot;Jan\&quot;,\&quot;lastName\&quot;:\&quot;Kowalski\&quot;,\&quot;city\&quot;:\&quot;Kraków\&quot;,\&quot;street\&quot;:\&quot;Czarnowiejska, 12\&quot;,\&quot;postalCode\&quot;:\&quot;32-054\&quot;,\&quot;products\&quot;:[{\&quot;name\&quot;:\&quot;sdfsd\&quot;,\&quot;products_quantity\&quot;:4,\&quot;price\&quot;:21,\&quot;description\&quot;:\&quot;\&quot;,\&quot;photo_url\&quot;:\&quot;\&quot;,\&quot;category\&quot;:\&quot;other\&quot;,\&quot;is_ready\&quot;:false,\&quot;id\&quot;:\&quot;${orderId}\&quot;}],\&quot;totalValue\&quot;:84,\&quot;state\&quot;:\&quot;${state}\&quot;,\&quot;shippingTime\&quot;:null}&quot;,
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
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://hidden-meadow-13855.herokuapp.com/api/orders/${orderId}?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>fdd66015-bd52-4e6b-bb02-688c6af030c6</id>
      <masked>false</masked>
      <name>orderId</name>
   </variables>
   <variables>
      <defaultValue>'Waiting'</defaultValue>
      <description></description>
      <id>6950f510-9aa4-4ab5-9407-cec946148ead</id>
      <masked>false</masked>
      <name>state</name>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
