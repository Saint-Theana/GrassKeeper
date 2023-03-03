package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class TakeHuntingOfferRsp {
    @Tag(tag=13) public HuntingPair huntingPair = null;
    @Tag(tag=14) public Integer cityId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
