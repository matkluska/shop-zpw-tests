<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Put product</name>
   <tag></tag>
   <elementGuidId>1f2f1d63-d48d-49aa-b67d-ae4bf10cfe1a</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\&quot;id\&quot;:\&quot;${productId}\&quot;,\&quot;name\&quot;:\&quot;${name}\&quot;,\&quot;products_quantity\&quot;:${products_quantity},\&quot;price\&quot;:${price},\&quot;description\&quot;:\&quot;${description}\&quot;,\&quot;photo_url\&quot;:\&quot;https://cdn.shopify.com/s/files/1/0010/9215/7503/t/10/assets/cbt2/images/result-clipboard.png?1029388024731289939\&quot;,\&quot;category\&quot;:\&quot;${category}\&quot;}&quot;,
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
   <restUrl>https://hidden-meadow-13855.herokuapp.com/api/products/${productId}?</restUrl>
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
      <name>productId</name>
   </variables>
   <variables>
      <defaultValue>'Produkt_testowy'</defaultValue>
      <description></description>
      <id>d2d84005-6a68-4c5e-97a5-107651abdeb3</id>
      <masked>false</masked>
      <name>name</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>00dd5a72-fce8-40bd-b1d5-68956d5ef2df</id>
      <masked>false</masked>
      <name>products_quantity</name>
   </variables>
   <variables>
      <defaultValue>0</defaultValue>
      <description></description>
      <id>a557f65f-f172-4742-aa99-340b05890910</id>
      <masked>false</masked>
      <name>price</name>
   </variables>
   <variables>
      <defaultValue>'opis'</defaultValue>
      <description></description>
      <id>6950f510-9aa4-4ab5-9407-cec946148ead</id>
      <masked>false</masked>
      <name>description</name>
   </variables>
   <variables>
      <defaultValue>'other'</defaultValue>
      <description></description>
      <id>226a4805-7109-4e68-b0c1-6167f59cba26</id>
      <masked>false</masked>
      <name>category</name>
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
