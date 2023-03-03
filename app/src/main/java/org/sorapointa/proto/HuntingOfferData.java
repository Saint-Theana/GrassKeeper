package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingOfferState.*;
import org.sorapointa.proto.HuntingOfferState;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingOfferData {
    @Tag(tag=4) public HuntingPair huntingPair = null;
    @Tag(tag=8) public Integer cityId = null;
    @Tag(tag=1) public Integer state = null;
}
