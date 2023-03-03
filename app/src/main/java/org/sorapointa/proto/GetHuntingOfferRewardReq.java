package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class GetHuntingOfferRewardReq {
    @Tag(tag=6) public Integer cityId = null;
    @Tag(tag=4) public HuntingPair huntingPair = null;
}
