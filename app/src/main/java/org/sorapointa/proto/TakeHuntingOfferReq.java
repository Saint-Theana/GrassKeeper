package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class TakeHuntingOfferReq {
    @Tag(tag=14) public HuntingPair huntingPair = null;
    @Tag(tag=4) public Integer cityId = null;
}
