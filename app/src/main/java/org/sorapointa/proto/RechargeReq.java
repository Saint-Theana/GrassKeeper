package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayProduct.*;
import org.sorapointa.proto.PlayProduct;
import org.sorapointa.proto.ShopCardProduct.*;
import org.sorapointa.proto.ShopCardProduct;
import org.sorapointa.proto.ShopConcertProduct.*;
import org.sorapointa.proto.ShopConcertProduct;
import org.sorapointa.proto.ShopMcoinProduct.*;
import org.sorapointa.proto.ShopMcoinProduct;

public class RechargeReq {
    @Tag(tag=10) public PlayProduct playProduct = null;
    @Tag(tag=8) public ShopCardProduct cardProduct = null;
    @Tag(tag=14) public ShopMcoinProduct mcoinProduct = null;
    @Tag(tag=7) public ShopConcertProduct concertProduct = null;
}
