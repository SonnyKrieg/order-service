package com.polarbookshop.order_service.event;

public record OrderAcceptedMessage(
        Long orderId
) {
}
