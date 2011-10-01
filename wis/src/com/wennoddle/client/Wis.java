package com.wennoddle.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootLayoutPanel;
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
		RootPanel.get("systemBody").add(new HTML("contentPage"));
		
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
		CellTable<Product> productCellTable = new CellTable<Product>(); 
		return null;
	}
}
