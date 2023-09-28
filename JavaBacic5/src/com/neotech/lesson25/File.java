package com.neotech.lesson25;

public abstract class File {

	/*
	 * Create a class File that will have the following behaviors: open(), edit(),
	 * close() Edit() and close() are implemented methods while open() is abstract.
	 * 
	 * Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
	 * implementation of open() behaviour.
	 * 
	 * Example: to open java file we need Eclipse to open word file we need
	 * Microsoft Word to open pdf file we need Acrobat Reader
	 */
	
	public abstract void open();
	
	public void edit()
	{
		System.out.println("File can be edited");
	}
	
	public void close()
	{
		System.out.println("File can be closed");
	}
	
}

class JavaFile extends File
{

	@Override
	public void open() {
		System.out.println("To open the Java File you need an editor!");
	}
}

class WordFile extends File
{

	@Override
	public void open() {
		System.out.println("To open the Word File you need MS Word");
	}
	
}


class PdfFile extends File
{

	@Override
	public void open() {
		System.out.println("To open the PDF file you need Acrobat Reader!");
	}
	
}


