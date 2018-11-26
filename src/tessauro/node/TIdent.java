/* This file was generated by SableCC (http://www.sablecc.org/). */

package tessauro.node;

import tessauro.analysis.*;

@SuppressWarnings("nls")
public final class TIdent extends Token
{
    public TIdent(String text)
    {
        setText(text);
    }

    public TIdent(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIdent(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIdent(this);
    }
}