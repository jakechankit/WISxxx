package com.wennoddle.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Wis implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		createView();
	}

	private void createView() {
		RootPanel.get("systemMenu").add(createMenu());
		RootPanel.get("systemBody").add(createSampleBody());
		
	}

	private Widget createMenu() {
		Command menuAction = new Command(){

			@Override
			public void execute() {
				RootPanel.get("systemBody").clear();
				RootPanel.get("systemBody").add(createSampleBody());
			}
			
		};
		
		MenuBar submenu1 = new MenuBar(true);
		submenu1.addItem("例單模板", menuAction);
		submenu1.addItem("每日例單", menuAction);
		submenu1.addItem("每日散單", menuAction);
		submenu1.setAutoOpen(true);
		
		MenuBar submenu2 = new MenuBar(true);
		submenu2.addItem("客戶資料", menuAction);
		submenu2.addItem("貨品資料", menuAction);
		submenu2.setAutoOpen(true);
		
		MenuBar submenu3 = new MenuBar(true);
		submenu3.addItem("月結單", menuAction);
		submenu3.addItem("每月營業總額", menuAction);
		submenu3.setAutoOpen(true);
		
		MenuBar menu = new MenuBar();
		menu.addItem("發票管理", submenu1);
		menu.addItem("基本資料模組", submenu2);
		menu.addItem("報表", submenu3);
		menu.setAutoOpen(true);
		return menu;
		
	}
	
	private Widget createSampleBody() {
		CellTable<Product> productList = new CellTable<Product>();
		
		TextColumn<Product> nameColumn = new TextColumn<Product>(){

			@Override
			public String getValue(Product product) {
				return product.getName();
			}
			
		};
		
		TextColumn<Product> priceColumn = new TextColumn<Product>(){

			@Override
			public String getValue(Product product) {
				return product.getPrice();
			}
			
		};
		
		TextColumn<Product> unitColumn = new TextColumn<Product>(){

			@Override
			public String getValue(Product product) {
				return product.getUnit();
			}
			
		};
		
		TextColumn<Product> remarkColumn = new TextColumn<Product>(){

			@Override
			public String getValue(Product product) {
				return product.getPrice();
			}
			
		};
		
		nameColumn.setSortable(true);
		priceColumn.setSortable(true);
		unitColumn.setSortable(true);
		remarkColumn.setSortable(true);
		

		productList.addColumn(nameColumn);
		productList.addColumn(priceColumn);
		productList.addColumn(unitColumn);
		productList.addColumn(remarkColumn);
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("123","123", "123", "123"));
		productList.setRowData(products);
		productList.setWidth("100%", true);
		productList.setRowCount(products.size(), true);
		
		
		return productList;
	}
}
