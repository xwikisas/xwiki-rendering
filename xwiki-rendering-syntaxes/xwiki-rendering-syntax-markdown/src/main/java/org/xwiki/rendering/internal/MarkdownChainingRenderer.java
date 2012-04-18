/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.rendering.internal;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.xwiki.rendering.listener.Format;
import org.xwiki.rendering.listener.HeaderLevel;
import org.xwiki.rendering.listener.ListType;
import org.xwiki.rendering.listener.MetaData;
import org.xwiki.rendering.listener.chaining.ListenerChain;
import org.xwiki.rendering.listener.reference.ResourceReference;
import org.xwiki.rendering.renderer.AbstractChainingPrintRenderer;
import org.xwiki.rendering.renderer.printer.DefaultWikiPrinter;
import org.xwiki.rendering.renderer.printer.WikiPrinter;
import org.xwiki.rendering.syntax.Syntax;

/**
 * Convert listener events to XHTML.
 *
 * @version $Id$
 * @since 4.1M1
 */
public class MarkdownChainingRenderer extends AbstractChainingPrintRenderer
{
    /**
     * New Line character.
     */
    private static final String NL = "\n";

    /**
     * True if no empty line has been printed.
     */
    private boolean isFirstElementRendered;

    public MarkdownChainingRenderer(ListenerChain chain)
    {
        setListenerChain(chain);
    }

    @Override public void beginDefinitionDescription()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginDefinitionList(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginDefinitionTerm()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginDocument(MetaData metaData)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beginFormat(Format format, Map<String, String> parameters)
    {
        if (format.equals(Format.BOLD)) {
            getPrinter().print("**");
        } else if (format.equals(Format.ITALIC)) {
            getPrinter().print("_");
        }
    }

    @Override public void beginGroup(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginHeader(HeaderLevel level, String id, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginList(ListType listType, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginListItem()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beginMacroMarker(String name, Map<String, String> macroParameters, String content, boolean isInline)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginMetaData(MetaData metadata)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beginParagraph(Map<String, String> parameters)
    {
        printEmptyLine();
    }

    @Override public void beginQuotation(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginQuotationLine()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginSection(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginTable(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginTableCell(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginTableHeadCell(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void beginTableRow(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endDefinitionDescription()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endDefinitionList(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endDefinitionTerm()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endDocument(MetaData metaData)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void endFormat(Format format, Map<String, String> parameters)
    {
        if (format.equals(Format.BOLD)) {
            getPrinter().print("**");
        } else if (format.equals(Format.ITALIC)) {
            getPrinter().print("_");
        }
    }

    @Override public void endGroup(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endHeader(HeaderLevel level, String id, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endList(ListType listType, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endListItem()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void endMacroMarker(String name, Map<String, String> macroParameters, String content, boolean isInline)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endMetaData(MetaData metadata)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void endParagraph(Map<String, String> parameters)
    {
    }

    @Override public void endQuotation(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endQuotationLine()
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endSection(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endTable(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endTableCell(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endTableHeadCell(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void endTableRow(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onEmptyLines(int count)
    {
        for (int i = 0; i < count; i++) {
            getPrinter().print(NL);
            getPrinter().print("&nbsp;  ");
        }
    }

    @Override public void onHorizontalLine(Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void onId(String name)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override public void onMacro(String id, Map<String, String> macroParameters, String content, boolean isInline)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onNewLine()
    {
        getPrinter().println("  ");
    }

    @Override public void onRawText(String rawContent, Syntax syntax)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onSpace()
    {
        getPrinter().print(" ");
    }

    @Override
    public void onSpecialSymbol(char symbol)
    {
        getPrinter().print(String.valueOf(symbol));
    }

    @Override public void onVerbatim(String protectedString, boolean isInline, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void onWord(String word)
    {
        getPrinter().print(word);
    }

    @Override
    public void onImage(ResourceReference reference, boolean isFreeStandingURI, Map<String, String> parameters)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void beginLink(ResourceReference reference, boolean isFreeStandingURI, Map<String, String> parameters)
    {
        pushPrinter(new DefaultWikiPrinter());
    }

    @Override
    public void endLink(ResourceReference reference, boolean isFreeStandingURI, Map<String, String> parameters)
    {
        WikiPrinter printer = getPrinter();
        String label = printer.toString();
        popPrinter();

        if (StringUtils.isEmpty(label)) {
            getPrinter().print("<");
            getPrinter().print(reference.getReference());
            getPrinter().print(">");
        } else {
            getPrinter().print("[");
            getPrinter().print(label);
            getPrinter().print("]");
            getPrinter().print("(");
            getPrinter().print(reference.getReference());
            getPrinter().print(")");
        }
    }

    /**
     * Add an empty line to the printer.
     */
    private void printEmptyLine()
    {
        if (this.isFirstElementRendered) {
            getPrinter().print(NL + NL);
        } else {
            this.isFirstElementRendered = true;
        }
    }
}
