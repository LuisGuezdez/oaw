/*******************************************************************************
* Copyright (C) 2012 INTECO, Instituto Nacional de Tecnologías de la Comunicación, 
* This program is licensed and may be used, modified and redistributed under the terms
* of the European Public License (EUPL), either version 1.2 or (at your option) any later 
* version as soon as they are approved by the European Commission.
* Unless required by applicable law or agreed to in writing, software distributed under the 
* License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
* ANY KIND, either express or implied. See the License for the specific language governing 
* permissions and more details.
* You should have received a copy of the EUPL1.2 license along with this program; if not, 
* you may find it at http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX:32017D0863
* - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
* Modificaciones: MINHAFP (Ministerio de Hacienda y Función Pública) 
* Email: observ.accesibilidad@correo.gob.es
******************************************************************************/
package es.inteco.plugin;

import java.util.Map;

/**
 * The Class Cartucho.
 *
 * @author a.mesas Esta clase define un cartucho generico, el cual únicamente va a tener un método que dado una url y el contenido de una página ejecutará El analisis correspondiente a dicho cartucho.
 */
public abstract class Cartucho {

    /**
	 * Analyzer.
	 *
	 * @param datos the datos
	 */
    public abstract void analyzer(Map<String, Object> datos);

    /**
	 * Sets the config.
	 *
	 * @param idRastreo the new config
	 */
    public abstract void setConfig(long idRastreo);

}