package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopMcoinProduct.*;
import org.sorapointa.proto.ShopMcoinProduct;
import org.sorapointa.proto.ShopCardProduct.*;
import org.sorapointa.proto.ShopCardProduct;
import org.sorapointa.proto.PlayProduct.*;
import org.sorapointa.proto.PlayProduct;
import org.sorapointa.proto.ShopConcertProduct.*;
import org.sorapointa.proto.ShopConcertProduct;

public class RechargeReq {
    public enum RechargeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4138) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public ShopMcoinProduct mcoinProduct = null;
    @Tag(tag=5) public ShopCardProduct cardProduct = null;
    @Tag(tag=6) public PlayProduct playProduct = null;
    @Tag(tag=3) public ShopConcertProduct concertProduct = null;
}
