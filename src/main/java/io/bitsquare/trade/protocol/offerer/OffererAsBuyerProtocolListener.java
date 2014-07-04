package io.bitsquare.trade.protocol.offerer;

import com.google.bitcoin.core.TransactionConfidence;
import io.bitsquare.trade.Offer;

public interface OffererAsBuyerProtocolListener
{
    void onOfferAccepted(Offer offer);

    void onDepositTxPublished(String depositTxID);

    void onDepositTxConfirmedInBlockchain();

    void onDepositTxConfirmedUpdate(TransactionConfidence confidence);

    void onPayoutTxPublished(String payoutTxID);
}