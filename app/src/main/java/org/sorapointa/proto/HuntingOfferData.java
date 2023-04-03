package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingOfferState.*;
import org.sorapointa.proto.HuntingOfferState;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingOfferData {
    @Tag(tag=11) public Integer state = null;
    @Tag(tag=8) public Integer cityId = null;
    @Tag(tag=13) public HuntingPair huntingPair = null;
}
