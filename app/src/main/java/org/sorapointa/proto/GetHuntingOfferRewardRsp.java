package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class GetHuntingOfferRewardRsp {
    @Tag(tag=14) public HuntingPair huntingPair = null;
    @Tag(tag=3) public Integer cityId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
