package org.skyscreamer.yoga.jaxrs.view;

import javax.inject.Singleton;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.skyscreamer.yoga.view.XmlSelectorView;

@Singleton
@Provider
@Produces(MediaType.APPLICATION_XML)
public class XmlSelectorMessageBodyWriter extends AbstractInjectedYogaMessageBodyWriter
{
    public XmlSelectorMessageBodyWriter()
    {
        super( new XmlSelectorView() );
    }
}
