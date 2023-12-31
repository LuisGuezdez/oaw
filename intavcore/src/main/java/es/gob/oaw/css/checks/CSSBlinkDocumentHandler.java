/*******************************************************************************
* Copyright (C) 2017 MINHAFP, Ministerio de Hacienda y Función Pública, 
* This program is licensed and may be used, modified and redistributed under the terms
* of the European Public License (EUPL), either version 1.2 or (at your option) any later 
* version as soon as they are approved by the European Commission.
* Unless required by applicable law or agreed to in writing, software distributed under the 
* License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF 
* ANY KIND, either express or implied. See the License for the specific language governing 
* permissions and more details.
* You should have received a copy of the EUPL1.2 license along with this program; if not, 
* you may find it at http://eur-lex.europa.eu/legal-content/EN/TXT/?uri=CELEX:32017D0863
******************************************************************************/
package es.gob.oaw.css.checks;

import com.helger.css.decl.CSSDeclaration;

import es.gob.oaw.css.OAWCSSVisitor;
import es.gob.oaw.css.utils.CSSSACUtils;

import javax.annotation.Nonnull;

/**
 * Clase para detectar si se produccen parpadeos generados desde CSS mediante text-decoration:blink o text-decoration-line:blink.
 */
public class CSSBlinkDocumentHandler extends OAWCSSVisitor {

    /**
	 * On declaration.
	 *
	 * @param cssDeclaration the css declaration
	 */
    @Override
    public void onDeclaration(@Nonnull final CSSDeclaration cssDeclaration) {
        if (isValidMedia()) {
            if ("text-decoration".equals(cssDeclaration.getProperty())
                    || "text-decoration-line".equals(cssDeclaration.getProperty())) {
                final String value = CSSSACUtils.parseLexicalValue(getValue(cssDeclaration));
                if ("blink".equalsIgnoreCase(value)) {
                    getProblems().add(createCSSProblem("", cssDeclaration));
                }
            }
        }
    }

}
