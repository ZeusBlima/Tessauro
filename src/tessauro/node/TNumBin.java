/* This file was generated by SableCC (http://www.sablecc.org/). */

package tessauro.node;

import tessauro.analysis.*;

@SuppressWarnings("nls")
public final class TNumBin extends Token
{
    public TNumBin(String text)
    {
        setText(text);
    }

    public TNumBin(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNumBin(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNumBin(this);
    }
}
