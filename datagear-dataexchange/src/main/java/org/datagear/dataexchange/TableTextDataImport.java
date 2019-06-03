/*
 * Copyright (c) 2018 datagear.org. All Rights Reserved.
 */

package org.datagear.dataexchange;

/**
 * 单表导入。
 * 
 * @author datagear@163.com
 *
 */
public abstract class TableTextDataImport extends TextDataImport
{
	/** 要导入的表名 */
	private String table;

	public TableTextDataImport()
	{
		super();
	}

	public TableTextDataImport(ConnectionFactory connectionFactory, DataFormat dataFormat,
			boolean ignoreInexistentColumn, ExceptionResolve exceptionResolve, boolean nullForIllegalColumnValue,
			String table)
	{
		super(connectionFactory, dataFormat, ignoreInexistentColumn, exceptionResolve, nullForIllegalColumnValue);
		this.table = table;
	}

	public String getTable()
	{
		return table;
	}

	public void setTable(String table)
	{
		this.table = table;
	}
}
