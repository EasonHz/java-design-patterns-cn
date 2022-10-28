package com.hz.state2;

/**
 * 货物的运输状态
 * @author hz
 */
public interface ShipmentState {

	/**
	 * 货物
	 * @return 货物
	 */
	String name();

	/**
	 * 货物行为
	 * @param context
	 */
	void processShipment(ShipmentContext context);
}
