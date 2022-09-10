package com.thelogicmaster.asquareastray;

import com.tendersaucer.asquareastray.Game;
import com.tendersaucer.asquareastray.ads.DummyAdManager;
import com.tendersaucer.asquareastray.purchase.DummyPurchaseManager;
import com.tendersaucer.asquareastray.purchase.PurchaseManager;
import com.thelogicmaster.switchgdx.SwitchApplication;

public class SwitchLauncher {

	public static void main (String[] arg) {
		DummyPurchaseManager purchaseManager = new DummyPurchaseManager();
		PurchaseManager.getInstance().init(purchaseManager);

		new SwitchApplication(new Game(new DummyAdManager()));
	}
}
