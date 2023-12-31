<!--
Copyright (C) 2012 INTECO, Instituto Nacional de Tecnologías de la Comunicación, 
This program is licensed and may be used, modified and redistributed under the terms
of the European Public License (EUPL), either version 1.2 or (at your option) any later 
version as soon as they are approved by the European Commission.
Unless required by applicable law or agreed to in writing, software distributed under the 
License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
ANY KIND, either express or implied. See the License for the specific language governing 
permissions and more details.
You should have received a copy of the EUPL1.2 license along with this program; if not, 
you may find it at http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX:32017D0863
-->
<%@ include file="/common/taglibs.jsp" %>
<html:xhtml/>

<logic:messagesPresent message="false">
	<div class="alert alert-danger alert-dismissible">
		<ul>
			<html:messages id="error" message="false">
				<li><bean:write name="error"/></li>
			</html:messages>
		</ul>
	</div>
</logic:messagesPresent>

<logic:messagesPresent message="true">
	<div class="alert alert-info alert-dismissible">
		<ul>
			<html:messages id="error" message="true">
				<li><bean:write name="error"/></li>
			</html:messages>
		</ul>
	</div>
</logic:messagesPresent>

<% request.getSession().removeAttribute("org.apache.struts.action.ACTION_MESSAGE");%>
