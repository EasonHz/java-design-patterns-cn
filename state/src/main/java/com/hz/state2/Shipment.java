package com.hz.state2;

import lombok.Data;

/**
 * 货物（商品）类
 * @author hz
 */
@Data
public class Shipment {

	protected String orderNumber;
	protected String orderItem;
	protected String shipmentNumber;
	protected Location deliveryAddress;

	public Shipment(String orderNumber, String orderItem, Location deliveryAddress) {
		super();
		this.orderNumber = orderNumber;
		this.orderItem = orderItem;
		this.deliveryAddress = deliveryAddress;
	}

}
