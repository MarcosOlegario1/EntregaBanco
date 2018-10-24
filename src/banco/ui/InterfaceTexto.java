package banco.ui;

import java.io.*;
import java.util.Formatter;

abstract class PrintStream extends FilterOutputStream implements Appendable, Closeable {

	private final boolean autoFlush;
	private boolean trouble;
	private Formatter formatter;
	private BufferedWriter textOut;
	private OutputStreamWriter charOut;
	private boolean closing;


	/**
	 * Creates an output stream filter built on top of the specified
	 * underlying output stream.
	 *
	 * @param out the underlying output stream to be assigned to
	 *            the field <tt>this.out</tt> for later use, or
	 *            <code>null</code> if this instance is to be
	 *            created without an underlying stream.
	 * @param autoFlush
	 * @param trouble
	 * @param formatter
	 * @param textOut
	 * @param charOut
	 * @param closing
	 */
	public PrintStream(OutputStream out, boolean autoFlush, boolean trouble, Formatter formatter, BufferedWriter textOut, OutputStreamWriter charOut, boolean closing) {
		super(out);
		this.autoFlush = autoFlush;
		this.trouble = trouble;
		this.formatter = formatter;
		this.textOut = textOut;
		this.charOut = charOut;
		this.closing = closing;
	}

	public abstract void println();
}