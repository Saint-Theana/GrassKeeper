package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeOfferingLevelRewardReq {
    @Tag(tag=6) public Integer level = null;
    @Tag(tag=11) public Integer offeringId = null;
}
