package gui;

import java.awt.Component;

import javax.swing.Popup;
import javax.swing.PopupFactory;


public class TranslucentPopupFactory extends PopupFactory
{
	public Popup getPopup(Component owner, Component contents, int x, int y) throws IllegalArgumentException
	{
		return new TranslucentPopup(owner, contents, x, y);
	}
}
