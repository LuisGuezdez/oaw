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
package es.inteco.crawler.dao;

import java.io.Serializable;

/**
 * The Class SemillaForm.
 */
public class Seed implements Serializable {
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	/** The id. */
	private Long id;
	/** The depth. */
	private Integer depth;
	/** The width. */
	private Integer width;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the depth.
	 *
	 * @return the depth
	 */
	public Integer getDepth() {
		return depth;
	}

	/**
	 * Sets the depth.
	 *
	 * @param depth the new depth
	 */
	public void setDepth(Integer depth) {
		this.depth = depth;
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
}