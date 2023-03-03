package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NightCrowGadgetObservationMatchReq {
    @Tag(tag=3) public Integer targetGadgetState = null;
    @Tag(tag=8) public Integer gadgetEntityId = null;
}
